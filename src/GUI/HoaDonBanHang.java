/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CustomComponents.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class HoaDonBanHang extends javax.swing.JPanel {

    
    TableBanHang tb = new TableBanHang();
    
    public HoaDonBanHang() {
        initComponents();
        lb_sum_money.setVisible(false);
        int a;
        a = (900 - tb.width_in_parent)/2;
        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sc.setBorder(null);
        add(sc, new AbsoluteConstraints( a, 150, tb.width_in_parent+100, 300));
        generateDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tf_date = new javax.swing.JLabel();
        lb_sum_money = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hóa đơn bán hàng");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 300, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Thời gian :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Mã hóa đơn :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, 20));

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 100, 50));

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 100, 50));

        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton3.setText("Làm mới");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 100, 50));

        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton4.setText("Tính tiền");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 100, 50));

        jButton5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton5.setText("Thanh toán");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 100, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 150, 20));

        tf_date.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tf_date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(tf_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 150, 20));

        lb_sum_money.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lb_sum_money.setForeground(new java.awt.Color(204, 0, 0));
        lb_sum_money.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_sum_money.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 4));
        add(lb_sum_money, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 200, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(tb.isMissingInfo()){
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin sản phẩm");
        }else{
            tb.addRow();
            lb_sum_money.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(tb.quantumOfChecked() > 0){
        tb.deleteRow();
        lb_sum_money.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Chưa chọn sản phẩm cần xóa");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        generateDate();
        tb.deleteAllRow();
        lb_sum_money.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(tb.getRowSoLuong() == 0){
            JOptionPane.showMessageDialog(this, "Chưa có sản phẩm nào !");
        }else{
            if(tb.isMissingInfo()){
                JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin sản phẩm");
            }else{
                int sum = 0, bonus;
                String temp;
                RowBanHang row = new RowBanHang();
                for(int i = 0; i < tb.getRowSoLuong(); i++){
                    row = (RowBanHang) tb.rows.elementAt(i);
                    temp = row.tf_ThanhTien.getText();
                    bonus = Integer.parseInt(temp);
                    sum += bonus;
                }
                lb_sum_money.setText(Integer.toString(sum));
                lb_sum_money.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Thêm Hóa Đơn vào CSDL
        
    }//GEN-LAST:event_jButton5ActionPerformed

    public void generateDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String str_date = dateFormat.format(date);
        tf_date.setText(str_date);
        lb_sum_money.setVisible(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_sum_money;
    private javax.swing.JLabel tf_date;
    // End of variables declaration//GEN-END:variables
}
