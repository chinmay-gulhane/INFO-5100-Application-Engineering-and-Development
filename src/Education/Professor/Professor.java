/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Professor;

import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class Professor {
    private String professorId;
    private String username;
    private String name;
    private ArrayList<String>passwordHistory = new ArrayList<String>();
    private String currentPassword;
    private String email;
    private String phone;
    private String status;
    private boolean isPartOfOrganization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
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
        return this.getProfessorId();
    }
    
}
