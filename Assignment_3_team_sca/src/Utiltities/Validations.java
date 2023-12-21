/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utiltities;

/**
 *
 * @author ASUS
 */
public class Validations {
    
    public static boolean validatePassword(String password) {
    // Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.
    return !password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$");
  }
    
    public static boolean validateUsername(String username) {
        return !username.matches("^[a-zA-Z0-9.\\s]{5,15}$");
    }
    
    public static boolean validateEmail(String email) {
        return !email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
            
    public static boolean validatePhone(String phone) {
        return !phone.matches("^\\(\\d{3}\\)\\s\\d{3}-\\d{4}$");
    }
    
    
    
    
    
    
}
