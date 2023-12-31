/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.StudentRole;

import Education.Courses.Course;
import Education.Courses.CourseSchedule;
import Education.Education;
import Education.Professor.Professor;
import Education.Student.Student;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author samik
 */
public class AddProfessorFeedbackJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Education education;
    private Student student;
    Map<String, String> professorNames = new HashMap<>();
    String selectedSchedule;
    /**
     * Creates new form AddFeedbackJPanel
     */


    AddProfessorFeedbackJPanel(JPanel userProcessContainer, Education education, Student student) {
initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education; 
        this.student = student;
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (CourseSchedule cs : education.getCourseScheduleDirectory().getCourseScheduleList()) {
            if (student.getGrades().containsKey(cs.getScheduleId())) {
                for (Course c : education.getCourseDirectory().getCourseList()) {
                    if (c.getCourseId().equals(cs.getCourseId())) {
                        for (Professor p : education.getProfessorsDirectory().getProfessorList()) {
                            if (p.getProfessorId().equals(cs.getTeachingProfessorId())) {
                                model.addElement(c.getName());
                                professorNames.put(c.getName(),p.getName());
                            }
                        }
                    }
                }
            }
        }
        feedbackText.setEditable(false);
        optionsCourses.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionsCourses = new javax.swing.JComboBox<>();
        txtProfessor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbackText = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblWelcomeAdmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        optionsCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsCoursesActionPerformed(evt);
            }
        });

        txtProfessor.setEditable(false);
        txtProfessor.setEnabled(false);

        feedbackText.setColumns(20);
        feedbackText.setRows(5);
        jScrollPane1.setViewportView(feedbackText);

        btnSubmit.setBackground(new java.awt.Color(0, 0, 0));
        btnSubmit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.setToolTipText("");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Course Name:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Professor:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Feedback:");

        lblWelcomeAdmin.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblWelcomeAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomeAdmin.setText("Add Professor Feedback");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtProfessor)
                        .addComponent(optionsCourses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(141, 141, 141))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblWelcomeAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblWelcomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionsCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnBack))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void optionsCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsCoursesActionPerformed
        // TODO add your handling code here:
        selectedSchedule = (String) optionsCourses.getSelectedItem();
        String professorName = professorNames.get(selectedSchedule);
        txtProfessor.setText(professorName);
        feedbackText.setEditable(true);
    }//GEN-LAST:event_optionsCoursesActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(feedbackText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill Feedback field for student to procced.", "Account Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String text = feedbackText.getText();
        Map<String, String> feedbackP = new HashMap<>();
        for (CourseSchedule cs : education.getCourseScheduleDirectory().getCourseScheduleList()) {
            if (student.getGrades().containsKey(cs.getScheduleId())) {
                for (Course c : education.getCourseDirectory().getCourseList()) {
                    if (c.getCourseId().equals(cs.getCourseId()) && c.getName().equals(selectedSchedule)) {
                        feedbackP.put(student.getStudentId(), text);
                        cs.setProfessorFeedback(feedbackP);
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Feedback submitted. Thank you!");
        feedbackText.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Component component = userProcessContainer.getComponent(userProcessContainer.getComponentCount() - 2);
        if(component instanceof StudentJPanel studentJPanel) {
            studentJPanel.setupStudentDashboard();
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextArea feedbackText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWelcomeAdmin;
    private javax.swing.JComboBox<String> optionsCourses;
    private javax.swing.JTextField txtProfessor;
    // End of variables declaration//GEN-END:variables
}
