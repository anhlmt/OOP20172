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
public class RowDTLN extends Row{
    public JTextField tf_Ngay,tf_DoanhThu,tf_LoiNhuan;
    
    public static int NGAY_WIDTH = 100;
    public static int DOANH_THU_WIDTH = 200;
    public static int LOI_NHUAN_WIDTH = 200;
    
    public RowDTLN(){
        super();
        initRowDTLN();
    }
    
    public void initRowDTLN(){
        
        tf_Ngay=new JTextField();
        tf_DoanhThu=new JTextField();
        tf_LoiNhuan=new JTextField();        
        
        tf_Ngay.setBorder(null);
        tf_Ngay.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_Ngay.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_Ngay, NGAY_WIDTH);
        
        tf_DoanhThu.setBorder(null);
        tf_DoanhThu.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_DoanhThu.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_DoanhThu, DOANH_THU_WIDTH);
        
        tf_LoiNhuan.setBorder(null);
        tf_LoiNhuan.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_LoiNhuan.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_LoiNhuan, LOI_NHUAN_WIDTH);
        
    }
    
}
