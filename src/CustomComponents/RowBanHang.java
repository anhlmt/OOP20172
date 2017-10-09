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


public class RowBanHang extends Row{
    public JTextField tf_ID,tf_Ten,tf_Gia,tf_SoLuong,tf_ThanhTien;
    
    public static int ID_WIDTH = 80;
    public static int TEN_SAN_PHAM_WIDTH = 200;
    public static int GIA_BAN_WIDTH = 100;
    public static int SO_LUONG_WIDTH = 80;
    public static int THANH_TIEN_WIDTH = 100;
    
    
    public RowBanHang(){
        super();
        initRowBanHang();
    }
    
    public RowBanHang(String newID, String newTen, int newGia, int newSoLuong, int newThanhTien, boolean isVisibleCheckBox){
        super();
        initRowBanHang();
        tf_ID.setText(newID);
        tf_Ten.setText(newTen);
        tf_Gia.setText(Integer.toString(newGia));
        tf_SoLuong.setText(Integer.toString(newSoLuong));
        tf_ThanhTien.setText(Integer.toString(newThanhTien));
        chkbox.setVisible(isVisibleCheckBox);
    }
    
    public void initRowBanHang(){
        
        tf_ID=new JTextField();
        tf_Ten=new JTextField();
        tf_Gia=new JTextField();
        tf_SoLuong=new JTextField();
        tf_ThanhTien=new JTextField();
        
        tf_ID.setBorder(null);
        tf_ID.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_ID.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_ID, ID_WIDTH);
        
        tf_Ten.setBorder(null);
        tf_Ten.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_Ten.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_Ten, TEN_SAN_PHAM_WIDTH);
        
        tf_Gia.setBorder(null);
        tf_Gia.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_Gia.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_Gia, GIA_BAN_WIDTH);
        
        tf_SoLuong.setBorder(null);
        tf_SoLuong.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_SoLuong.setHorizontalAlignment(SwingConstants.CENTER);
        tf_SoLuong.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                int a = Integer.parseInt(tf_Gia.getText());
                if(!tf_SoLuong.getText().equals("")){
                    int b = Integer.parseInt(tf_SoLuong.getText());
                    int c = a * b;
                    tf_ThanhTien.setText(Integer.toString(c));
                }else{
                    tf_ThanhTien.setText("");
                }
            }
        });
        addComponent(tf_SoLuong, SO_LUONG_WIDTH);
        
        tf_ThanhTien.setEditable(false);
        tf_ThanhTien.setBorder(null);
        tf_ThanhTien.setFont(new Font("Segoe UI Semibold", 1, 11));
        tf_ThanhTien.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_ThanhTien, THANH_TIEN_WIDTH);        
    }
}
