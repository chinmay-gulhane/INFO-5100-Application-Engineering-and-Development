/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Admin;

import Education.Professor.Professor;
import Education.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class Admin {
    private String username;
    private String password;
    
    public Admin(String username, String password, ArrayList<Professor> professorAwaitingRegistration, ArrayList<Student> studentAwaitingRegistration) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
  
}
