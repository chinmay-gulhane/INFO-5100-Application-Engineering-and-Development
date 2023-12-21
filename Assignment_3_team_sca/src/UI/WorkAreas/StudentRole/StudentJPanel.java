/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.StudentRole;

import Education.Courses.Course;
import Education.Courses.CourseSchedule;
import Education.Education;
import Education.Student.Student;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author samik
 */
public class StudentJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Education education;
    private Student student;
    /**
     * Creates new form StudentJPanel
     */

    public StudentJPanel(JPanel userProcessContainer, Student student, Education education) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.education = education; 
        this.student = student;
        setupStudentDashboard();        
    }

    public void setupStudentDashboard(){
         lblStudentName.setText(student.getName());
        lblStudentId.setText(student.getStudentId());
        
        double amountOwed = student.getAmountOwed(); 
        int totalCredit = 0;
        int totalCourses = 0;
        for (CourseSchedule cs : education.getCourseScheduleDirectory().getCourseScheduleList()) {
            for (Course c : education.getCourseDirectory().getCourseList()) {
                if (cs.getCourseId().equals(c.getCourseId()) && student.getGrades().containsKey(cs.getScheduleId())) {
                        totalCourses = totalCourses + 1;
                        totalCredit = c.getCredit() + totalCredit;
                    }
                }
         }
        
        lblCredits.setText(Integer.toString(totalCredit));
        lblCourseCount.setText(Integer.toString(totalCourses));
        lblCgpa.setText(Double.toString(student.getGpa()));
        lblFees.setText(amountOwed + " $");       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewCourses = new javax.swing.JButton();
        btnBilling = new javax.swing.JButton();
        btnTranscript = new javax.swing.JButton();
        btnAddCourses = new javax.swing.JButton();
        btnViewProfile = new javax.swing.JButton();
        btnViewGrades = new javax.swing.JButton();
        btnGraduation = new javax.swing.JButton();
        btnRateProf = new javax.swing.JButton();
        btnJobPortal = new javax.swing.JButton();
        btnAddProfFeedback = new javax.swing.JButton();
        btnViewProfFeedback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblFees = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblCourseCount = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblCredits = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblCgpat = new javax.swing.JLabel();
        lblCgpa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblStudentName = new javax.swing.JLabel();
        lblStudentId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnViewCourses.setBackground(new java.awt.Color(0, 0, 0));
        btnViewCourses.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewCourses.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCourses.setText("View Courses");
        btnViewCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCoursesActionPerformed(evt);
            }
        });

        btnBilling.setBackground(new java.awt.Color(0, 0, 0));
        btnBilling.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBilling.setForeground(new java.awt.Color(255, 255, 255));
        btnBilling.setText("Billing");
        btnBilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillingActionPerformed(evt);
            }
        });

        btnTranscript.setBackground(new java.awt.Color(0, 0, 0));
        btnTranscript.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnTranscript.setForeground(new java.awt.Color(255, 255, 255));
        btnTranscript.setText("Transcript");
        btnTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranscriptActionPerformed(evt);
            }
        });

        btnAddCourses.setBackground(new java.awt.Color(0, 0, 0));
        btnAddCourses.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAddCourses.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCourses.setText("Add Courses");
        btnAddCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCoursesActionPerformed(evt);
            }
        });

        btnViewProfile.setBackground(new java.awt.Color(0, 0, 0));
        btnViewProfile.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });

        btnViewGrades.setBackground(new java.awt.Color(0, 0, 0));
        btnViewGrades.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewGrades.setForeground(new java.awt.Color(255, 255, 255));
        btnViewGrades.setText("View Grades");
        btnViewGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewGradesActionPerformed(evt);
            }
        });

        btnGraduation.setBackground(new java.awt.Color(0, 0, 0));
        btnGraduation.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnGraduation.setForeground(new java.awt.Color(255, 255, 255));
        btnGraduation.setText("Graduation");
        btnGraduation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraduationActionPerformed(evt);
            }
        });

        btnRateProf.setBackground(new java.awt.Color(0, 0, 0));
        btnRateProf.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRateProf.setForeground(new java.awt.Color(255, 255, 255));
        btnRateProf.setText("Rate Professor");
        btnRateProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateProfActionPerformed(evt);
            }
        });

        btnJobPortal.setBackground(new java.awt.Color(0, 0, 0));
        btnJobPortal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnJobPortal.setForeground(new java.awt.Color(255, 255, 255));
        btnJobPortal.setText("Job Portal");
        btnJobPortal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJobPortalActionPerformed(evt);
            }
        });

        btnAddProfFeedback.setBackground(new java.awt.Color(0, 0, 0));
        btnAddProfFeedback.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAddProfFeedback.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProfFeedback.setText("Add Professor's feedback ");
        btnAddProfFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProfFeedbackActionPerformed(evt);
            }
        });

        btnViewProfFeedback.setBackground(new java.awt.Color(0, 0, 0));
        btnViewProfFeedback.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewProfFeedback.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProfFeedback.setText("View Professor's feedback");
        btnViewProfFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfFeedbackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Home");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pending Fees");

        lblFees.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblFees.setForeground(new java.awt.Color(255, 255, 255));
        lblFees.setText("20");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblFees)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblFees, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Courses Taken");

        lblCourseCount.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblCourseCount.setForeground(new java.awt.Color(255, 255, 255));
        lblCourseCount.setText("20");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCourseCount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lblCourseCount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total Credits");

        lblCredits.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblCredits.setForeground(new java.awt.Color(255, 255, 255));
        lblCredits.setText("20");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCredits)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(lblCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        lblCgpat.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblCgpat.setForeground(new java.awt.Color(255, 255, 255));
        lblCgpat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCgpat.setText("CGPA");

        lblCgpa.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblCgpa.setForeground(new java.awt.Color(255, 255, 255));
        lblCgpa.setText("20");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(lblCgpa)
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(lblCgpat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblCgpat)
                .addGap(18, 18, 18)
                .addComponent(lblCgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Welcome");

        lblStudentName.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblStudentName.setText("Student Name");

        lblStudentId.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblStudentId.setText("Eduverse Id");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Eduverse Id:");

        btnLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewGrades)
                    .addComponent(btnAddCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJobPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewProfFeedback))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnTranscript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGraduation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRateProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddProfFeedback))
                    .addComponent(btnBilling, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnViewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddCourses, btnAddProfFeedback, btnBilling, btnGraduation, btnJobPortal, btnRateProf, btnTranscript, btnViewCourses, btnViewGrades, btnViewProfFeedback});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel1, jPanel2, jPanel3, jPanel4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewProfile))
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblStudentName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblStudentId))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBilling, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTranscript)
                    .addComponent(btnAddCourses))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGraduation)
                    .addComponent(btnViewProfFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRateProf)
                    .addComponent(btnViewGrades))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProfFeedback)
                    .addComponent(btnJobPortal))
                .addGap(46, 46, 46))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddCourses, btnAddProfFeedback, btnBilling, btnGraduation, btnJobPortal, btnRateProf, btnTranscript, btnViewCourses, btnViewGrades, btnViewProfFeedback, btnViewProfile});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel1, jPanel2, jPanel3, jPanel4});

    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCoursesActionPerformed
        // TODO add your handling code here:
        ViewCourseTableJPanel panel = new ViewCourseTableJPanel(userProcessContainer,education,student);
        userProcessContainer.add("ViewCourseTableJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewCoursesActionPerformed

    private void btnAddCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCoursesActionPerformed
        // TODO add your handling code here:
        SelectTermJPanel panel = new SelectTermJPanel(userProcessContainer,education,student);
        userProcessContainer.add("SelectTermJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddCoursesActionPerformed

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
        ViewProfileJPanel panel = new ViewProfileJPanel(userProcessContainer,education,student);
        userProcessContainer.add("ViewProfileJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnViewGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewGradesActionPerformed
        // TODO add your handling code here:
                ViewGradesJPanel panel = new ViewGradesJPanel(userProcessContainer,education,student);
        userProcessContainer.add("ViewGradesJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewGradesActionPerformed


    private void btnBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillingActionPerformed
        // TODO add your handling code here:
        BillingJPanel panel = new BillingJPanel(userProcessContainer,education,student);
        userProcessContainer.add("BillingJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBillingActionPerformed

    private void btnGraduationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraduationActionPerformed
        // TODO add your handling code here:
        GraduationJPanel panel = new GraduationJPanel(userProcessContainer,education,student);
        userProcessContainer.add("GraduationJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnGraduationActionPerformed

    private void btnTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranscriptActionPerformed
        // TODO add your handling code here:
        TranscriptJPanel panel = new TranscriptJPanel(userProcessContainer,education,student);
        userProcessContainer.add("TranscriptJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);        
    }//GEN-LAST:event_btnTranscriptActionPerformed

    private void btnRateProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateProfActionPerformed
        // TODO add your handling code here:
        RateProfessorJPanel panel = new RateProfessorJPanel(userProcessContainer,education,student);
        userProcessContainer.add("RateProfessorJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnRateProfActionPerformed

    private void btnJobPortalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJobPortalActionPerformed
        // TODO add your handling code here:
        JobPortalJPanel panel = new JobPortalJPanel(userProcessContainer,education,student);
        userProcessContainer.add("JobPortalJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnJobPortalActionPerformed

    private void btnAddProfFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProfFeedbackActionPerformed
        // TODO add your handling code here:
                AddProfessorFeedbackJPanel panel = new AddProfessorFeedbackJPanel(userProcessContainer,education,student);
        userProcessContainer.add("AddProfessorFeedbackJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddProfFeedbackActionPerformed

    private void btnViewProfFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfFeedbackActionPerformed
        // TODO add your handling code here:
                        ViewProfessorFeedbackJPanel panel = new ViewProfessorFeedbackJPanel(userProcessContainer,education);
        userProcessContainer.add("ViewProfessorFeedbackJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewProfFeedbackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnLogoutActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourses;
    private javax.swing.JButton btnAddProfFeedback;
    private javax.swing.JButton btnBilling;
    private javax.swing.JButton btnGraduation;
    private javax.swing.JButton btnJobPortal;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRateProf;
    private javax.swing.JButton btnTranscript;
    private javax.swing.JButton btnViewCourses;
    private javax.swing.JButton btnViewGrades;
    private javax.swing.JButton btnViewProfFeedback;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCgpa;
    private javax.swing.JLabel lblCgpat;
    private javax.swing.JLabel lblCourseCount;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblFees;
    private javax.swing.JLabel lblStudentId;
    private javax.swing.JLabel lblStudentName;
    // End of variables declaration//GEN-END:variables
}