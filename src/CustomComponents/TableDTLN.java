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
public class TableDTLN extends MyTable{
    
    
    
    public TableDTLN(){
        super();
        initTableDTLN();
    }
    
    public void initTableDTLN(){
        title.addTitle("Ngày", RowDTLN.NGAY_WIDTH);
        title.addTitle("Doanh thu", RowDTLN.DOANH_THU_WIDTH);
        title.addTitle("Lợi nhuận", RowDTLN.LOI_NHUAN_WIDTH);
        title.addTitle("Check", Row.CHECK_BOX_WIDTH);
        addTitle();
        setWidthInParent();
    }
    
    public void addRow(){
        RowDTLN row=new RowDTLN();
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
        RowDTLN[] temp = new RowDTLN[getRowSoLuong()];
        for(int i = 0; i<temp.length;i++){
            temp[i] = (RowDTLN)rows.elementAt(i);
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
            generateRow((RowDTLN)rows.elementAt(i), i);
        }
        revalidate();
        repaint();
    }
    
    public void deleteAllRow(){
        RowDTLN[] temp = new RowDTLN[getRowSoLuong()];
        for(int i = 0; i<temp.length;i++){
            temp[i] = (RowDTLN)rows.elementAt(i);
        }
        rows.removeAllElements();
        setRowSoLuong(0);
        for(int i = 0; i<temp.length;i++){
            remove(temp[i]);
        }
        revalidate();
        repaint();
    }
    
    public void  generateRow(RowDTLN row,int index){
        int posX, posY;
        posX = 0;
        posY = RANGE_TITLE_TO_CONTENT + index*(row.ROW_HEIGHT + V_GAP);
        add(row ,new AbsoluteConstraints(posX, posY, row.totalWidth + row.extraWidth, row.ROW_HEIGHT));
    }
    
    public boolean isMissingInfo(){
        if(getRowSoLuong() == 0) return false;
        else{
        RowDTLN a = (RowDTLN)rows.lastElement();
        if(a.isRowMissingInfo()) return true;
        return false;
        }
    }
    
    public int quantumOfChecked(){
        int temp = 0;
        RowDTLN row = new RowDTLN();
        for(int i = 0; i < getRowSoLuong(); i++){
            row = (RowDTLN) rows.elementAt(i);
            if(row.checked) temp++;
        }
        return temp;
    }
}
