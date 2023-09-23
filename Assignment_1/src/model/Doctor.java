/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chinmaygulhane
 */
public class Doctor {
   private long doctorID;
   private String name;
   private long contactNumber;    
   private String emailId;
   private String speciality;
   private String licenseNumber;
   private String medicalSchool;

    @Override
    public String toString() {
        return "Doctor\n" + "Doctor ID: " + doctorID + "\n Name: " + name + "\n Contact Number: " + contactNumber + "\n Email Id: " + emailId + "\n Speciality=" + speciality + "\n License Number: " + licenseNumber + "\n Medical School: " + medicalSchool + '\n';
    }
    

    public long getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(long doctorID) {
        this.doctorID = doctorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getMedicalSchool() {
        return medicalSchool;
    }

    public void setMedicalSchool(String medicalSchool) {
        this.medicalSchool = medicalSchool;
    }
}
