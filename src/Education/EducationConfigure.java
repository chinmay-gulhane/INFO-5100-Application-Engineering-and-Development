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
        education.getCourseDirectory().addCourse("Application Modeling and Design", "INFO 5001", "Information Systems Programs", "AA111", 4, 9.4);
        education.getCourseDirectory().addCourse("Application Engineering and Development", "INFO 5101", "Information Systems Programs", "AA111", 4, 7);
        education.getCourseDirectory().addCourse("Web Design and User Experience Engineering", "INFO 6150", "Information Systems Programs", "AA112", 4, 10);
        education.getCourseDirectory().addCourse("Program Structure and Algorithms", "INFO 6150", "Information Systems Programs", "AA112", 4, 9.1);
        education.getCourseDirectory().addCourse("Concepts of Object-Oriented Design", "CSYE 6200", "Computer Systems Engineering", "AA113", 4, 8.5);
        education.getCourseDirectory().addCourse("Enterprise Software Design", "CSYE 6620", "Computer Systems Engineering", "AA114", 4, 8.5);
        education.getCourseDirectory().addCourse("Introduction to Cooperative Education", "CSYE 6200", "Computer Systems Engineering", "AA113", 4, 8.5);
      //  education.getProfessorsDirectory().addProfessor(professorId, username, name, currentPassword, email, phone, courseList, courseScheduleList);
      //  education.getCourseScheduleDirectory().addCourseSchedule(scheduleId, courseList, startDate, endDate, term, 0, teachingProfessor);
      //  education.getStudentsDirectory().addStudent(studentId, name, username, passwordHistory, currentPassword, email, phone, gpa, courseList, true, true);
        return education;
    }
}