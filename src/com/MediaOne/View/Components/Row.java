/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MediaOne.View.Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;



public class Row extends JPanel{
    
    
    public JCheckBox chkbox;
    public boolean checked;
    public JSeparator sep;
    public JComponent[] components = new JComponent[8];
    public int componentsIndex ;
    
    public int width_in_parent ;        
    public int totalWidth;
    public int extraWidth = 0;
    
    public static int ROW_HEIGHT = 27;
    public static int ROW_CONTENT_HEIGHT = 25;
    public static int H_GAP = 10;
    public static int CHECK_BOX_WIDTH = 40;
    public static int SEPARATOR_HEIGHT = 5;
    public int lastPosX = -H_GAP;
    
    public Row(){
        initRow();
    }
    public Row(JComponent[] a, int[] b){
        initRow(a,b);
    }
    
    public void initRow(){
        checked = false;
        setLayout(new AbsoluteLayout());
        setBackground(new Color(255,255,255));
        
        chkbox = new JCheckBox();
        sep = new JSeparator();
        
        chkbox.setFont(new Font("Segoe UI Semibold", 1, 10));
        chkbox.setHorizontalAlignment(SwingConstants.CENTER);
        chkbox.setVerticalAlignment(SwingConstants.TOP);
        chkbox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                checked = chkbox.isSelected();
                setHighlight(checked);
            }
        });
        addCheckBox();
        sep.setForeground(new Color(0, 255, 255));
        addSeparator();    
    }
    
    public void initRow(JComponent[] a,  int[] b){
        initRow();
        for(int i = 0; i < a.length; i++){
            addComponent(a[i], b[i]);
        }
    }
    
    public void addCheckBox(){
        add(chkbox, new AbsoluteConstraints(lastPosX + H_GAP, 0, CHECK_BOX_WIDTH, 25));
    }
    public void updateCheckBox(){
        remove(chkbox);
        addCheckBox();
        revalidate();
        repaint();
    }
    
    public void addSeparator(){
        add(sep, new AbsoluteConstraints(0, ROW_CONTENT_HEIGHT, lastPosX + H_GAP + CHECK_BOX_WIDTH, SEPARATOR_HEIGHT));
    }
    public void updateSeparator(){
        remove(sep);
        addSeparator();
        revalidate();
        repaint();
    }
    
    public JComponent initComponent(JComponent com){
        com.setBorder(null);
        com.setFont(new Font("Segoe UI Semibold", 0, 11));
        if(com instanceof JTextField){
            ((JTextField)com).setHorizontalAlignment(SwingConstants.CENTER);
        }
        return com;
    }
    
    public void addComponent(JComponent com, int comWidth){
        com = initComponent(com);
        add(com, new AbsoluteConstraints(lastPosX + H_GAP, 0, comWidth, ROW_CONTENT_HEIGHT));
        lastPosX = lastPosX + H_GAP + comWidth;
        totalWidth = lastPosX + H_GAP + CHECK_BOX_WIDTH;
        updateWidth();
        components[componentsIndex] = com;
        componentsIndex++;
        updateCheckBox();
        updateSeparator();
        revalidate();
        repaint();
    }
    
    public boolean isRowMissingInfo(){
        for(int i = 0; i < componentsIndex; i++){
            if(((JTextField)components[i]).getText().equals("")){
                return true;
            }
        }
        return false;
    }
    
    public void setHighlight(boolean flag){
        if(flag){
            remove(sep);
            setBorder(BorderFactory.createLineBorder(Color.RED));
        }else{
            addSeparator();
            setBorder(null);
        }
        revalidate();
        repaint();
    }
    
    public void updateWidth(){
        width_in_parent = totalWidth + extraWidth;
    }
    
    public void updateGUI(){
        revalidate();
        repaint();
    }
}
