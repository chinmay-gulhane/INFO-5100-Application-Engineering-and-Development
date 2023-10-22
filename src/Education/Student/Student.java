/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Student;

import Education.Courses.Course;
import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class Student {
    private String studentId;
    private String name;
    private String username;
    private ArrayList<String>passwordHistory = new ArrayList<String>();
    private String currentPassword;
    private String email;
    private String phone;
    private double gpa;
    private ArrayList<String>scheduleId = new ArrayList<String>();
    private String status;
    private boolean isPartOfOrganization;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<String> getPasswordHistory() {
        return passwordHistory;
    }

    public void setPasswordHistory(ArrayList<String> passwordHistory) {
        this.passwordHistory = passwordHistory;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<String> getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(ArrayList<String> scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isIsPartOfOrganization() {
        return isPartOfOrganization;
    }

    public void setIsPartOfOrganization(boolean isPartOfOrganization) {
        this.isPartOfOrganization = isPartOfOrganization;
    }
    
    @Override
    public String toString(){
        return this.getStudentId();
    }
    
}
