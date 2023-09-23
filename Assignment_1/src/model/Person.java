/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author chinmaygulhane
 */
public class Person {
    
    private String name;
    private String age;
    private String gender;
    private long contactNumber;
    private ImageIcon imageIcon;
    private File image; 
    private String emailId;
    private String webSiteUrl;
    private String ssn;
    private String birthDate;
    private String country;
//    private Date birthDate;

    @Override
    public String toString() {
        return "Person:\n" + "Name: " + name + "\n Age: " + age + "\n gender: " + gender + "\n Contact Number: " + contactNumber + "\n Email Id: " + emailId + "\n Web Site Url=" + webSiteUrl + "\n SSN: " + ssn + "\n Birth Date: " + birthDate + "\n Country:" + country + '\n';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getWebSiteUrl() {
        return webSiteUrl;
    }

    public void setWebSiteUrl(String webSiteUrl) {
        this.webSiteUrl = webSiteUrl;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    

    
   
}
