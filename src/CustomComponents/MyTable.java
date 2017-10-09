/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomComponents;

import java.awt.Color;
import java.util.Vector;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author MyPC
 */
public class MyTable extends JPanel{
    
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
    
    public void initMyTable(){
        
        setLayout(new AbsoluteLayout());
        setBackground(new Color(255,255,255));
        
        title = new Title();
        
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
}

