/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomComponents;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author MyPC
 */
public class RowNhanVien extends Row{
    public JTextField tf_ID,tf_Ten,tf_Level,tf_Luong,tf_Hours,tf_TongLuong;
    
    public static int ID_WIDTH = 80;
    public static int TEN_NHAN_VIEN_WIDTH = 200;
    public static int LEVEL_WIDTH = 100;
    public static int LUONG_WIDTH = 100;
    public static int HOURS_WIDTH = 80;
    public static int TONG_LUONG_WIDTH = 150;
    
    
    public RowNhanVien(){
        super();
        initRowNhanVien();
    }
    
    public RowNhanVien(String newID, String newTen, String newLevel, int newLuong, int newHours, int newTongLuong, boolean isVisibleCheckBox){
        super();
        initRowNhanVien();
        tf_ID.setText(newID);
        tf_Ten.setText(newTen);
        tf_Level.setText(newLevel);
        tf_Luong.setText(Integer.toString(newLuong));
        tf_Hours.setText(Integer.toString(newHours));
        tf_TongLuong.setText(Integer.toString(newTongLuong));
        chkbox.setVisible(isVisibleCheckBox);
    }
    
    public void initRowNhanVien(){
        
        tf_ID=new JTextField();
        tf_Ten=new JTextField();
        tf_Level=new JTextField();
        tf_Luong=new JTextField();
        tf_Hours=new JTextField();
        tf_TongLuong=new JTextField();
        
        tf_ID.setBorder(null);
        tf_ID.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_ID.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_ID, ID_WIDTH);
        
        tf_Ten.setBorder(null);
        tf_Ten.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_Ten.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_Ten, TEN_NHAN_VIEN_WIDTH);
        
        tf_Level.setBorder(null);
        tf_Level.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_Level.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_Level, LEVEL_WIDTH);
        
        tf_Luong.setBorder(null);
        tf_Luong.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_Luong.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_Luong, LUONG_WIDTH);
        
        tf_Hours.setEditable(true);
        tf_Hours.setBorder(null);
        tf_Hours.setFont(new Font("Segoe UI Semibold", 1, 11));
        tf_Hours.setHorizontalAlignment(SwingConstants.CENTER);
        tf_Hours.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                int a = Integer.parseInt(tf_Luong.getText());
                if(!tf_Hours.getText().equals("")){
                    int b = Integer.parseInt(tf_Hours.getText());
                    int c = a * b;
                    tf_TongLuong.setText(Integer.toString(c));
                }else{
                    tf_TongLuong.setText("");
                }
            }
        });
        addComponent(tf_Hours, HOURS_WIDTH);   
        
        tf_TongLuong.setEditable(true);
        tf_TongLuong.setBorder(null);
        tf_TongLuong.setFont(new Font("Segoe UI Semibold", 1, 11));
        tf_TongLuong.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_TongLuong, TONG_LUONG_WIDTH);    
    }
}
