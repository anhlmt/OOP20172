/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomComponents;


import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author MyPC
 */
public class TableHangHoa extends MyTable{
    
    
    
    public TableHangHoa(){
        super();
        initTableHangHoa();
    }
    
    public void initTableHangHoa(){
        title.addTitle("ID", RowHangHoa.ID_WIDTH);
        title.addTitle("Tên Sản Phẩm", RowHangHoa.TEN_SAN_PHAM_WIDTH);
        title.addTitle("Giá bán", RowHangHoa.GIA_BAN_WIDTH);
        title.addTitle("Giá mua", RowHangHoa.GIA_MUA_WIDTH);
        title.addTitle("Số lượng", RowHangHoa.SO_LUONG_WIDTH);
        title.addTitle("Check", RowHangHoa.CHECK_BOX_WIDTH);
        addTitle();
        setWidthInParent();
    }
    
    public void addRow(){
        RowHangHoa row=new RowHangHoa();
        int posX, posY;
        posX = 0;
        posY = RANGE_TITLE_TO_CONTENT + getRowSoLuong()*(row.ROW_HEIGHT+V_GAP);
        add(row ,new AbsoluteConstraints(posX, posY, row.totalWidth + row.extraWidth, row.ROW_HEIGHT));
        rows.add(row);
        setRowSoLuong(getRowSoLuong()+1);
        revalidate();
        repaint();
    }
    
    public void deleteRow(){
        RowHangHoa[] temp = new RowHangHoa[getRowSoLuong()];
        for(int i = 0; i<temp.length;i++){
            temp[i] = (RowHangHoa)rows.elementAt(i);
        }
        int removedCount = 0;
        for(int i = 0; i<temp.length;i++){
            if(temp[i].checked){
                rows.remove(i-removedCount);
                removedCount++;                
            }
        }
        for(int i = 0; i<temp.length;i++){
            remove(temp[i]);
        }
        setRowSoLuong(rows.size());
        for(int i = 0; i<getRowSoLuong();i++){
            generateRow((RowHangHoa)rows.elementAt(i), i);
        }
        revalidate();
        repaint();
    }
    
    public void deleteAllRow(){
        RowHangHoa[] temp = new RowHangHoa[getRowSoLuong()];
        for(int i = 0; i<temp.length;i++){
            temp[i] = (RowHangHoa)rows.elementAt(i);
        }
        rows.removeAllElements();
        setRowSoLuong(0);
        for(int i = 0; i<temp.length;i++){
            remove(temp[i]);
        }
        revalidate();
        repaint();
    }
    
    public void  generateRow(RowHangHoa row,int index){
        int posX, posY;
        posX = 0;
        posY = RANGE_TITLE_TO_CONTENT + index*(row.ROW_HEIGHT + V_GAP);
        add(row ,new AbsoluteConstraints(posX, posY, row.totalWidth + row.extraWidth, row.ROW_HEIGHT));
    }
    
    public boolean isMissingInfo(){
        if(getRowSoLuong() == 0) return false;
        else{
        RowHangHoa a = (RowHangHoa)rows.lastElement();
        if(a.isRowMissingInfo()) return true;
        return false;
        }
    }
    
    public int quantumOfChecked(){
        int temp = 0;
        RowHangHoa row = new RowHangHoa();
        for(int i = 0; i < getRowSoLuong(); i++){
            row = (RowHangHoa) rows.elementAt(i);
            if(row.checked) temp++;
        }
        return temp;
    }
}
