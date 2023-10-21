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
        education.getCourseDirectory().addCourse("Career Management for Engineers", "ENCP 6101", "Engineering Cooperative Education", "P1005", 1, 8.5);        
        education.getCourseDirectory().addCourse("Programming with Data", "DASC 2000", "Data Science", "P1006", 3, 8.5);
        education.getCourseDirectory().addCourse("Data Science Programming Practicum", "DASC 2010", "Data Science", "P1007", 3, 8.5);
        education.getCourseDirectory().addCourse("Introduction to Data Mining/Machine Learning", "DANA 5030", "Data Analytics", "P1008", 2, 8.5);
        education.getCourseDirectory().addCourse("Systems Security", "CYSC 3740", "Cybersecurity", "P100", 2, 8.5);              
        
        education.getCourseScheduleDirectory().addCourseSchedule("S1000", "INFO 5001" , "01/08/2022", "01/12/2022", "Fall", 2022, "P1000", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("S1001", "INFO 5001", "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("S1002", "INFO 5101", "01/01/2022", "01/04/2022", "Spring", 2022, "P1001", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("S1003", "INFO 5101", "01/08/2022", "01/12/2022", "Fall", 2022, "P1002", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("S1004", "INFO 6150", "01/08/2021", "01/12/2021", "Fall", 2021, "P1003", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("S1005", "CSYE 6200", "01/08/2022", "01/12/2022", "Fall", 2022, "P1004", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("S1006", "CSYE 6620", "01/01/2023", "01/04/2023", "Spring", 2023, "P1004", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("S1007", "CSYE 6620", "01/08/2021", "01/12/2021", "Fall", 2021, "P1005", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("S1008", "ENCP 6100", "01/08/2023", "01/12/2023", "Fall", 2023, "P1006", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("S1009", "ENCP 6101", "01/01/2020", "01/04/2020", "Spring", 2020, "P1007", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("S1010", "DASC 2000", "01/08/2020", "01/12/2020", "Fall", 2020, "P1008", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("S1011", "DASC 2010", "01/08/2023", "01/12/2023", "Fall", 2023, "P1009", "English", "Boston");
                                
        education.getProfessorsDirectory().addProfessor("P1000", "SarMil", "Dr. Sarah Miller", "SarMil", "sarah.miller@eduverse.edu", "(555) 555-5555", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1001", "MicJoh", "Dr. Michael Johnson", "MicJoh", "michael.johnson@eduverse.edu", "(555) 555-5556", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1002", "EmiSmi", "Dr. Emily Smith", "EmiSmi", "emily.smith@eduverse.edu", "(781) 555-5557",  "Active", true);
        education.getProfessorsDirectory().addProfessor("P1003", "DavDav", "Dr. David Davis", "DavDav", "david.davis@eduverse.edu", "(721) 555-5558",  "Active", true);
        education.getProfessorsDirectory().addProfessor("P1004", "JenWhi", "Dr. Jennifer White", "JenWhi", "jennifer.white@eduverse.edu", "(581) 555-5559",  "Active", true);
        education.getProfessorsDirectory().addProfessor("P1005", "RicBro", "Dr. Richard Brown", "RicBro", "richard.brown@eduverse.edu", "(555) 555-5225",  "Active", true);
        education.getProfessorsDirectory().addProfessor("P1006", "MarGon", "Dr. Maria Gonzalez", "MarGon", "sarah.miller@eduverse.edu", "(452) 555-2322","Active", true);
        education.getProfessorsDirectory().addProfessor("P1007", "BenWil", "Dr. Benjamin Wilson", "BenWil", "sarah.miller@eduverse.edu", "(555) 214-5555",  "Active", true);
        education.getProfessorsDirectory().addProfessor("P1008", "LauTay", "Dr. Laura Taylor", "LauTay", "sarah.miller@eduverse.edu", "(651) 555-3024",  "Active", true);
        education.getProfessorsDirectory().addProfessor("P1009", "MatCla", "Dr. Matthew Clark", "MatCla", "sarah.miller@eduverse.edu", "(872) 555-1045", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1010", "OliTur", "Dr. Olivia Turner", "OliTur", "olivia.turner@eduverse.edu", "(555) 781-5874", "Active", false);
        education.getProfessorsDirectory().addProfessor("P1011", "HenMit", "Dr. Henry Mitchell", "HenMit", "henry.mitchell@eduverse.edu", "(555) 234-5555",  "Active", true);
        education.getProfessorsDirectory().addProfessor("P1012", "SopAnd", "Dr. Sophia Anderson", "SopAnd", "sophia.anderson@eduverse.edu", "(555) 124-2365",  "Active", true);        
        
    //    education.getStudentsDirectory().addStudent(studentId, name, username, passwordHistory, currentPassword, email, phone, gpa, courseList, true, true);
        
        return education;
    }
}