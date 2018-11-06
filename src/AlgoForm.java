
import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author marsyn
 */
public class AlgoForm extends javax.swing.JFrame {

    
      
    public AlgoForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        referenceString = new javax.swing.JTextField();
        frames = new javax.swing.JTextField();
        show_selection = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        show_validation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Page Replacement Algorithms");

        referenceString.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        referenceString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenceStringActionPerformed(evt);
            }
        });
        referenceString.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                referenceStringKeyPressed(evt);
            }
        });

        frames.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                framesActionPerformed(evt);
            }
        });
        frames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                framesKeyPressed(evt);
            }
        });

        show_selection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_selectionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Enter Pages #");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Enter Frames #");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIFO", "LRU", "OPTIMAL", "LFU" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(204, 204, 255));
        submit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        submit.setText("Submit");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        show_validation.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(frames, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(referenceString)
                    .addComponent(show_selection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE))
                .addGap(205, 205, 205))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addComponent(show_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(445, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(referenceString, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(show_validation)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(frames))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)
                        .addComponent(show_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   public int fifoMethod(int one, int two){
       
       return one+two;
   }
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handlig code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void referenceStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenceStringActionPerformed

    }//GEN-LAST:event_referenceStringActionPerformed

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_submitMouseClicked

    private void referenceStringKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_referenceStringKeyPressed
       int key = evt.getKeyCode();
       if((key >= evt.VK_0 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9) ||(key == evt.VK_BACK_SPACE)){
           referenceString.setEditable(true);
           referenceString.setBackground(Color.YELLOW);
       }else{
           referenceString.setEditable(false);
           referenceString.setBackground(Color.RED);
       }
      
    }//GEN-LAST:event_referenceStringKeyPressed

    private void show_selectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_selectionActionPerformed

    }//GEN-LAST:event_show_selectionActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       // show_selection.setText((String) jComboBox1.getSelectedItem());
        int one = Integer.parseInt(referenceString.getText());
        int two = Integer.parseInt(frames.getText());
        String addition = String.valueOf(one+two);
             if(jComboBox1.getSelectedItem().equals("FIFO")){
     
                 show_selection.setText(addition);
                 
             }
       // if(jComboBox1.getSelectedItem().equals("FIFO")){
         //  show_selection.fifoMethod(one, two);
      // }
        
      //  if(jComboBox1.getSelectedItem().equals("LRU")){
       // }
        
    //    if(jComboBox1.getSelectedItem().equals("OPTIMAL")){
    //        show_selection.optimalMethod(one, two);
     //   }
     //   if(jComboBox1.getSelectedItem().equals("LFU")){
      //  }
        
        
        
    }//GEN-LAST:event_submitActionPerformed

    private void framesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_framesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_framesActionPerformed

    private void framesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_framesKeyPressed
       int key_press = evt.getKeyCode();
       if((key_press >= evt.VK_0 && key_press <= evt.VK_9) || (key_press >= evt.VK_NUMPAD0 && key_press <= evt.VK_NUMPAD9) ||(key_press == evt.VK_BACK_SPACE)){
           frames.setEditable(true);
           frames.setBackground(Color.YELLOW);
       }else{
           frames.setEditable(false);
           frames.setBackground(Color.RED);
    }//GEN-LAST:event_framesKeyPressed
  }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlgoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlgoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlgoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlgoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlgoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField frames;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField referenceString;
    private javax.swing.JTextField show_selection;
    private javax.swing.JLabel show_validation;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}

