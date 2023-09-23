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
public class Driver {
    private String licenseNumber;
    private String issueDate;
    private String expirationDate; 
//    private Date issueDate;
//    private Date expirationDate; 

    @Override
    public String toString() {
        return "Driver:\n" + "License Number: " + licenseNumber + "\n Issue Date: " + issueDate + "\n Expiration Date=" + expirationDate + '\n';
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
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
    
}
