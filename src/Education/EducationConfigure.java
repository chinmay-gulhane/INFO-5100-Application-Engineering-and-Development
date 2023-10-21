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
        education.getCourseDirectory().addCourse("Application Modeling and Design", "INFO 5001", "Information Systems Programs", "P1000", 4, 9.4);
        education.getCourseDirectory().addCourse("Application Engineering and Development", "INFO 5101", "Information Systems Programs", "P1000", 4, 7);
        education.getCourseDirectory().addCourse("Web Design and User Experience Engineering", "INFO 6150", "Information Systems Programs", "P1001", 4, 10);
        education.getCourseDirectory().addCourse("Program Structure and Algorithms", "INFO 6150", "Information Systems Programs", "P1001", 4, 9.1);
        education.getCourseDirectory().addCourse("Concepts of Object-Oriented Design", "CSYE 6200", "Computer Systems Engineering", "P1002", 4, 8.5);
        education.getCourseDirectory().addCourse("Enterprise Software Design", "CSYE 6620", "Computer Systems Engineering", "P1003", 3, 8.5);
        education.getCourseDirectory().addCourse("Introduction to Cooperative Education", "ENCP 6100", "Engineering Cooperative Education", "P1004", 1, 9.5);
        education.getCourseDirectory().addCourse("Career Management for Engineers", "ENCP 6100", "Engineering Cooperative Education", "P1005", 1, 8.5);        
        education.getCourseDirectory().addCourse("Programming with Data", "DS 2000", "Data Science", "P1006", 3, 8.5);
        education.getCourseDirectory().addCourse("Data Science Programming Practicum", "DS 2010", "Data Science", "P1007", 3, 8.5);
        education.getCourseDirectory().addCourse("Introduction to Data Mining/Machine Learning", "DA 5030", "Data Analytics", "P1008", 2, 8.5);
        education.getCourseDirectory().addCourse("Systems Security", "CY 3740", "Cybersecurity", "P100", 2, 8.5);              
        
//        education.getProfessorsDirectory().addProfessor("P1000", "SarMil", "Dr. Sarah Miller", "SarMil", "sarah.miller@eduverse.edu", "(555) 555-5555", courseList, courseScheduleList);
//        education.getProfessorsDirectory().addProfessor("P1001", "MicJoh", "Dr. Michael Johnson", "MicJoh", "michael.johnson@eduverse.edu", "(555) 555-5556", courseList, courseScheduleList);
//        education.getProfessorsDirectory().addProfessor("P1002", "EmiSmi", "Dr. Emily Smith", "EmiSmi", "emily.smith@eduverse.edu", "(555) 555-5555", courseList, courseScheduleList);
//        education.getProfessorsDirectory().addProfessor("P1003", "DavDav", "Dr. David Davis", "DavDav", "david.davis@eduverse.edu", "(555) 555-5555", courseList, courseScheduleList);
//        education.getProfessorsDirectory().addProfessor("P1004", "JenWhi", "Dr. Jennifer White", "JenWhi", "jennifer.white@eduverse.edu", "(555) 555-5555", courseList, courseScheduleList);
//        education.getProfessorsDirectory().addProfessor("P1005", "RicBro", "Dr. Richard Brown", "RicBro", "richard.brown@eduverse.edu", "(555) 555-5555", courseList, courseScheduleList);
//        education.getProfessorsDirectory().addProfessor("P1006", "MarGon", "Dr. Maria Gonzalez", "MarGon", "sarah.miller@eduverse.edu", "(555) 555-5555", courseList, courseScheduleList);
//        education.getProfessorsDirectory().addProfessor("P1007", "BenWil", "Dr. Benjamin Wilson", "BenWil", "sarah.miller@eduverse.edu", "(555) 555-5555", courseList, courseScheduleList);
//        education.getProfessorsDirectory().addProfessor("P1008", "LauTay", "Dr. Laura Taylor", "LauTay", "sarah.miller@eduverse.edu", "(555) 555-5555", courseList, courseScheduleList);
//        education.getProfessorsDirectory().addProfessor("P1009", "MatCla", "Dr. Matthew Clark", "MatCla", "sarah.miller@eduverse.edu", "(555) 555-5555", courseList, courseScheduleList);
//        
//        education.getCourseScheduleDirectory().addCourseSchedule(1, courseList, "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
//        education.getCourseScheduleDirectory().addCourseSchedule(1, courseList, "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
//        education.getCourseScheduleDirectory().addCourseSchedule(1, courseList, "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
//        education.getCourseScheduleDirectory().addCourseSchedule(1, courseList, "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
//        education.getCourseScheduleDirectory().addCourseSchedule(1, courseList, "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
//        education.getCourseScheduleDirectory().addCourseSchedule(1, courseList, "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
//        education.getCourseScheduleDirectory().addCourseSchedule(1, courseList, "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
//        education.getCourseScheduleDirectory().addCourseSchedule(1, courseList, "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
//        education.getCourseScheduleDirectory().addCourseSchedule(1, courseList, "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
//        education.getCourseScheduleDirectory().addCourseSchedule(1, courseList, "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
//        education.getCourseScheduleDirectory().addCourseSchedule(1, courseList, "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
//        education.getCourseScheduleDirectory().addCourseSchedule(1, courseList, "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
//                                
//        
//        education.getStudentsDirectory().addStudent(studentId, name, username, passwordHistory, currentPassword, email, phone, gpa, courseList, true, true);
//        
        return education;
    }
}