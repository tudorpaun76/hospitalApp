/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalapp;
import javax.swing.*;

/**
 *
 * @author tudor
 */
public class HospitalAppGUI extends javax.swing.JFrame {

    /** Creates new form HospitalAppGUI */
    private HospitalPQ PQueue;
    
    public HospitalAppGUI(){
        initComponents();
        PQueue = new HospitalArray(); /*Array to store values*/
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrp1 = new javax.swing.ButtonGroup();
        TxtLbl1 = new javax.swing.JLabel();
        TxtLblName = new javax.swing.JLabel();
        TxtFldName = new javax.swing.JTextField();
        TxtLblAge = new javax.swing.JLabel();
        TxtFldAge = new javax.swing.JTextField();
        TxtFldCondition = new javax.swing.JLabel();
        checkBox = new javax.swing.JCheckBox();
        addBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        NumberBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        nextBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtLbl1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TxtLbl1.setText("Vaccine Centre");

        TxtLblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TxtLblName.setText("Name:");

        TxtFldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFldNameActionPerformed(evt);
            }
        });

        TxtLblAge.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TxtLblAge.setText("Age:");

        TxtFldAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFldAgeActionPerformed(evt);
            }
        });

        TxtFldCondition.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TxtFldCondition.setText("Do they have a medical condition?");

        checkBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkBox.setText("Yes");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

        addBtn.setText("Add Patient");
        btnGrp1.add(addBtn);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        displayBtn.setText("Display Patients");
        btnGrp1.add(displayBtn);
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        NumberBtn.setText("Number in queue");
        btnGrp1.add(NumberBtn);
        NumberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberBtnActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        nextBtn.setText("Next Group");
        btnGrp1.add(nextBtn);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtn)
                            .addComponent(nextBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displayBtn)
                                    .addComponent(NumberBtn))
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtLblName)
                                    .addComponent(TxtLblAge))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtFldName)
                                    .addComponent(TxtFldAge, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtFldCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtLbl1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(TxtLbl1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtLblName)
                    .addComponent(TxtFldName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtLblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFldCondition)
                    .addComponent(checkBox))
                .addGap(50, 50, 50)
                .addComponent(addBtn)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayBtn)
                        .addGap(35, 35, 35)
                        .addComponent(NumberBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(nextBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFldNameActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_checkBoxActionPerformed

    private void TxtFldAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFldAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFldAgeActionPerformed

    private void NumberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberBtnActionPerformed
        // TODO add your handling code here:
        txtArea.append("There are "+ PQueue.size() + " patients in queue" + "\n");
    }//GEN-LAST:event_NumberBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String name, age;
        int priorityPatient;
        Integer priorityNum;
        
        Patient p = new Patient();
        name = TxtFldName.getText();
        age = TxtFldAge.getText();
        int patientAge = Integer.parseInt(age); 
        
        p.setName(name);
        p.setAge(age);
        
        /*Priorities*/
        if(patientAge>=0 && patientAge<=17){
            priorityNum = 1;
            priorityPatient = priorityNum;
            PQueue.enqueue(priorityPatient, p);
        }else if(patientAge>=18 && patientAge<=29 && checkBox.isSelected()==false){
            priorityNum = 2;
            priorityPatient = priorityNum;
            PQueue.enqueue(priorityPatient, p);
        }else if(patientAge>=30 && patientAge<=44 && checkBox.isSelected()==false){
            priorityNum = 3;
            priorityPatient = priorityNum;
            PQueue.enqueue(priorityPatient, p);
        }else if(patientAge>=45 && patientAge<=54 && checkBox.isSelected()==false){
            priorityNum = 4;
            priorityPatient = priorityNum;
            PQueue.enqueue(priorityPatient, p);
        }else if(patientAge>=55 && patientAge<=64 && checkBox.isSelected()==false){
            priorityNum = 5;
            priorityPatient = priorityNum;
            PQueue.enqueue(priorityPatient, p);
        }
        
        /*Condition - Priority 6*/
        if(checkBox.isSelected() && patientAge>=18 && patientAge<=64){
        priorityNum = 6;
        priorityPatient = priorityNum;
        PQueue.enqueue(priorityPatient, p);
        }
        
        else if(patientAge>=65 && patientAge<=69){
            priorityNum = 7;
            priorityPatient = priorityNum;
            PQueue.enqueue(priorityPatient, p);
        }else if(patientAge>=70 && patientAge<=79){
            priorityNum = 8;
            priorityPatient = priorityNum;
            PQueue.enqueue(priorityPatient, p);
        }else if(patientAge>=80 && patientAge<=89){
            priorityNum = 9;
            priorityPatient = priorityNum;
            PQueue.enqueue(priorityPatient, p);
        }
        else if(patientAge>=90 && patientAge<=999){
            priorityNum = 10;
            priorityPatient = priorityNum;
            PQueue.enqueue(priorityPatient, p);
        }
        
        txtArea.append(TxtFldName.getText()+" Details have been added"+ "\n");
        TxtFldName.setText("");
        TxtFldAge.setText("");
     
    }//GEN-LAST:event_addBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        if(!PQueue.isEmpty()){
            HospitalQueue pqhosp = (HospitalQueue)PQueue.dequeue();
            Patient p1 = (Patient)pqhosp.getElement();
            
            txtArea.append(p1.getName() + " is ready to come up");
            txtArea.append(" Age - " + p1.getAge());
            txtArea.append(" Priority - " + pqhosp.getKey()+"\n");
        }
        else
            txtArea.append("Noone waiting"+ "\n");
        
        
    }//GEN-LAST:event_nextBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // TODO add your handling code here:
        txtArea.append("People waiting in queue...."+ "\n");
        txtArea.append(PQueue.printPQueue()+"\n");
    }//GEN-LAST:event_displayBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HospitalAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalAppGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NumberBtn;
    private javax.swing.JTextField TxtFldAge;
    private javax.swing.JLabel TxtFldCondition;
    private javax.swing.JTextField TxtFldName;
    private javax.swing.JLabel TxtLbl1;
    private javax.swing.JLabel TxtLblAge;
    private javax.swing.JLabel TxtLblName;
    private javax.swing.JButton addBtn;
    private javax.swing.ButtonGroup btnGrp1;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JButton displayBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables

}
