/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.JOptionPane;
import model.Person;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author chinmaygulhane
 */
public class CreatePerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Person person; 
    Image pic;
    ImageIcon imageIcon;
    public CreatePerJPanel(Person person) {
        initComponents();
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblBirthDate = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtPerName = new javax.swing.JTextField();
        txtPerAge = new javax.swing.JTextField();
        txtPerPhone = new javax.swing.JTextField();
        txtPerEmail = new javax.swing.JTextField();
        txtPerSsn = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        txtPerBirthDate = new javax.swing.JTextField();
        BtnUpldPhoto = new javax.swing.JButton();
        PersonPic = new javax.swing.JLabel();
        txtPerWebsiteUrl = new javax.swing.JTextField();
        lblWebUrl = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        txtPerCountry = new javax.swing.JTextField();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Person");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Name:");

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age:");

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");

        lblContactNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactNumber.setText("Contact Number:");

        lblEmailId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailId.setText("Email Id:");

        lblSSN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSSN.setText("SSN:");

        lblBirthDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBirthDate.setText("BIrth Date:");

        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoto.setText("Photo:");

        txtPerAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerAgeActionPerformed(evt);
            }
        });

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        BtnUpldPhoto.setText("Browse");
        BtnUpldPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpldPhotoActionPerformed(evt);
            }
        });

        lblWebUrl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWebUrl.setText("Website Url:");

        lblCountry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCountry.setText("BIrth Country:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEmailId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSSN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblWebUrl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPerPhone)
                            .addComponent(txtPerEmail)
                            .addComponent(txtPerSsn)
                            .addComponent(genderComboBox, 0, 140, Short.MAX_VALUE)
                            .addComponent(txtPerBirthDate)
                            .addComponent(txtPerWebsiteUrl)
                            .addComponent(txtPerCountry)
                            .addComponent(txtPerAge, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSave)
                                .addComponent(BtnUpldPhoto))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(PersonPic, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPerName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtPerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtPerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblContactNumber)
                    .addComponent(txtPerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailId)
                    .addComponent(txtPerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBirthDate)
                    .addComponent(txtPerBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWebUrl)
                    .addComponent(txtPerWebsiteUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry)
                    .addComponent(txtPerCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoto)
                            .addComponent(BtnUpldPhoto))
                        .addGap(50, 50, 50)
                        .addComponent(btnSave))
                    .addComponent(PersonPic, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPerAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerAgeActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        // Validation if any field is left empty
        if(txtPerName.getText().isEmpty() || txtPerAge.getText().isEmpty() || txtPerEmail.getText().isEmpty() || txtPerCountry.getText().isEmpty()
         || txtPerPhone.getText().isEmpty() || txtPerSsn.getText().isEmpty() || txtPerBirthDate.getText().isEmpty() || PersonPic.getIcon() == null
         || txtPerWebsiteUrl.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Please enter all the fields");
            return; 
        }
        
        String name = txtPerName.getText();
        String age = txtPerAge.getText();
        String email = txtPerEmail.getText();
        String websiteUrl = txtPerWebsiteUrl.getText();
        String country = txtPerCountry.getText();
        long contactNo =Long.parseLong(txtPerPhone.getText()); 
        String ssn= txtPerSsn.getText();
        String gender = (String) genderComboBox.getSelectedItem();
        String birthDate = txtPerBirthDate.getText();
        ImageIcon img = (ImageIcon) PersonPic.getIcon();
        
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setContactNumber(contactNo);
        person.setEmailId(email);
        person.setWebSiteUrl(websiteUrl);
        person.setCountry(country);
        person.setSsn(ssn);
        person.setBirthDate(birthDate);
        person.setImageIcon(img);
        
        JOptionPane.showMessageDialog(this, "Person Information Saved");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void BtnUpldPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpldPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser uploadFile = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGES", "png", "jpg","jpeg");
        uploadFile.addChoosableFileFilter(filter);
        int showOpenDialogue = uploadFile.showOpenDialog(null);

        if (showOpenDialogue ==JFileChooser.APPROVE_OPTION){
            File selectedImgFile = uploadFile.getSelectedFile();
            String selectedImagePath = selectedImgFile.getAbsolutePath();
            ImageIcon Img = new ImageIcon(selectedImagePath);
            pic = Img.getImage().getScaledInstance(PersonPic.getWidth(), PersonPic.getHeight(), Image.SCALE_SMOOTH);
            PersonPic.setIcon(new ImageIcon(pic));
            PersonPic.setVisible(true);

        }
    }//GEN-LAST:event_BtnUpldPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUpldPhoto;
    private javax.swing.JLabel PersonPic;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWebUrl;
    private javax.swing.JTextField txtPerAge;
    private javax.swing.JTextField txtPerBirthDate;
    private javax.swing.JTextField txtPerCountry;
    private javax.swing.JTextField txtPerEmail;
    private javax.swing.JTextField txtPerName;
    private javax.swing.JTextField txtPerPhone;
    private javax.swing.JTextField txtPerSsn;
    private javax.swing.JTextField txtPerWebsiteUrl;
    // End of variables declaration//GEN-END:variables
}