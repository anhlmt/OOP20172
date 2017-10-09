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
public class TableChiPhi extends MyTable{
    
    
    
    public TableChiPhi(){
        super();
        initTableChiPhi();
    }
    
    public void initTableChiPhi(){
        title.addTitle("Ngày", RowChiPhi.NGAY_WIDTH);
        title.addTitle("Chi phí", RowChiPhi.CHI_PHI_WIDTH);
        title.addTitle("Thành tiền", RowChiPhi.THANH_TIEN_WIDTH);
        title.addTitle("Check", Row.CHECK_BOX_WIDTH);
        addTitle();
        setWidthInParent();
    }
    
    public void addRow(){
        RowChiPhi row=new RowChiPhi();
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
        RowChiPhi[] temp = new RowChiPhi[getRowSoLuong()];
        for(int i = 0; i<temp.length;i++){
            temp[i] = (RowChiPhi)rows.elementAt(i);
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
            generateRow((RowChiPhi)rows.elementAt(i), i);
        }
        revalidate();
        repaint();
    }
    
    public void deleteAllRow(){
        RowChiPhi[] temp = new RowChiPhi[getRowSoLuong()];
        for(int i = 0; i<temp.length;i++){
            temp[i] = (RowChiPhi)rows.elementAt(i);
        }
        rows.removeAllElements();
        setRowSoLuong(0);
        for(int i = 0; i<temp.length;i++){
            remove(temp[i]);
        }
        revalidate();
        repaint();
    }
    
    public void  generateRow(RowChiPhi row,int index){
        int posX, posY;
        posX = 0;
        posY = RANGE_TITLE_TO_CONTENT + index*(row.ROW_HEIGHT + V_GAP);
        add(row ,new AbsoluteConstraints(posX, posY, row.totalWidth + row.extraWidth, row.ROW_HEIGHT));
    }
    
    public boolean isMissingInfo(){
        if(getRowSoLuong() == 0) return false;
        else{
        RowChiPhi a = (RowChiPhi)rows.lastElement();
        if(a.isRowMissingInfo()) return true;
        return false;
        }
    }
    
    public int quantumOfChecked(){
        int temp = 0;
        RowChiPhi row = new RowChiPhi();
        for(int i = 0; i < getRowSoLuong(); i++){
            row = (RowChiPhi) rows.elementAt(i);
            if(row.checked) temp++;
        }
        return temp;
    }
}
