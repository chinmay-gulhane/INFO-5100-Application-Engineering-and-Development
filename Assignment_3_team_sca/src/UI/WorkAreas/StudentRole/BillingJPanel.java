/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.StudentRole;

import Education.Courses.Course;
import Education.Courses.CourseSchedule;
import Education.Education;
import Education.Student.Student;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author samik
 */
public class BillingJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Education education;
    private Student student;

    /**
     * Creates new form BillingJPanel
     */
    BillingJPanel(JPanel userProcessContainer, Education education, Student student) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.education = education;
        this.student = student;
        showBilling();
    }

    private void showBilling() {
        double amountOwed = student.getAmountOwed();
        txtAmount.setText(amountOwed + " $");
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
        btnPayment = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblWelcomeAdmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Amount Owed: ");

        btnPayment.setBackground(new java.awt.Color(0, 0, 0));
        btnPayment.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPayment.setForeground(new java.awt.Color(255, 255, 255));
        btnPayment.setText("Make a Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        txtAmount.setEditable(false);

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblWelcomeAdmin.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblWelcomeAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomeAdmin.setText("Make Payment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPayment)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack))
                            .addComponent(txtAmount))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblWelcomeAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblWelcomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPayment)
                    .addComponent(btnBack))
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // TODO add your handling code here:
        if(student.getAmountOwed()<=0){
            JOptionPane.showMessageDialog(null, "To proceed with the payment amount should be a postive number!", "ALERT_MESSAGE", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Are you certain you wish to proceed with the payment?", "ALERT_MESSAGE", JOptionPane.WARNING_MESSAGE);
        double amountOwed = student.getAmountOwed();
        String path = "";
        JFileChooser jFile = new JFileChooser();
        jFile.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = jFile.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = jFile.getSelectedFile().getPath();
        }
        Document doc = new Document();

        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "/billing.pdf"));
            doc.open();
            Paragraph title = new Paragraph("EDUVERSE BILLING");
            title.setSpacingBefore(20f);
            title.setSpacingAfter(20f);
            title.setAlignment(Element.ALIGN_CENTER);
            doc.add(title);
            Paragraph name = new Paragraph("Student Name: " + student.getName());
            name.setSpacingBefore(5f);
            name.setSpacingAfter(5f);
            doc.add(name);
            Paragraph nameId = new Paragraph("Student Id: " + student.getStudentId());
            nameId.setSpacingBefore(20f);
            nameId.setSpacingAfter(20f);
            doc.add(nameId);
            PdfPTable tblCertificate = new PdfPTable(2);
            tblCertificate.addCell("Amount to be paid");
            tblCertificate.addCell("Payment Status");
            tblCertificate.addCell(amountOwed + "$");
            tblCertificate.addCell("Paid");
            doc.add(tblCertificate);
            Paragraph concern = new Paragraph("If you have any questions or concerns, feel free to reach out to us.");
            concern.setSpacingBefore(100f);
            doc.add(concern);
            Paragraph email = new Paragraph("Email: admin@eduverse.edu");
            email.setSpacingAfter(20f);
            doc.add(email);
            Paragraph electronicStatement = new Paragraph("This is an electronically generated document and doesn't require any signature or external verification.");
            electronicStatement.setSpacingBefore(50f);
            doc.add(electronicStatement);
            doc.close();
            JOptionPane.showMessageDialog(null, "Downloaded PDF File", "ALERT_MESSAGE", JOptionPane.WARNING_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TranscriptJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(TranscriptJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        student.setAmountOwed(0.0);
    }//GEN-LAST:event_btnPaymentActionPerformed

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
    private javax.swing.JButton btnPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblWelcomeAdmin;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
