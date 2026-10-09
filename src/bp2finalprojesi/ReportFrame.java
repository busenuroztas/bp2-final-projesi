/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bp2finalprojesi;

import bp2finalprojesi.AnaEkran;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

/**
 *
 * @author Buse Nur
 */
public class ReportFrame extends javax.swing.JFrame {

    public ReportFrame() {
        initComponents();
    }
    
    
    
    public <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println("Selected: " + item);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        showTotalCheckbox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryList1 = new javax.swing.JList<>();
        generateButton1 = new javax.swing.JButton();
        cancelButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        showTotalCheckbox2 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        categoryList2 = new javax.swing.JList<>();
        generateButton2 = new javax.swing.JButton();
        cancelButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        showTotalCheckbox1.setText("Show Total Values");

        categoryList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Rent", "Salary", "Utilities", "Food", "Transportation" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(categoryList1);

        generateButton1.setBackground(new java.awt.Color(255, 153, 153));
        generateButton1.setText("Genereate Report");
        generateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButton1ActionPerformed(evt);
            }
        });

        cancelButton1.setText("Cancel");
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(showTotalCheckbox1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(generateButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showTotalCheckbox1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generateButton1)
                        .addComponent(cancelButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Income", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        showTotalCheckbox2.setText("Show Total Values");

        categoryList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Rent", "Salary", "Utilities", "Food", "Transportation" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(categoryList2);

        generateButton2.setBackground(new java.awt.Color(255, 153, 153));
        generateButton2.setText("Generate Report");
        generateButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButton2ActionPerformed(evt);
            }
        });

        cancelButton2.setText("Cancel");
        cancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(showTotalCheckbox2)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(generateButton2)
                .addGap(26, 26, 26)
                .addComponent(cancelButton2)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generateButton2)
                        .addComponent(cancelButton2))
                    .addComponent(showTotalCheckbox2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Expense", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
  
    private void generateButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButton2ActionPerformed
        List<String> selectedCategories = categoryList2.getSelectedValuesList();
        boolean showTotals = showTotalCheckbox2.isSelected();

        printList(selectedCategories);

        Graphics g = jPanel2.getGraphics();
        g.clearRect(0, 100, jPanel2.getWidth(), jPanel2.getHeight() - 100);
        g.setColor(Color.RED);
        int x = 50;

        for (int i = 0; i < selectedCategories.size(); i++) {
            int value = (int) (Math.random() * 200 + 100);
            g.fillRect(x, 300 - value, 40, value);
            g.setColor(Color.BLACK);
            g.drawRect(x, 300 - value, 40, value);
            g.drawString(selectedCategories.get(i), x, 320);

            if (showTotals) {
                g.drawString("₺" + value, x, 300 - value - 10);
            }

            x += 60;
            g.setColor(Color.RED);
        }
    }//GEN-LAST:event_generateButton2ActionPerformed


    
    private void cancelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton2ActionPerformed

        AnaEkran ae = new AnaEkran();
        ae.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_cancelButton2ActionPerformed

    

    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
        AnaEkran anaEkran = new AnaEkran();
        anaEkran.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButton1ActionPerformed

    
    

    private void generateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButton1ActionPerformed
        List<String> selectedCategories = categoryList1.getSelectedValuesList();
        boolean showTotals = showTotalCheckbox1.isSelected();

        printList(selectedCategories);

        Graphics g = jPanel1.getGraphics();
        g.clearRect(0, 100, jPanel1.getWidth(), jPanel1.getHeight() - 100);
        g.setColor(Color.BLUE);
        int x = 50;

        for (int i = 0; i < selectedCategories.size(); i++) {
            int value = (int) (Math.random() * 200 + 100);
            g.fillRect(x, 300 - value, 40, value);
            g.setColor(Color.BLACK);
            g.drawRect(x, 300 - value, 40, value);
            g.drawString(selectedCategories.get(i), x, 320);

            if (showTotals) {
                g.drawString("₺" + value, x, 300 - value - 10);
            }

            x += 60;
            g.setColor(Color.BLUE);
         }    }//GEN-LAST:event_generateButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton1;
    private javax.swing.JButton cancelButton2;
    private javax.swing.JList<String> categoryList1;
    private javax.swing.JList<String> categoryList2;
    private javax.swing.JButton generateButton1;
    private javax.swing.JButton generateButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox showTotalCheckbox1;
    private javax.swing.JCheckBox showTotalCheckbox2;
    // End of variables declaration//GEN-END:variables

}
