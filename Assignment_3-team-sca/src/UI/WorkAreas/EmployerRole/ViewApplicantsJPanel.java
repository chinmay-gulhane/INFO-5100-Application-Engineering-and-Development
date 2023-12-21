/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.EmployerRole;

import Education.Courses.Course;
import Education.Courses.CourseSchedule;
import Education.Education;
import Education.Employer.JobPosting;
import Education.Student.Student;
import java.awt.CardLayout;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chinmaygulhane
 */
public class ViewApplicantsJPanel extends javax.swing.JPanel {

    Education education;
    private JPanel userProcessContainer;
    JobPosting jobPosting;
    DefaultTableModel dtm;

    /**
     * Creates new form ViewApplicantsJPanel
     */
    ViewApplicantsJPanel(JPanel userProcessContainer, Education education, JobPosting job) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education;
        this.jobPosting = job;
        txtJobId.setText(jobPosting.getJobId());
        txtJobName.setText(jobPosting.getJobName());
        dtm = (DefaultTableModel) tblApplicants.getModel();
        populateTable();
        lblStatus.setVisible(false);
        optionsStatus.setVisible(false);
        btnSaveStatus.setVisible(false);
//        lblApplicantFeedback.setVisible(false);
        txtStudentFeedback.setVisible(false);
    }
    
    public void populateTable(){
        dtm.setRowCount(0);
        Map<Student, String> appliedJobs = jobPosting.getApplicants();
        for (Map.Entry<Student, String> entry : appliedJobs.entrySet()) {
            Object[] row = new Object[6];
            row[0] = entry.getKey();
            row[1] = entry.getKey().getName();
            int totalCredit = 0;
            int totalCourses = 0;
            for (CourseSchedule cs : education.getCourseScheduleDirectory().getCourseScheduleList()) {
                for (Course c : education.getCourseDirectory().getCourseList()) {
                    if (cs.getCourseId().equals(c.getCourseId()) && entry.getKey().getGrades().containsKey(cs.getScheduleId())) {
                                totalCourses = totalCourses + 1;
                                totalCredit = c.getCredit() + totalCredit;
                            }
                        }
             }
            row[2] = totalCourses;
            row[3] = totalCredit;
            row[4] = entry.getKey().getGpa();
            row[5] = entry.getValue();
            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblApplicants = new javax.swing.JTable();
        btnUpdateStatus = new javax.swing.JButton();
        optionsStatus = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();
        btnSaveStatus = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtJobId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtJobName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtStudentFeedback = new javax.swing.JTextArea();
        lblApplicantFeedback = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 500));

        tblApplicants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "EduVerse ID", "Name", "Total Courses", "Total Credits", "CGPA", "Application Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblApplicants);

        btnUpdateStatus.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdateStatus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnUpdateStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateStatus.setText("Update Applicant Status");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });

        optionsStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accept", "Reject" }));
        optionsStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsStatusActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblStatus.setText("Set Status:");

        btnSaveStatus.setBackground(new java.awt.Color(0, 0, 0));
        btnSaveStatus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSaveStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveStatus.setText("Save Status");
        btnSaveStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveStatusActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Applicants");

        txtJobId.setEditable(false);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Job Id:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Job Name:");

        txtJobName.setEditable(false);

        txtStudentFeedback.setColumns(20);
        txtStudentFeedback.setRows(5);
        jScrollPane2.setViewportView(txtStudentFeedback);

        lblApplicantFeedback.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblApplicantFeedback.setText("Applicant Feedback");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtJobId)
                            .addComponent(txtJobName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaveStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(optionsStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUpdateStatus))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApplicantFeedback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJobId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtJobName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBack))
                    .addComponent(lblApplicantFeedback, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(optionsStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSaveStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblApplicants.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a person from the list!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        lblStatus.setVisible(true);
        optionsStatus.setVisible(true);
        btnSaveStatus.setVisible(true);
//        lblApplicantFeedback.setVisible(true);
        txtStudentFeedback.setVisible(true);
    }//GEN-LAST:event_btnUpdateStatusActionPerformed

    private void optionsStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionsStatusActionPerformed

    private void btnSaveStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveStatusActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblApplicants.getSelectedRow();
        Student studentU = (Student)tblApplicants.getValueAt(selectedRow, 0);
        if(optionsStatus.getSelectedItem() == "Accept"){
            jobPosting.acceptStudent(studentU);
        } else {
            jobPosting.rejectStudent(studentU);
        }
        studentU.addFeedback(jobPosting, txtStudentFeedback.getText());
        lblStatus.setVisible(false);
        optionsStatus.setVisible(false);
        btnSaveStatus.setVisible(false);
//        lblApplicantFeedback.setVisible(false);
        txtStudentFeedback.setVisible(false);
        populateTable();
        JOptionPane.showMessageDialog(this,"Status updated successfuly!");
    }//GEN-LAST:event_btnSaveStatusActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveStatus;
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApplicantFeedback;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JComboBox<String> optionsStatus;
    private javax.swing.JTable tblApplicants;
    private javax.swing.JTextField txtJobId;
    private javax.swing.JTextField txtJobName;
    private javax.swing.JTextArea txtStudentFeedback;
    // End of variables declaration//GEN-END:variables
}