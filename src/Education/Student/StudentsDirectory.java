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
public class StudentsDirectory {

    private ArrayList<Student> studentList;

    public StudentsDirectory() {
        this.studentList = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public Student addStudent(String studentId,String name,String username, ArrayList<String>passwordHistory, String currentPassword, String email, String phone, String gpa, ArrayList<Course>courseList, boolean isBlock, boolean isPartOfOrganization ) {
        Student student = new Student();
        student.setCourseList(courseList);
        student.setCurrentPassword(currentPassword);
        student.setEmail(email);
        student.setGpa(gpa);
        student.setIsBlock(isBlock);
        student.setIsPartOfOrganization(isPartOfOrganization);
        student.setName(name);
        student.setPasswordHistory(passwordHistory);
        student.setPhone(phone);
        student.setStudentId(studentId);
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
