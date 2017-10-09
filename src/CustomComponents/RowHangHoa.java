/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomComponents;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author MyPC
 */
public class RowHangHoa extends Row{
    public JTextField tf_ID,tf_Ten,tf_GiaBan,tf_GiaMua,tf_SoLuong;
    
    public static int ID_WIDTH = 80;
    public static int TEN_SAN_PHAM_WIDTH = 200;
    public static int GIA_BAN_WIDTH = 100;
    public static int GIA_MUA_WIDTH = 100;
    public static int SO_LUONG_WIDTH = 80;    
    
    public RowHangHoa(){
        super();
        initRowHangHoa();
    }
    
    public RowHangHoa(String newID, String newTen, int newGiaBan, int newGiaMua, int newSoLuong){
        super();
        initRowHangHoa();
        tf_ID.setText(newID);
        tf_Ten.setText(newTen);
        tf_GiaBan.setText(Integer.toString(newGiaBan));
        tf_GiaMua.setText(Integer.toString(newGiaMua));
        tf_SoLuong.setText(Integer.toString(newSoLuong));
        chkbox.setVisible(false);
    }
    
    public void initRowHangHoa(){
        
        tf_ID=new JTextField();
        tf_Ten=new JTextField();
        tf_GiaBan=new JTextField();
        tf_SoLuong=new JTextField();
        tf_GiaMua=new JTextField();
        
        tf_ID.setBorder(null);
        tf_ID.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_ID.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_ID, ID_WIDTH);
        
        tf_Ten.setBorder(null);
        tf_Ten.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_Ten.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_Ten, TEN_SAN_PHAM_WIDTH);
        
        tf_GiaBan.setBorder(null);
        tf_GiaBan.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_GiaBan.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_GiaBan, GIA_BAN_WIDTH);
        
        tf_GiaMua.setBorder(null);
        tf_GiaMua.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_GiaMua.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_GiaMua, GIA_MUA_WIDTH);
        
        tf_SoLuong.setEditable(false);
        tf_SoLuong.setBorder(null);
        tf_SoLuong.setFont(new Font("Segoe UI Semibold", 1, 11));
        tf_SoLuong.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_SoLuong, SO_LUONG_WIDTH);   
        
        
    }
}
