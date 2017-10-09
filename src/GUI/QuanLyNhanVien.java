/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CustomComponents.*;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class QuanLyNhanVien extends javax.swing.JPanel {

    
    TableNhanVien tb = new TableNhanVien();
    
    public QuanLyNhanVien() {
        initComponents();
        int a;
        a = (900 - tb.width_in_parent)/2;
        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sc.setBorder(null);
        add(sc, new AbsoluteConstraints( a, 150, tb.width_in_parent+100, 300));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý nhân viên");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 300, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton1.setText("<html>Thêm<br />nhân viên</html>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 100, 50));

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton2.setText("<html>Xóa<br />nhân viên</html>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 100, 50));

        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton3.setText("Trả lương");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 100, 50));

        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton4.setText("Thăng chức");
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 100, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(tb.isMissingInfo()){
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin nhân viên");
        }else{
            tb.addRow();
        }
        //Thêm vào CSDL
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(tb.quantumOfChecked() > 0){
        tb.deleteRow();
        }else{
            JOptionPane.showMessageDialog(this, "Chưa chọn nhân viên cần xóa");
        }
        //Xóa khỏi CSDL
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(tb.quantumOfChecked() > 0){
        RowNhanVien row = new RowNhanVien();
        for(int i = 0; i < tb.getRowSoLuong(); i++){
            row = (RowNhanVien) tb.rows.elementAt(i);
            if(row.checked){
            row.tf_Hours.setText("0");
            row.tf_TongLuong.setText("0");
            tb.rows.remove(i);
            tb.rows.add(i, row);
            }
        }
        //Ghi vào CSDL
        
        }else{
            JOptionPane.showMessageDialog(this, "Chưa chọn nhân viên cần trả lương");
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
