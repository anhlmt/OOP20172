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

public class DoanhThuLoiNhuan extends javax.swing.JPanel {

    
    TableDTLN tb = new TableDTLN();
    public int width_in_parent = 900;
    
    public DoanhThuLoiNhuan() {
        initComponents();
        int a;
        a = (width_in_parent - tb.width_in_parent)/2;
        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sc.setBorder(null);
        add(sc, new AbsoluteConstraints( a, 150, tb.width_in_parent+100, 300));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_xoa = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doanh thu & Lợi nhuận");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 300, -1));

        btn_xoa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_xoa.setLabel("Xem biểu đồ");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 200, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        JOptionPane.showMessageDialog(this, "Nếu còn thời gian thì làm sau =))");
    }//GEN-LAST:event_btn_xoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
