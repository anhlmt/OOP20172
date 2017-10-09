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
public class RowChiPhi extends Row{
    public JTextField tf_Ngay,tf_ChiPhi,tf_ThanhTien;
    
    public static int NGAY_WIDTH = 100;
    public static int CHI_PHI_WIDTH = 200;
    public static int THANH_TIEN_WIDTH = 100;
    
    public RowChiPhi(){
        super();
        initRowChiPhi();
    }
    
    public void initRowChiPhi(){
        
        tf_Ngay=new JTextField();
        tf_ChiPhi=new JTextField();
        tf_ThanhTien=new JTextField();        
        
        tf_Ngay.setBorder(null);
        tf_Ngay.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_Ngay.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_Ngay, NGAY_WIDTH);
        
        tf_ChiPhi.setBorder(null);
        tf_ChiPhi.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_ChiPhi.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_ChiPhi, CHI_PHI_WIDTH);
        
        tf_ThanhTien.setBorder(null);
        tf_ThanhTien.setFont(new Font("Segoe UI Semibold", 0, 11));
        tf_ThanhTien.setHorizontalAlignment(SwingConstants.CENTER);
        addComponent(tf_ThanhTien, THANH_TIEN_WIDTH);
        
    }
    
}
