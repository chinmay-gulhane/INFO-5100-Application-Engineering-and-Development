/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.Address;
import model.Doctor;
import model.Driver;
import model.Insuarance;
import model.Patient;
import model.Person;
import model.Vehicle;

/**
 *
 * @author chinmaygulhane
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    Person person;
    Address address;
    Driver driver;
    Vehicle vehicle;
    Patient patient;
    Doctor doctor;
    Insuarance insuarance;
    
    public MainJFrame() {
        initComponents();
        person = new Person();
        address = new Address();
        driver = new Driver();
        vehicle = new Vehicle();
        patient = new Patient();
        doctor = new Doctor();
        insuarance = new Insuarance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnCreatePerson = new javax.swing.JButton();
        btnCreateAdress = new javax.swing.JButton();
        btnCreateDriver = new javax.swing.JButton();
        btnVehicleRegistration = new javax.swing.JButton();
        btnCreatePaitient = new javax.swing.JButton();
        btnCreateDoctor = new javax.swing.JButton();
        btnCreateInsuaranceCoverage = new javax.swing.JButton();
        btnDisplayPatientReport = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setPreferredSize(new java.awt.Dimension(200, 600));

        btnCreatePerson.setText("Create Person");
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });

        btnCreateAdress.setText("Create Address");
        btnCreateAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAdressActionPerformed(evt);
            }
        });

        btnCreateDriver.setText("Create Driver");
        btnCreateDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDriverActionPerformed(evt);
            }
        });

        btnVehicleRegistration.setText("Create Vehicle");
        btnVehicleRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleRegistrationActionPerformed(evt);
            }
        });

        btnCreatePaitient.setText("Create Patient");
        btnCreatePaitient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePaitientActionPerformed(evt);
            }
        });

        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        btnCreateInsuaranceCoverage.setText("Create Insuarance");
        btnCreateInsuaranceCoverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateInsuaranceCoverageActionPerformed(evt);
            }
        });

        btnDisplayPatientReport.setText("Display Report");
        btnDisplayPatientReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayPatientReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreatePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreatePaitient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateInsuaranceCoverage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDisplayPatientReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVehicleRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateAdress, btnCreateDoctor, btnCreateDriver, btnCreateInsuaranceCoverage, btnCreatePaitient, btnCreatePerson, btnDisplayPatientReport, btnVehicleRegistration});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnCreatePerson)
                .addGap(18, 18, 18)
                .addComponent(btnCreateAdress)
                .addGap(18, 18, 18)
                .addComponent(btnCreateDriver)
                .addGap(18, 18, 18)
                .addComponent(btnVehicleRegistration)
                .addGap(18, 18, 18)
                .addComponent(btnCreatePaitient)
                .addGap(18, 18, 18)
                .addComponent(btnCreateDoctor)
                .addGap(18, 18, 18)
                .addComponent(btnCreateInsuaranceCoverage)
                .addGap(18, 18, 18)
                .addComponent(btnDisplayPatientReport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateAdress, btnCreateDoctor, btnCreateDriver, btnCreateInsuaranceCoverage, btnCreatePaitient, btnCreatePerson, btnDisplayPatientReport, btnVehicleRegistration});

        splitPane.setLeftComponent(controlPanel);

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplayPatientReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayPatientReportActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewPanel = new ViewJPanel(person, address, driver, vehicle, patient, doctor, insuarance);
        splitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnDisplayPatientReportActionPerformed

    private void btnCreateInsuaranceCoverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateInsuaranceCoverageActionPerformed
        // TODO add your handling code here:
        InsuaranceCoverageJPanel viewPanel = new InsuaranceCoverageJPanel(insuarance);
        splitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnCreateInsuaranceCoverageActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        CreateDoctorJPanel viewPanel = new CreateDoctorJPanel(doctor);
        splitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void btnCreatePaitientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePaitientActionPerformed
        // TODO add your handling code here:
        CreatePatientJPanel viewPanel = new CreatePatientJPanel(patient);
        splitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnCreatePaitientActionPerformed

    private void btnVehicleRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleRegistrationActionPerformed
        // TODO add your handling code here:
        CreateVehicleRegistrationJPanel vehicleRegistrationPanel = new CreateVehicleRegistrationJPanel(vehicle);
        splitPane.setRightComponent(vehicleRegistrationPanel);
    }//GEN-LAST:event_btnVehicleRegistrationActionPerformed

    private void btnCreateDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDriverActionPerformed
        // TODO add your handling code here:
        CreateDriverJPanel viewPanel = new CreateDriverJPanel(driver);
        splitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnCreateDriverActionPerformed

    private void btnCreateAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAdressActionPerformed
        // TODO add your handling code here:
        CreateAddrJPanel addressPanel = new CreateAddrJPanel(address);
        splitPane.setRightComponent(addressPanel);
    }//GEN-LAST:event_btnCreateAdressActionPerformed

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
        // TODO add your handling code here:
        CreatePerJPanel createPanel = new CreatePerJPanel(person);
        splitPane.setRightComponent(createPanel);
    }//GEN-LAST:event_btnCreatePersonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAdress;
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnCreateDriver;
    private javax.swing.JButton btnCreateInsuaranceCoverage;
    private javax.swing.JButton btnCreatePaitient;
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.JButton btnDisplayPatientReport;
    private javax.swing.JButton btnVehicleRegistration;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
