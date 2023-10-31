/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.StudentRole;

import Education.Education;
import Education.Student.Student;
import static Utiltities.Validations.validateEmail;
import static Utiltities.Validations.validatePassword;
import static Utiltities.Validations.validatePhone;
import static Utiltities.Validations.validateUsername;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author samik
 */
public class ViewProfileJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Education education;
    private Student student;
    /**
     * Creates new form ViewProfileJPanel
     */

    ViewProfileJPanel(JPanel userProcessContainer, Education education, Student student) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education;
        this.student = student;
        populateStudentData();
    }
    
    void populateStudentData(){
        txtStudentId.setText(student.getStudentId());
        txtStudentName.setText(student.getName());
        txtUsername.setText(student.getUsername());
        txtPassword.setText(student.getCurrentPassword());
        txtEmail.setText(student.getEmail());
        txtPhone.setText(student.getPhone());
    
        btnSaveStudent.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtStudentName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        btnCancelStudent = new javax.swing.JButton();
        btnSaveStudent = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnUpdateStudent = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Student Id");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Student Name");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Phone");

        txtStudentId.setEditable(false);
        txtStudentId.setEnabled(false);

        txtUsername.setEditable(false);

        txtStudentName.setEditable(false);

        txtPassword.setEditable(false);

        txtEmail.setEditable(false);

        txtPhone.setEditable(false);

        btnCancelStudent.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelStudent.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCancelStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelStudent.setText("Cancel");
        btnCancelStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelStudentActionPerformed(evt);
            }
        });

        btnSaveStudent.setBackground(new java.awt.Color(0, 0, 0));
        btnSaveStudent.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSaveStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveStudent.setText("Save");
        btnSaveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveStudentActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("View Profile");

        btnUpdateStudent.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdateStudent.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnUpdateStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateStudent.setText("Update");
        btnUpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSaveStudent)
                        .addGap(30, 30, 30)
                        .addComponent(btnCancelStudent)
                        .addGap(30, 30, 30)
                        .addComponent(btnUpdateStudent)
                        .addGap(30, 30, 30)
                        .addComponent(btnBack)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveStudent)
                    .addComponent(btnCancelStudent)
                    .addComponent(btnUpdateStudent)
                    .addComponent(btnBack))
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStudentActionPerformed
        // TODO add your handling code here:
//        txtStudentId.setEditable(true);
        txtStudentName.setEditable(true);
        txtPassword.setEditable(true);
        txtEmail.setEditable(true);
        txtPhone.setEditable(true);
        
        btnSaveStudent.setEnabled(true);
        btnUpdateStudent.setEnabled(false);
    }//GEN-LAST:event_btnUpdateStudentActionPerformed

    private void btnCancelStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelStudentActionPerformed
        // TODO add your handling code here:
        populateStudentData();
//        txtStudentId.setEditable(false);
        disableStudentFields();

    }//GEN-LAST:event_btnCancelStudentActionPerformed

    void disableStudentFields(){
        txtStudentName.setEditable(false);
        txtUsername.setEditable(false);
        txtPassword.setEditable(false);
        txtEmail.setEditable(false);
        txtPhone.setEditable(false);
        
        btnSaveStudent.setEnabled(false);
        btnUpdateStudent.setEnabled(true);
    }
    
    private void btnSaveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveStudentActionPerformed
        // TODO add your handling code here:

//      validations for empty fields
        // Validation if any field is left empty
        if(txtStudentName.getText().isEmpty() || txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() || txtEmail.getText().isEmpty()
           || txtPhone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all fields to procced futher!");
            return;
        }
        
        if(validateUsername(txtStudentName.getText())){
            JOptionPane.showMessageDialog(this, "Name should be between 5 to 15 length and should not contain any special characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(validatePhone(txtPhone.getText())){
            JOptionPane.showMessageDialog(this, "Please verify if Phone number is in correct format \"(000) 000-0000\"", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(validateEmail(txtEmail.getText())){
            JOptionPane.showMessageDialog(this, "Please verify if email is in correct format \"youremail@xxx.xxx\"", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(validatePassword(txtPassword.getText())){
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String password = txtPassword.getText();
        if(!BCrypt.checkpw(password,student.getCurrentPassword())){
            for(String passwordOld : student.getPasswordHistory()){
                if(password.equals(passwordOld)){
                    JOptionPane.showMessageDialog(this, "Password already used. Please enter a new password.","Warning",JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }
        student.getPasswordHistory().add(password);
        String salt = BCrypt.gensalt();
        String Cpassword = BCrypt.hashpw(password, salt);
        student.setName(txtStudentName.getText());
        student.setCurrentPassword(Cpassword);
        student.setEmail(txtEmail.getText());
        student.setPhone(txtPhone.getText());
        JOptionPane.showMessageDialog(this, "Profle Information Updated");
        disableStudentFields();
    }//GEN-LAST:event_btnSaveStudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelStudent;
    private javax.swing.JButton btnSaveStudent;
    private javax.swing.JButton btnUpdateStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
