/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Student;

import java.util.ArrayList;

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

    public Student addStudent(String studentId,String name,String username, String currentPassword, String email, String phone, double gpa, ArrayList<String>scheduleId, String status, boolean isPartOfOrganization ) {
        Student student = new Student();
        student.setScheduleId(scheduleId);
        student.setCurrentPassword(currentPassword);
        student.setEmail(email);
        student.setGpa(gpa);
        student.setStatus(status);
        student.setIsPartOfOrganization(isPartOfOrganization);
        student.setName(name);
        student.setPhone(phone);
        if(studentId.equals("")){
           student.setStudentId("S" + studCount);
           studCount++;
        }else{
           student.setStudentId(studentId);
       }
        student.setUsername(username);
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
