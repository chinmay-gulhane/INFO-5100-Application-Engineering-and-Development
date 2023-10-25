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
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samik
 */
public class ViewCourseTableJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Education education;
    private Student student;
    
    /**
     * Creates new form ViewCourseTableJPanel
     */

    ViewCourseTableJPanel(JPanel userProcessContainer, Education education, Student student) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education; 
        this.student = student;
        populateTable();
    }
    
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblViewCourse.getModel();
        dtm.setRowCount(0);
        for(CourseSchedule cs:education.getCourseScheduleDirectory().getCourseScheduleList()){
            if(cs.getScheduleId().equals(student.getScheduleId()))
            {
                for(Course c:education.getCourseDirectory().getCourseList())
                {
                    for(Professor p:education.getProfessorsDirectory().getProfessorList())
                    {
                        if(p.getProfessorId().equals(cs.getTeachingProfessorId()))
                        {
                            
                        }
                    }
                }
                
       //         dtm.addRow(row);
            }      
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
        tblViewCourse = new javax.swing.JTable();

        tblViewCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course Id", "Course Topic", "Course Name", "Professor Name", "Schedule"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewCourse);
        if (tblViewCourse.getColumnModel().getColumnCount() > 0) {
            tblViewCourse.getColumnModel().getColumn(0).setResizable(false);
            tblViewCourse.getColumnModel().getColumn(1).setResizable(false);
            tblViewCourse.getColumnModel().getColumn(2).setResizable(false);
            tblViewCourse.getColumnModel().getColumn(3).setResizable(false);
            tblViewCourse.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewCourse;
    // End of variables declaration//GEN-END:variables
}
