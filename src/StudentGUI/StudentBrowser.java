
package StudentGUI;

import javax.swing.JOptionPane;


public class StudentBrowser extends javax.swing.JFrame {
    Student s[];
    int size, currentstudent;
    
    public StudentBrowser() {
        initComponents();
        s = new Student[10];
        size = 0;
        currentstudent = -1;
        fillData();
        showStudent();
    }
   private void fillData(){
   String names[] = {"Marge Simpson","Barney Gimble","Whalen Smithers","Ned Flanders","Edna Crabapple"};
   int marks[][] = {{75,85,72},{87,65,91},{56,61,52},{47,35,51},{95,91,92}};
       for (int i = 0; i < 5; i++) {
           s[i] = new Student(names[i],marks[i]);
           size++;
           System.out.println(s[i].getName() + "\tAverage: "+   s[i].getAverage());
       }
       currentstudent=0;
   }
   public void showStudent(){
       txt_name.setText(s[currentstudent].getName());
       txt_test1.setText("" + s[currentstudent].getMark(1));
       txt_test2.setText("" + s[currentstudent].getMark(2));
       txt_test3.setText("" + s[currentstudent].getMark(3));
       lbl_averagebox.setText("" + s[currentstudent].getAverage());
       lbl_countbox.setText("" + size);
       lbl_indexbox.setText("" + (currentstudent+1));
   }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_add = new javax.swing.JButton();
        btn_modify = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        lbl_name = new javax.swing.JLabel();
        lbl_test1 = new javax.swing.JLabel();
        lbl_test2 = new javax.swing.JLabel();
        lbl_test3 = new javax.swing.JLabel();
        lbl_average = new javax.swing.JLabel();
        lbl_count = new javax.swing.JLabel();
        lbl_index = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_test1 = new javax.swing.JTextField();
        txt_test2 = new javax.swing.JTextField();
        txt_test3 = new javax.swing.JTextField();
        lbl_averagebox = new javax.swing.JLabel();
        lbl_countbox = new javax.swing.JLabel();
        lbl_indexbox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Browser");

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_modify.setText("Modify");
        btn_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifyActionPerformed(evt);
            }
        });

        btn_next.setText(">");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_prev.setText("<");
        btn_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevActionPerformed(evt);
            }
        });

        btn_last.setText(">>");
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });

        btn_first.setText("<<");
        btn_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firstActionPerformed(evt);
            }
        });

        lbl_name.setText("Name:");

        lbl_test1.setText("Test 1");

        lbl_test2.setText("Test 2");

        lbl_test3.setText("Test 3");

        lbl_average.setText("Average");

        lbl_count.setText("Count");

        lbl_index.setText("Current Index");

        txt_name.setEditable(false);

        txt_test1.setEditable(false);
        txt_test1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_test1ActionPerformed(evt);
            }
        });

        txt_test2.setEditable(false);

        txt_test3.setEditable(false);
        txt_test3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_test3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_average)
                                        .addGap(45, 45, 45)
                                        .addComponent(lbl_averagebox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_name)
                                            .addComponent(lbl_test1)
                                            .addComponent(lbl_test2)
                                            .addComponent(lbl_test3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_test1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(txt_test3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                                        .addComponent(txt_test2, javax.swing.GroupLayout.Alignment.LEADING))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_countbox)
                                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_count)
                                    .addComponent(btn_first))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_prev)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                        .addComponent(btn_next))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lbl_index)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_last)
                                    .addComponent(lbl_indexbox)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modify))))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_test1)
                    .addComponent(txt_test1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_test2)
                    .addComponent(txt_test2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modify))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_test3)
                    .addComponent(txt_test3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_average)
                    .addComponent(lbl_averagebox))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next)
                    .addComponent(btn_prev)
                    .addComponent(btn_last)
                    .addComponent(btn_first))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_count)
                    .addComponent(lbl_index)
                    .addComponent(lbl_countbox)
                    .addComponent(lbl_indexbox))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        if (currentstudent > 0) {
            currentstudent--;
            showStudent();
        }
    }//GEN-LAST:event_btn_prevActionPerformed

    private void txt_test1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_test1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_test1ActionPerformed

    private void txt_test3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_test3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_test3ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        StudentPopUp sp = new StudentPopUp(this, true);
        //true = modal is true = pop up takes control of the app
        sp.setLocationRelativeTo(this);//pops up over the frame
        sp.setVisible(true); //shows the pop up
        Student temp = sp.getStudent();
            String em = temp.validateData();
            
            if(em == null){
                s[size]=temp;
                currentstudent = size;
                size++;
                showStudent();
            }
            else
                JOptionPane.showMessageDialog(this, em, "Error", 2);
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifyActionPerformed
       StudentPopUp sp = new StudentPopUp(this, true);
        //true = modal is true = pop up takes control of the app
        sp.setForm(s[currentstudent]);
        sp.setLocationRelativeTo(this);//pops up over the frame
        sp.setVisible(true); //shows the pop up
        Student temp = sp.getStudent();
        
        String em = temp.validateData();
            
            if(em == null){
                s[currentstudent]=temp;
                showStudent();
            }
            else
                JOptionPane.showMessageDialog(this,em, "Error", 2);
    }//GEN-LAST:event_btn_modifyActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        currentstudent = size-1;
        showStudent();
    }//GEN-LAST:event_btn_lastActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        if (currentstudent < size-1 && currentstudent>-1) {
            currentstudent++;
            showStudent();
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
        currentstudent = 0;
        showStudent();
    }//GEN-LAST:event_btn_firstActionPerformed

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
            java.util.logging.Logger.getLogger(StudentBrowser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentBrowser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentBrowser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentBrowser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentBrowser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_modify;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_prev;
    private javax.swing.JLabel lbl_average;
    private javax.swing.JLabel lbl_averagebox;
    private javax.swing.JLabel lbl_count;
    private javax.swing.JLabel lbl_countbox;
    private javax.swing.JLabel lbl_index;
    private javax.swing.JLabel lbl_indexbox;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_test1;
    private javax.swing.JLabel lbl_test2;
    private javax.swing.JLabel lbl_test3;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_test1;
    private javax.swing.JTextField txt_test2;
    private javax.swing.JTextField txt_test3;
    // End of variables declaration//GEN-END:variables
}
