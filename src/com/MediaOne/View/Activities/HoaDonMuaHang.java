/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MediaOne.View.Activities;

import com.MediaOne.View.Components.MyTable;
import com.MediaOne.View.Config.Config;
import com.MediaOne.View.Components.Row;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class HoaDonMuaHang extends javax.swing.JPanel {

    MyTable tb = new MyTable();
    int status = 1;
    Row tong;
    
    public HoaDonMuaHang() {
        initComponents();
        //
        tong = new Row();
        tong = initRow();
        tb = new MyTable(new String[]{"ID","Tên Sản Phẩm","Giá bán","Số lượng","Thành tiền","Check"},new int[]{Config.ID_WIDTH,Config.TEN_SAN_PHAM_WIDTH,Config.GIA_MUA_WIDTH,Config.SO_LUONG_WIDTH,Config.THANH_TIEN_WIDTH,Row.CHECK_BOX_WIDTH});
        lb_status_ThanhToan.setVisible(false);
        //
        int a;
        a = (900 - tb.width_in_parent)/2;
        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sc.setBorder(null);
        add(sc, new AbsoluteConstraints( a, 150, tb.width_in_parent+100, 300));
        generateDate();
    }

    public Row initRow(){
        Row row = new Row(new JComponent[]{new JTextField(),new JTextField(),new JTextField(),new JTextField(),new JTextField()}, new int[]{Config.ID_WIDTH,Config.TEN_SAN_PHAM_WIDTH,Config.GIA_MUA_WIDTH,Config.SO_LUONG_WIDTH,Config.THANH_TIEN_WIDTH});
        return row;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        them_btn = new javax.swing.JButton();
        xoa_btn = new javax.swing.JButton();
        lammoi_btn = new javax.swing.JButton();
        tinhtien_btn = new javax.swing.JButton();
        thanhtoan_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tf_date = new javax.swing.JLabel();
        lb_status_ThanhToan = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hóa đơn mua hàng");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 300, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Thời gian :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Mã hóa đơn :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, 20));

        them_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        them_btn.setText("Thêm");
        them_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                them_btnActionPerformed(evt);
            }
        });
        add(them_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 100, 50));

        xoa_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        xoa_btn.setText("Xóa");
        xoa_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoa_btnActionPerformed(evt);
            }
        });
        add(xoa_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 100, 50));

        lammoi_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lammoi_btn.setText("Làm mới");
        lammoi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lammoi_btnActionPerformed(evt);
            }
        });
        add(lammoi_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 100, 50));

        tinhtien_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tinhtien_btn.setText("Tính tiền");
        tinhtien_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhtien_btnActionPerformed(evt);
            }
        });
        add(tinhtien_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 100, 50));

        thanhtoan_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        thanhtoan_btn.setText("Thanh toán");
        thanhtoan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thanhtoan_btnActionPerformed(evt);
            }
        });
        add(thanhtoan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 100, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 150, 20));

        tf_date.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tf_date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(tf_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 150, 20));

        lb_status_ThanhToan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lb_status_ThanhToan.setForeground(new java.awt.Color(204, 0, 0));
        lb_status_ThanhToan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_status_ThanhToan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 4));
        add(lb_status_ThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 200, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void them_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_them_btnActionPerformed
        if(tb.isMissingInfo()){
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin sản phẩm");
        }else{
            Row row = initRow();
            tb.addRow(row);
        }
    }//GEN-LAST:event_them_btnActionPerformed

    private void xoa_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoa_btnActionPerformed
        if(tb.quantumOfChecked() > 0){
        tb.deleteRow();
        }else{
            JOptionPane.showMessageDialog(this, "Chưa chọn sản phẩm cần xóa");
        }
    }//GEN-LAST:event_xoa_btnActionPerformed

    private void lammoi_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lammoi_btnActionPerformed
        generateDate();
        tb.deleteAllRow();
        initConfig();
    }//GEN-LAST:event_lammoi_btnActionPerformed

    private void tinhtien_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhtien_btnActionPerformed
        if(status == 1){
            if(tb.getRowSoLuong() == 0){
            JOptionPane.showMessageDialog(this, "Chưa có sản phẩm nào !");
            }else{
                if(tb.isMissingInfo()){
                    JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin sản phẩm");
                }else{
                    activeTinhTien();
                    status = 2;
                }
            }  
        }else{
            returnTinhTien();
            status = 1;
            }  
                             
    }//GEN-LAST:event_tinhtien_btnActionPerformed

    private void thanhtoan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thanhtoan_btnActionPerformed
        if(status == 1){
            JOptionPane.showMessageDialog(this, "Chưa tính tiền !");
        }else{
            // Thông báo            
                JOptionPane.showMessageDialog(this, "Đã thanh toán !");
                lb_status_ThanhToan.setText("Đã Thanh Toán");
                lb_status_ThanhToan.setVisible(true);
                thanhtoan_btn.setVisible(false);
                lammoi_btn.setVisible(true);
                tinhtien_btn.setVisible(false);
            // Thêm Hóa Đơn vào CSDL  
        }     
    }//GEN-LAST:event_thanhtoan_btnActionPerformed

    public void generateDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String str_date = dateFormat.format(date);
        tf_date.setText(str_date);
        lb_status_ThanhToan.setVisible(false);
    }
    
    public void initConfig(){
        status = 1;
        them_btn.setVisible(true);
        xoa_btn.setVisible(true);
        lammoi_btn.setVisible(true);
        tinhtien_btn.setText("Tính tiền");
        tinhtien_btn.setVisible(true);
        thanhtoan_btn.setVisible(true);
    }
    
    public void activeTinhTien(){
                tinhtien_btn.setText("Quay lại");
                them_btn.setVisible(false);
                xoa_btn.setVisible(false);
                lammoi_btn.setVisible(false);
                
                int sum = 0, bonus;
                String temp;
                Row row = new Row();
                for(int i = 0; i < tb.getRowSoLuong(); i++){
                    row = (Row) tb.rows.elementAt(i);
                    if(row.checked){
                        temp = ((JTextField)row.components[4]).getText();
                        bonus = Integer.parseInt(temp);
                        sum += bonus;
                    }
                    row.chkbox.setVisible(false);
                }
                final int sum_final = sum;
                
                tong.chkbox.setVisible(false);
                ((JTextField)tong.components[1]).setText("Tổng tiền");
                ((JTextField)tong.components[1]).setEditable(false);
                ((JTextField)tong.components[4]).setText(Integer.toString(sum));
                ((JTextField)tong.components[4]).setEditable(false);
                tb.addRow(tong);
    }    
    public void returnTinhTien(){
                tinhtien_btn.setText("Tính tiền");
                them_btn.setVisible(true);
                xoa_btn.setVisible(true);
                lammoi_btn.setVisible(true);
                tb.remove(tong);
                tb.updateGUI();
                
                int size;
                size = tb.rows.size();
                tb.rows.remove(size-1);
                tb.setRowSoLuong(tb.rows.size());
                Row row = new Row();
                for(int i = 0; i<tb.getRowSoLuong();i++){
                    row = (Row) tb.rows.elementAt(i);
                    tb.generateRow(row, i);
                    row.chkbox.setVisible(true);
                }
                revalidate();
                repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton lammoi_btn;
    private javax.swing.JLabel lb_status_ThanhToan;
    private javax.swing.JLabel tf_date;
    private javax.swing.JButton thanhtoan_btn;
    private javax.swing.JButton them_btn;
    private javax.swing.JButton tinhtien_btn;
    private javax.swing.JButton xoa_btn;
    // End of variables declaration//GEN-END:variables
}
