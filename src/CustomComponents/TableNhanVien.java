/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomComponents;


import java.util.Vector;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author MyPC
 */
public class TableNhanVien extends MyTable{
    
    
    
    public TableNhanVien(){
        super();
        initTableNhanVien();
    }
    
    public void initTableNhanVien(){
        title.addTitle("ID", RowNhanVien.ID_WIDTH);
        title.addTitle("Tên Nhân Viên", RowNhanVien.TEN_NHAN_VIEN_WIDTH);
        title.addTitle("Level", RowNhanVien.LEVEL_WIDTH);
        title.addTitle("Lương/Giờ", RowNhanVien.LUONG_WIDTH);
        title.addTitle("Số Giờ", RowNhanVien.HOURS_WIDTH);
        title.addTitle("Tổng lương", RowNhanVien.TONG_LUONG_WIDTH);
        title.addTitle("Check", Row.CHECK_BOX_WIDTH);
        addTitle();
        setWidthInParent();
    }
    
    public void addRow(){
        RowNhanVien row=new RowNhanVien();
        int posX, posY;
        posX = 0;
        posY = RANGE_TITLE_TO_CONTENT + getRowSoLuong()*(row.ROW_HEIGHT+V_GAP);
        add(row ,new AbsoluteConstraints(posX, posY, row.totalWidth + row.extraWidth, row.ROW_HEIGHT));
        rows.add(row);
        setRowSoLuong(getRowSoLuong()+1);
        updateGUI();
    }
    
    public void deleteRow(){
        RowNhanVien[] temp = new RowNhanVien[getRowSoLuong()];
        for(int i = 0; i<temp.length;i++){
            temp[i] = (RowNhanVien)rows.elementAt(i);
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
        updateTable();
    }
    
    public void deleteAllRow(){
        RowNhanVien[] temp = new RowNhanVien[getRowSoLuong()];
        for(int i = 0; i<temp.length;i++){
            temp[i] = (RowNhanVien)rows.elementAt(i);
        }
        rows.removeAllElements();
        setRowSoLuong(0);
        for(int i = 0; i<temp.length;i++){
            remove(temp[i]);
        }
        updateGUI();
    }
    
    public void  generateRow(RowNhanVien row,int index){
        int posX, posY;
        posX = 0;
        posY = RANGE_TITLE_TO_CONTENT + index*(row.ROW_HEIGHT + V_GAP);
        add(row ,new AbsoluteConstraints(posX, posY, row.totalWidth + row.extraWidth, row.ROW_HEIGHT));
    }
    
    public boolean isMissingInfo(){
        if(getRowSoLuong() == 0) return false;
        else{
        RowNhanVien a = (RowNhanVien)rows.lastElement();
        if(a.isRowMissingInfo()) return true;
        return false;
        }
    }
    
    public void setData(Vector data){
        setRowSoLuong(data.size());
        for(int i = 0; i < data.size(); i++){
            rows.add(data.elementAt(i));
        }
        updateTable();
    }
    
    public void updateTable(){
        for(int i = 0; i<getRowSoLuong();i++){
            generateRow((RowNhanVien)rows.elementAt(i), i);
        }
        updateGUI();
    }
    
    public int quantumOfChecked(){
        int temp = 0;
        RowNhanVien row = new RowNhanVien();
        for(int i = 0; i < getRowSoLuong(); i++){
            row = (RowNhanVien) rows.elementAt(i);
            if(row.checked) temp++;
        }
        return temp;
    }
}
