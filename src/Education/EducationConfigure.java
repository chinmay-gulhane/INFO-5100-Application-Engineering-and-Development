/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education;

import Education.Professor.Professor;
import Education.Student.Student;

/**
 *
 * @author ASUS
 */
public class EducationConfigure {
    public static Education initialize(){
        Education education = new Education("Eduverse");
        Professor professor = education.getProfessorsDirectory().addProfessor();
        professor.setProfessorId("profID");
        professor.setUsername("professor");
        professor.setCurrentPassword("professor");
        Student student = education.getStudentsDirectory().addStudent();
        student.setStudentId("studID");
        student.setStudentId("student");
        student.setCurrentPassword("student");
        return education;
    }
}
