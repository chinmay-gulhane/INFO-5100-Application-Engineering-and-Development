/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author chinmaygulhane
 */
public class Vehicle {
    
    // Fields for vehicle registration
    private String registrationNumber;
    private String issueDate;
    private String expirationDate;
//    private Date issueDate;
//    private Date expirationDate;
    private String model;
    private long year;

    @Override
    public String toString() {
        return "Vehicle\n" + "Registration Number: " + registrationNumber + "\n Issue Date: " + issueDate + "\n Expiration Date: " + expirationDate + "\n Model: " + model + "\n Year: " + year + '\n';
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

//    public Date getIssueDate() {
//        return issueDate;
//    }
//
//    public void setIssueDate(Date issueDate) {
//        this.issueDate = issueDate;
//    }
//
//    public Date getExpirationDate() {
//        return expirationDate;
//    }
//
//    public void setExpirationDate(Date expirationDate) {
//        this.expirationDate = expirationDate;
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }
    
    
}
