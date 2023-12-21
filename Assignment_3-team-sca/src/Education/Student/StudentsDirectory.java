/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Student;

import Utiltities.GraduationStatus;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author samik
 */
public class StudentsDirectory {

    private ArrayList<Student> studentList;
    int studCount;
    
    public StudentsDirectory() {
        this.studentList = new ArrayList<Student>();
        studCount = 1051;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public Student addStudent(String studentId,String name,String username, String currentPassword, String email, String phone, double gpa, Map<String, Double> grades, String status, boolean isPartOfOrganization, double amountOwed, GraduationStatus graduationStatus, ArrayList<String> passwordHistory) {
        Student student = new Student();
        student.setGrades(grades);
        student.setCurrentPassword(currentPassword);
        student.setEmail(email);
        student.setGpa(gpa);
        student.setStatus(status);
        student.setIsPartOfOrganization(isPartOfOrganization);
        student.setName(name);
        student.setPhone(phone);
        student.setGraduationStatus(graduationStatus);
        if(studentId.equals("")){
           student.setStudentId("S" + studCount);
           studCount++;
        }else{
           student.setStudentId(studentId);
       }
        student.setUsername(username);
        student.setAmountOwed(amountOwed);
        student.setPasswordHistory(passwordHistory);
        studentList.add(student);
        return student;
    }

    public void deleteStudent(Student student) {
        studentList.remove(student);
    }

    public Student searchUser(String studentId) {
        for (Student us : studentList) {
            if (us.getStudentId().equals(studentId)) {
                return us;
            }
        }
        return null;
    }
}
