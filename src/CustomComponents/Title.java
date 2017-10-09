/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomComponents;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author MyPC
 */
public class Title extends Row{
    
    public int TITLE_HEIGHT = 20;
    
    public Title(){
        super();
        initTitle();
    }
    
    public void initTitle(){
        remove(chkbox);
        remove(sep);
        revalidate();
        repaint();
    }
    
    public void addTitle(String title, int titleWidth){
        JLabel lb = new JLabel(title);
        lb.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        lb.setHorizontalAlignment(SwingConstants.CENTER);
        lb.setText(title);
        lb.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lb, new AbsoluteConstraints(lastPosX + H_GAP, 0, titleWidth, TITLE_HEIGHT));
        lastPosX = lastPosX + H_GAP + titleWidth;
        totalWidth = lastPosX + H_GAP ;
        updateWidth();
        revalidate();
        repaint();
    }
}
