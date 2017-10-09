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
public class TableNhapHang extends MyTable{
    
    
    
    public TableNhapHang(){
        super();
        initTableNhapHang();
    }
    
    public void initTableNhapHang(){
        title.addTitle("ID", RowBanHang.ID_WIDTH);
        title.addTitle("Tên Sản Phẩm", RowBanHang.TEN_SAN_PHAM_WIDTH);
        title.addTitle("Giá mua", RowBanHang.GIA_BAN_WIDTH);
        title.addTitle("Số lượng", RowBanHang.SO_LUONG_WIDTH);
        title.addTitle("Thành tiền", RowBanHang.THANH_TIEN_WIDTH);
        title.addTitle("Check", Row.CHECK_BOX_WIDTH);
        addTitle();
        setWidthInParent();
    }
    
    public void addRow(){
        RowBanHang row=new RowBanHang();
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
        RowBanHang[] temp = new RowBanHang[getRowSoLuong()];
        for(int i = 0; i<temp.length;i++){
            temp[i] = (RowBanHang)rows.elementAt(i);
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
            generateRow((RowBanHang)rows.elementAt(i), i);
        }
        revalidate();
        repaint();
    }
    
    public void deleteAllRow(){
        RowBanHang[] temp = new RowBanHang[getRowSoLuong()];
        for(int i = 0; i<temp.length;i++){
            temp[i] = (RowBanHang)rows.elementAt(i);
        }
        rows.removeAllElements();
        setRowSoLuong(0);
        for(int i = 0; i<temp.length;i++){
            remove(temp[i]);
        }
        revalidate();
        repaint();
    }
    
    public void  generateRow(RowBanHang row,int index){
        int posX, posY;
        posX = 0;
        posY = RANGE_TITLE_TO_CONTENT + index*(row.ROW_HEIGHT + V_GAP);
        add(row ,new AbsoluteConstraints(posX, posY, row.totalWidth + row.extraWidth, row.ROW_HEIGHT));
    }
    
    public boolean isMissingInfo(){
        if(getRowSoLuong() == 0) return false;
        else{
        RowBanHang a = (RowBanHang)rows.lastElement();
        if(a.isRowMissingInfo()) return true;
        return false;
        }
    }
    public int quantumOfChecked(){
        int temp = 0;
        RowBanHang row = new RowBanHang();
        for(int i = 0; i < getRowSoLuong(); i++){
            row = (RowBanHang) rows.elementAt(i);
            if(row.checked) temp++;
        }
        return temp;
    }
}
