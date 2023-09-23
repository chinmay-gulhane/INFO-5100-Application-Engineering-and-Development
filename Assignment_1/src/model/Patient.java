/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chinmaygulhane
 */
public class Patient extends Person {
    private long patientID;
    private String primaryDoctor;
    private String dateOfLastVisit;
    private String dateOfNextAppointment;
    private String onMedication; // yes or no
    private String allergies; // yes or no

    @Override
    public String toString() {
        return "Patient:\n" + "Patient ID: " + patientID + "\n Primary Doctor: " + primaryDoctor + "\n Date Of Last Visit:" + dateOfLastVisit + "\n Date Of Next Appointment: " + dateOfNextAppointment + "\n Allergies: " + allergies + "\n On Medication: " + onMedication + '\n';
    }

    public long getPatientID() {
        return patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public String getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(String primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }

    public String getDateOfLastVisit() {
        return dateOfLastVisit;
    }

    public void setDateOfLastVisit(String dateOfLastVisit) {
        this.dateOfLastVisit = dateOfLastVisit;
    }

    public String getDateOfNextAppointment() {
        return dateOfNextAppointment;
    }

    public void setDateOfNextAppointment(String dateOfNextAppointment) {
        this.dateOfNextAppointment = dateOfNextAppointment;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getOnMedication() {
        return onMedication;
    }

    public void setOnMedication(String onMedication) {
        this.onMedication = onMedication;
    }
    
    
}
