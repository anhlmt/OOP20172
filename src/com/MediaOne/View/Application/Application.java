/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MediaOne.View.Application;

import com.MediaOne.View.Activities.ChiPhi;
import com.MediaOne.View.Activities.HoaDonMuaHang;
import com.MediaOne.View.Activities.QuanLyNhanVien;
import com.MediaOne.View.Activities.DoanhThuLoiNhuan;
import com.MediaOne.View.Activities.About;
import com.MediaOne.View.Activities.HoaDonBanHang;
import com.MediaOne.View.Activities.QuanLyHangHoa;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;


public class Application extends javax.swing.JFrame {
    About ab;
    JPanel curr = new JPanel();
    public Application() {
        initComponents();
        ab = new About();
        jPanel1.add(ab, new AbsoluteConstraints(50, 100, 900, 550));
        selectedButton(7);
        curr = ab;
        setLocation(200,0);
        setResizable(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ban_hang = new javax.swing.JLabel();
        nhap_hang = new javax.swing.JLabel();
        san_pham = new javax.swing.JLabel();
        nhan_vien = new javax.swing.JLabel();
        doanhthu_loinhuan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        chi_phi = new javax.swing.JLabel();
        about = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(998, 698));
        setPreferredSize(new java.awt.Dimension(998, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ban_hang.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ban_hang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ban_hang.setText("Bán hàng");
        ban_hang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ban_hang.setOpaque(true);
        ban_hang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ban_hangMouseClicked(evt);
            }
        });
        jPanel1.add(ban_hang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 75, 100, 25));

        nhap_hang.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nhap_hang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nhap_hang.setText("Nhập hàng");
        nhap_hang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nhap_hang.setOpaque(true);
        nhap_hang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhap_hangMouseClicked(evt);
            }
        });
        jPanel1.add(nhap_hang, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 75, 100, 25));

        san_pham.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        san_pham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        san_pham.setText("Sẩn phẩm");
        san_pham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        san_pham.setOpaque(true);
        san_pham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                san_phamMouseClicked(evt);
            }
        });
        jPanel1.add(san_pham, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 75, 100, 25));

        nhan_vien.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nhan_vien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nhan_vien.setText("Nhân viên");
        nhan_vien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nhan_vien.setOpaque(true);
        nhan_vien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhan_vienMouseClicked(evt);
            }
        });
        jPanel1.add(nhan_vien, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 75, 100, 25));

        doanhthu_loinhuan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        doanhthu_loinhuan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doanhthu_loinhuan.setText("Doanh thu & Lợi nhuận");
        doanhthu_loinhuan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doanhthu_loinhuan.setOpaque(true);
        doanhthu_loinhuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doanhthu_loinhuanMouseClicked(evt);
            }
        });
        jPanel1.add(doanhthu_loinhuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 75, 200, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MediaOne's Product Manager");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 10, 600, -1));

        chi_phi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        chi_phi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chi_phi.setText("Chi phí");
        chi_phi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chi_phi.setOpaque(true);
        chi_phi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chi_phiMouseClicked(evt);
            }
        });
        jPanel1.add(chi_phi, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 75, 100, 25));

        about.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        about.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        about.setText("About");
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.setOpaque(true);
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        jPanel1.add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 75, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ban_hangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ban_hangMouseClicked
        selectedButton(1);
        jPanel1.remove(curr);
        HoaDonBanHang hdbh = new HoaDonBanHang();
        curr = hdbh;
        jPanel1.add(hdbh, new AbsoluteConstraints(50, 100, 900, 550));
    }//GEN-LAST:event_ban_hangMouseClicked

    private void nhap_hangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhap_hangMouseClicked
        selectedButton(2);
        jPanel1.remove(curr);
        HoaDonMuaHang hdmh = new HoaDonMuaHang();
        curr = hdmh;
        jPanel1.add(hdmh, new AbsoluteConstraints(50, 100, 900, 550));
    }//GEN-LAST:event_nhap_hangMouseClicked

    private void san_phamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_san_phamMouseClicked
        selectedButton(3);
        jPanel1.remove(curr);
        QuanLyHangHoa qlhh = new QuanLyHangHoa();
        curr = qlhh;
        jPanel1.add(qlhh, new AbsoluteConstraints(50, 100, 900, 550));
    }//GEN-LAST:event_san_phamMouseClicked

    private void nhan_vienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhan_vienMouseClicked
        selectedButton(4);
        jPanel1.remove(curr);
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        curr = qlnv;
        jPanel1.add(qlnv, new AbsoluteConstraints(50, 100, 900, 550));
    }//GEN-LAST:event_nhan_vienMouseClicked

    private void doanhthu_loinhuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doanhthu_loinhuanMouseClicked
        selectedButton(6);
        jPanel1.remove(curr);
        DoanhThuLoiNhuan dtln = new DoanhThuLoiNhuan();
        curr = dtln;
        jPanel1.add(dtln, new AbsoluteConstraints(50, 100, 900, 550));
    }//GEN-LAST:event_doanhthu_loinhuanMouseClicked

    private void chi_phiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chi_phiMouseClicked
        selectedButton(5);
        jPanel1.remove(curr);
        ChiPhi cp = new ChiPhi();
        curr = cp;
        jPanel1.add(cp, new AbsoluteConstraints(50, 100, 900, 550));
    }//GEN-LAST:event_chi_phiMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        selectedButton(7);
        jPanel1.remove(curr);
        ab = new About();
        curr = ab;
        jPanel1.add(ab, new AbsoluteConstraints(50, 100, 900, 550));
    }//GEN-LAST:event_aboutMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        
    }//GEN-LAST:event_jPanel1MouseDragged

    public void selectedButton(int selected){
        switch(selected){
            case 1: activeButton(ban_hang);
                    unactiveButton(nhap_hang);
                    unactiveButton(san_pham);
                    unactiveButton(nhan_vien);
                    unactiveButton(chi_phi);
                    unactiveButton(doanhthu_loinhuan);
                    unactiveButton(about);
                    break;
            case 2: unactiveButton(ban_hang);
                    activeButton(nhap_hang);
                    unactiveButton(san_pham);
                    unactiveButton(nhan_vien);
                    unactiveButton(chi_phi);
                    unactiveButton(doanhthu_loinhuan);
                    unactiveButton(about);
                    break;
            case 3: unactiveButton(ban_hang);
                    unactiveButton(nhap_hang);
                    activeButton(san_pham);
                    unactiveButton(nhan_vien);
                    unactiveButton(chi_phi);
                    unactiveButton(doanhthu_loinhuan);
                    unactiveButton(about);
                    break;
            case 4: unactiveButton(ban_hang);
                    unactiveButton(nhap_hang);
                    unactiveButton(san_pham);
                    activeButton(nhan_vien);
                    unactiveButton(chi_phi);
                    unactiveButton(doanhthu_loinhuan);
                    unactiveButton(about);
                    break;
            case 6: unactiveButton(ban_hang);
                    unactiveButton(nhap_hang);
                    unactiveButton(san_pham);
                    unactiveButton(nhan_vien);
                    unactiveButton(chi_phi);
                    activeButton(doanhthu_loinhuan);
                    unactiveButton(about);
                    break;
            case 5: unactiveButton(ban_hang);
                    unactiveButton(nhap_hang);
                    unactiveButton(san_pham);
                    unactiveButton(nhan_vien);
                    activeButton(chi_phi);
                    unactiveButton(doanhthu_loinhuan);
                    unactiveButton(about);
                    break;
            case 7: unactiveButton(ban_hang);
                    unactiveButton(nhap_hang);
                    unactiveButton(san_pham);
                    unactiveButton(nhan_vien);
                    unactiveButton(chi_phi);
                    unactiveButton(doanhthu_loinhuan);
                    activeButton(about);
                    break;
        }
    }
    
    public void activeButton(JLabel label){
        label.setBackground(new Color(255,255,255));
        label.setFont(new Font("Segoe UI Black", 0, 14));
    }
    
    public void unactiveButton(JLabel label){
        label.setBackground(new Color(214, 217, 223));
        label.setFont(new Font("Segoe UI Semibold", 0, 14));
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel ban_hang;
    private javax.swing.JLabel chi_phi;
    private javax.swing.JLabel doanhthu_loinhuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nhan_vien;
    private javax.swing.JLabel nhap_hang;
    private javax.swing.JLabel san_pham;
    // End of variables declaration//GEN-END:variables
}
