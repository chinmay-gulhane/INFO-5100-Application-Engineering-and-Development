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
    private ArrayList<Professor> professorAwaitingRegistration;
    private ArrayList<Student> studentAwaitingRegistration;

    public Admin(String username, String password, ArrayList<Professor> professorAwaitingRegistration, ArrayList<Student> studentAwaitingRegistration) {
        this.username = username;
        this.password = password;
        this.professorAwaitingRegistration = new ArrayList<Professor>();
        this.studentAwaitingRegistration = new ArrayList<Student>();
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

    public ArrayList<Professor> getProfessorAwaitingRegistration() {
        return professorAwaitingRegistration;
    }

    public void setProfessorAwaitingRegistration(ArrayList<Professor> professorAwaitingRegistration) {
        this.professorAwaitingRegistration = professorAwaitingRegistration;
    }

    public ArrayList<Student> getStudentAwaitingRegistration() {
        return studentAwaitingRegistration;
    }

    public void setStudentAwaitingRegistration(ArrayList<Student> studentAwaitingRegistration) {
        this.studentAwaitingRegistration = studentAwaitingRegistration;
    }
      
}
