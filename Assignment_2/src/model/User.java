/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author chinmaygulhane
 */
public class User extends Person {
    
    private String userName;
    private String password;
    private String enabledStaus;
    private String NUID;
    private String role;
    private List<String> previousPasswords;

    public User() {
        this.previousPasswords = new ArrayList<String>(); 
    }
    
    

    public List<String> getPreviousPasswords() {
        return previousPasswords;
    }

    public void setPreviousPasswords(List<String> previousPasswords) {
        this.previousPasswords = previousPasswords;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        // Hash the password
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        this.password = hashedPassword;
        previousPasswords.add(hashedPassword);
        
    }
    
    public boolean isPasswordValid (String password){
        String newPassword = password;
        System.out.println("new pass word"+newPassword);
        Boolean passValid = true;
        for(String prevPassword: previousPasswords){
            if(BCrypt.checkpw(newPassword, prevPassword)){
                passValid = false;
            }
        }        
        return passValid;
    }

    public String getEnabledStaus() {
        return enabledStaus;
    }

    public void setEnabledStaus(String enabledStaus) {
        this.enabledStaus = enabledStaus;
    }

    @Override
    public String toString() {
        return NUID;
    }
    
    
}
