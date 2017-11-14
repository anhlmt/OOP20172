/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MediaOne.View.Components;

import java.awt.Color;
import java.util.Vector;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class MyTable extends JPanel{
    
    public Row clazz;
   
    public Title title;
    
    public int RANGE_TITLE_TO_CONTENT = 40;
    public int V_GAP = 5;
    
    public int width_in_parent;
    public int delta_width = 0;
    
    private int rowSoLuong;
    
    public Vector rows = new Vector();
    
    public MyTable(){
        rowSoLuong = 0;
        initMyTable();
    }
    public MyTable(String[] a , int[] b){
        rowSoLuong = 0;
        initMyTable(a,b);
    }
    
    public void initMyTable(){  
        setLayout(new AbsoluteLayout());
        setBackground(new Color(255,255,255));
        title = new Title();
    }
    public void initMyTable(String[] a , int[] b){  
        setLayout(new AbsoluteLayout());
        setBackground(new Color(255,255,255));
        title = new Title(a,b);
        addTitle();
        setWidthInParent();
    }
    
    public void addTitle(){
        add(title, new AbsoluteConstraints(0, 0, title.totalWidth + title.extraWidth, title.TITLE_HEIGHT));
    }
    
    public Vector getData(){
        return rows;
    }
    public void setData(Vector data){
        
    }

    public int getRowSoLuong() {
        return rowSoLuong;
    }

    public void setRowSoLuong(int rowSoLuong) {
        this.rowSoLuong = rowSoLuong;
    }
    
    public void setWidthInParent(){
        this.width_in_parent = title.width_in_parent + delta_width;
    }
    public void updateGUI(){
        revalidate();
        repaint();
    }
    
    public void addRow(Row row){
        int posX, posY;
        posX = 0;
        posY = RANGE_TITLE_TO_CONTENT + getRowSoLuong()*(row.ROW_HEIGHT+V_GAP);
        add(row ,new AbsoluteConstraints(posX, posY, row.totalWidth + row.extraWidth, row.ROW_HEIGHT));
        rows.add(row);
        setRowSoLuong(getRowSoLuong()+1);
        updateGUI();
    }
    public void  generateRow(Row row,int index){
        int posX, posY;
        posX = 0;
        posY = RANGE_TITLE_TO_CONTENT + index*(row.ROW_HEIGHT + V_GAP);
        add(row ,new AbsoluteConstraints(posX, posY, row.totalWidth + row.extraWidth, row.ROW_HEIGHT));
    }
    public void deleteRow(){
        Row[] temp =null;
        temp = new Row[getRowSoLuong()];
        for(int i = 0; i<temp.length;i++){
            temp[i] = (Row)rows.elementAt(i);
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
            generateRow((Row) rows.elementAt(i), i);
        }
        updateGUI();
    }
    public void deleteAllRow(){
        Row[] temp =null;
        temp = new Row[getRowSoLuong()];
        for(int i = 0; i<temp.length;i++){
            temp[i] = (Row)rows.elementAt(i);
        }
        rows.removeAllElements();
        setRowSoLuong(0);
        for(int i = 0; i<temp.length;i++){
            remove(temp[i]);
        }
        revalidate();
        repaint();
    }
    public boolean isMissingInfo(){
        if(getRowSoLuong() == 0) return false;
        else{
            Row a = (Row)rows.lastElement();;
            if(a.isRowMissingInfo()) return true;
            return false;
        }
    }
    public int quantumOfChecked(){
        int temp = 0;
        Row row = null;
        for(int i = 0; i < getRowSoLuong(); i++){
            row = (Row) rows.elementAt(i);
            if(row.checked) temp++;
        }
        return temp;
    }
}

