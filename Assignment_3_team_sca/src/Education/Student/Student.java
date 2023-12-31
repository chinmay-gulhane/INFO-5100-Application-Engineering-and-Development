/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Student;

import Education.Employer.JobPosting;
import Utiltities.GraduationStatus;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap; 
import java.util.List;
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
    Map<String, Double> grades = new HashMap<>();
    private String status;
    private boolean isPartOfOrganization; 
    private double amountOwed;
    private GraduationStatus graduationStatus;
    // Map to track applied jobs and their application status
    private Map<JobPosting, String> appliedJobs;
    // Map to track feedbacks from employers     
    private Map<JobPosting, String> feedbacks;

    public GraduationStatus getGraduationStatus() {
        return graduationStatus;
    }

    public void setGraduationStatus(GraduationStatus graduationStatus) {
        this.graduationStatus = graduationStatus;
    }

    public double getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(double amountOwed) {
        this.amountOwed = amountOwed;
    }
    
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

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
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

    public Student() {
        this.appliedJobs = new HashMap<>();
        this.feedbacks = new HashMap<>();
    }
   
     public Map<JobPosting, String> getAppliedJobs() {
        return appliedJobs;
    }

    public void applyForJob(JobPosting jobPosting) {
        this.appliedJobs.put(jobPosting, "Pending");
        jobPosting.addApplicant(this);
    }

    public List<JobPosting> getUnappliedJobs(List<JobPosting> allJobs) {
        List<JobPosting> unappliedJobs = new ArrayList<>(allJobs);
        unappliedJobs.removeAll(this.appliedJobs.keySet());
        return unappliedJobs;
    }
    
     public void addFeedback(JobPosting jobPosting, String feedback) {
        this.feedbacks.put(jobPosting, feedback);
    }

    public Map<JobPosting, String> getFeedbacks() {
        return feedbacks;
    }
}
