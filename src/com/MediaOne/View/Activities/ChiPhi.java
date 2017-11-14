/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MediaOne.View.Activities;

import com.MediaOne.View.Components.MyTable;
import com.MediaOne.View.Config.Config;
import com.MediaOne.View.Components.Row;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;


public class ChiPhi extends javax.swing.JPanel {
    
    MyTable tb = new MyTable();
    public int width_in_parent = 900;
    
    public ChiPhi() {
        initComponents();
        //
        tb = new MyTable(new String[]{"Ngày","Chi phí","Thành tiền"},new int[]{Config.NGAY_WIDTH,Config.CHI_PHI_WIDTH,Config.THANH_TIEN_WIDTH});
        //
        int a;
        a = (width_in_parent - tb.width_in_parent)/2;
        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sc.setBorder(null);
        add(sc, new AbsoluteConstraints( a, 150, tb.width_in_parent+100, 300));
    }

    public Row initRow(){
        Row row = new Row(new JComponent[]{new JTextField(),new JTextField(),new JTextField()}, new int[]{Config.NGAY_WIDTH,Config.CHI_PHI_WIDTH,Config.THANH_TIEN_WIDTH});
        return row;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chi phí");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 300, -1));

        btn_them.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_them.setText("<html>Thêm<br />chi phí</html>");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 100, 50));

        btn_xoa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_xoa.setText("<html>Xóa<br />chi phí</html>");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 100, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if(tb.isMissingInfo()){
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin chi phí");
        }else{
            Row row = initRow();
            tb.addRow(row);
        }
        // Thêm vào CSDL
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        if(tb.quantumOfChecked() > 0){
        tb.deleteRow();
        }else{
            JOptionPane.showMessageDialog(this, "Chưa chọn chi phí cần xóa");
        }
        //Xóa khỏi CSDL
    }//GEN-LAST:event_btn_xoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
