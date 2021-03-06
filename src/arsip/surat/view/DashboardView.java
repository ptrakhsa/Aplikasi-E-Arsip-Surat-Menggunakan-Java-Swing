/*
 * The MIT License
 *
 * Copyright 2020 Univeersitas Teknologi Yogyakarta.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package arsip.surat.view;

import arsip.surat.util.DragWindowUtil;
import arsip.surat.view.panel.PanelMenuPetugas;

/**
 *
 * @author Muhammad Rosyid Izzulkhaq (rsdiz)
 */
public class DashboardView extends javax.swing.JFrame {

    private static DashboardView dashboardView;
    private final PanelMenuPetugas panel;

    /**
     * Creates new form DashboardView
     */
    private DashboardView() {
        initComponents();
        new DragWindowUtil().enable(DashboardView.this);
        this.panel = new PanelMenuPetugas();
        baseTabbedPanel.addTab("   Petugas   ", panel);
    }

    //<editor-fold defaultstate="collapsed" desc="Singleton pattern">
    /**
     * Singleton pattern
     *
     * @return
     */
    public static DashboardView getInstance() {
        if (dashboardView == null) {
            dashboardView = new DashboardView();
        }
        return dashboardView;
    } // </editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        customTitleBar = new javax.swing.JPanel();
        title_text = new javax.swing.JLabel();
        minimizedIcon = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        panelKiri = new javax.swing.JPanel();
        baseTabbedPanel = new javax.swing.JTabbedPane();
        panelDashboard = new javax.swing.JPanel();
        panelSuratMasuk = new javax.swing.JPanel();
        panelSuratKeluar = new javax.swing.JPanel();
        panelDisposisi = new javax.swing.JPanel();
        panelBidang = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-Arsip Surat: Dashboard");
        setLocationByPlatform(true);
        setName("frame-dashboard"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        basePanel.setBackground(new java.awt.Color(255, 255, 255));
        basePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        basePanel.setPreferredSize(new java.awt.Dimension(990, 600));
        basePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customTitleBar.setBackground(new java.awt.Color(242, 242, 242));
        customTitleBar.setPreferredSize(new java.awt.Dimension(1190, 50));
        customTitleBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_text.setFont(new java.awt.Font("monogram", 0, 28)); // NOI18N
        title_text.setForeground(new java.awt.Color(20, 20, 20));
        title_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_text.setText("E-Arsip Surat: Dashboard");
        customTitleBar.add(title_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 630, 50));

        minimizedIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizedIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arsip/surat/assets/images/minimized~1.png"))); // NOI18N
        minimizedIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizedIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizedIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizedIconMouseExited(evt);
            }
        });
        customTitleBar.add(minimizedIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 30, 50));

        exitIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arsip/surat/assets/images/close~1.png"))); // NOI18N
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitIconMouseExited(evt);
            }
        });
        customTitleBar.add(exitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 30, 50));

        basePanel.add(customTitleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        contentPanel.setBackground(new java.awt.Color(230, 230, 230));
        contentPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentPanelMouseClicked(evt);
            }
        });
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelKiri.setBackground(new java.awt.Color(121, 121, 121));
        panelKiri.setPreferredSize(new java.awt.Dimension(200, 740));
        panelKiri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contentPanel.add(panelKiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        baseTabbedPanel.setBackground(new java.awt.Color(0, 100, 120));
        baseTabbedPanel.setForeground(new java.awt.Color(0, 100, 120));
        baseTabbedPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        baseTabbedPanel.setPreferredSize(new java.awt.Dimension(990, 740));

        panelDashboard.setBackground(new java.awt.Color(215, 215, 215));
        panelDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        baseTabbedPanel.addTab("   Dashboard   ", panelDashboard);

        panelSuratMasuk.setBackground(new java.awt.Color(215, 215, 215));
        panelSuratMasuk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        baseTabbedPanel.addTab("   Surat Masuk   ", panelSuratMasuk);

        panelSuratKeluar.setBackground(new java.awt.Color(215, 215, 215));
        panelSuratKeluar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        baseTabbedPanel.addTab("   Surat Keluar   ", panelSuratKeluar);

        panelDisposisi.setBackground(new java.awt.Color(215, 215, 215));
        panelDisposisi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        baseTabbedPanel.addTab("   Disposisi   ", panelDisposisi);

        panelBidang.setBackground(new java.awt.Color(215, 215, 215));
        panelBidang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        baseTabbedPanel.addTab("   Bidang   ", panelBidang);

        contentPanel.add(baseTabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        basePanel.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 55, 1190, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Merubah gambar icon minimize ketika mouse entered">

    /**
     * Merubah gambar icon minimize ketika mouse entered
     *
     *
     * @param evt
     */
    private void minimizedIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizedIconMouseClicked
        this.setState(LoginView.ICONIFIED);
    }//GEN-LAST:event_minimizedIconMouseClicked
    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Merubah gambar icon minimized seperti semula">
    /**
     * Merubah gambar icon minimized seperti semula
     *
     * @param evt
     */
    private void minimizedIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizedIconMouseEntered
        minimizedIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arsip/surat/assets/images/minimized-hover~1.png")));
    }//GEN-LAST:event_minimizedIconMouseEntered
// </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Mengubah state window menjadi iconified ketika icon diklik">

    /**
     * Mengubah state window menjadi iconified ketika icon diklik
     *
     * @param evt
     */
    private void minimizedIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizedIconMouseExited
        minimizedIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arsip/surat/assets/images/minimized~1.png")));
    }//GEN-LAST:event_minimizedIconMouseExited
    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Aksi ketika tombol diklik, maka aplikasi keluar">
    /**
     * Aksi ketika tombol diklik, maka aplikasi keluar
     *
     * @param evt
     */
    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitIconMouseClicked
    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Merubah gambar icon exit ketika mouse entered">
    /**
     * Merubah gambar icon exit ketika mouse entered
     *
     * @param evt
     */
    private void exitIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseEntered
        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arsip/surat/assets/images/close-hover~1.png")));
    }//GEN-LAST:event_exitIconMouseEntered
    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Merubah gambar icon exit seperti semula">
    /**
     * Merubah gambar icon exit seperti semula
     *
     * @param evt
     */
    private void exitIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseExited
        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arsip/surat/assets/images/close~1.png")));
    }//GEN-LAST:event_exitIconMouseExited
    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Membuat frame tidak bisa didrag">
    /**
     * Membuat frame tidak bisa didrag
     *
     * @param evt
     */
    private void contentPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentPanelMouseClicked
        // DO NOTHING
    }//GEN-LAST:event_contentPanelMouseClicked
    // </editor-fold>

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            DashboardView.getInstance().setVisible(true);
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Deklarasi Variabel">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basePanel;
    private javax.swing.JTabbedPane baseTabbedPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel customTitleBar;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel minimizedIcon;
    private javax.swing.JPanel panelBidang;
    private javax.swing.JPanel panelDashboard;
    private javax.swing.JPanel panelDisposisi;
    private javax.swing.JPanel panelKiri;
    private javax.swing.JPanel panelSuratKeluar;
    private javax.swing.JPanel panelSuratMasuk;
    private javax.swing.JLabel title_text;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
