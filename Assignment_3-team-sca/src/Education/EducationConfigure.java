/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education;

import Utiltities.GraduationStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author ASUS
 */
public class EducationConfigure {

    public static Education initialize() {
        Education education = new Education("Eduverse");
        String salt = BCrypt.gensalt();
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

        education.getCourseScheduleDirectory().addCourseSchedule("SH1000", "INFO 5001", "01/08/2024", "01/12/2024", "Fall", 2024, "P1000", "English", "Boston", 9.2);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1001", "INFO 5001", "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston", 8.3);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1002", "INFO 5101", "01/01/2022", "01/04/2022", "Spring", 2022, "P1001", "English", "Boston", 8.7);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1003", "INFO 5101", "01/08/2022", "01/12/2022", "Fall", 2022, "P1002", "English", "Boston", 9.1);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1004", "INFO 6150", "01/08/2021", "01/12/2021", "Fall", 2021, "P1003", "English", "Boston", 7.8);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1005", "CSYE 6200", "01/08/2022", "01/12/2022", "Fall", 2022, "P1004", "English", "Boston",7.9);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1006", "CSYE 6620", "01/01/2023", "01/04/2023", "Spring", 2023, "P1004", "English", "Boston", 8.4);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1007", "CSYE 6620", "01/08/2021", "01/12/2021", "Fall", 2021, "P1005", "English", "Boston", 7.2);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1008", "ENCP 6100", "01/08/2023", "01/12/2023", "Fall", 2023, "P1006", "English", "Boston", 9.4);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1009", "ENCP 6101", "01/01/2020", "01/04/2020", "Spring", 2022, "P1007", "English", "Boston", 8.6);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1010", "DASC 2000", "01/08/2020", "01/12/2020", "Fall", 2020, "P1008", "English", "Boston", 7.8);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1011", "DASC 2010", "01/08/2023", "01/12/2023", "Fall", 2023, "P1009", "English", "Boston", 8.9);
        
        ArrayList<String> passHistory = new ArrayList<>();
        passHistory.add("SarMil123");
        String Cpassword = BCrypt.hashpw("SarMil123", salt);
        education.getProfessorsDirectory().addProfessor("P1000", "SarMil", "Dr. Sarah Miller", Cpassword, "sarah.miller@eduverse.edu", "(555) 555-5555", "Active", true, passHistory);
        passHistory.clear();
        passHistory.add("MicJoh123");
        Cpassword = BCrypt.hashpw("MicJoh123", salt);
        education.getProfessorsDirectory().addProfessor("P1001", "MicJoh", "Dr. Michael Johnson", Cpassword, "michael.johnson@eduverse.edu", "(555) 555-5556", "Active", true, passHistory);
        passHistory.clear();
        passHistory.add("EmiSmi123");
        Cpassword = BCrypt.hashpw("EmiSmi123", salt);
        education.getProfessorsDirectory().addProfessor("P1002", "EmiSmi", "Prof. Emily Smith", Cpassword, "emily.smith@eduverse.edu", "(781) 555-5557", "Active", true, passHistory);
        passHistory.clear();
        passHistory.add("DavDav123");
        Cpassword = BCrypt.hashpw("DavDav123", salt);
        education.getProfessorsDirectory().addProfessor("P1003", "DavDav", "Dr. David Davis", Cpassword, "david.davis@eduverse.edu", "(721) 555-5558", "Active", true, passHistory);
        passHistory.clear();
        passHistory.add("JenWhi123");
        Cpassword = BCrypt.hashpw("JenWhi123", salt);
        education.getProfessorsDirectory().addProfessor("P1004", "JenWhi", "Dr. Jennifer White", Cpassword, "jennifer.white@eduverse.edu", "(581) 555-5559", "Active", true, passHistory);
        passHistory.clear();
        passHistory.add("RicBro123");
        Cpassword = BCrypt.hashpw("RicBro123", salt);
        education.getProfessorsDirectory().addProfessor("P1005", "RicBro", "Prof. Richard Brown", Cpassword, "richard.brown@eduverse.edu", "(555) 555-5225", "Active", true, passHistory);
        passHistory.clear();
        passHistory.add("MarGon123");
        Cpassword = BCrypt.hashpw("MarGon123", salt);
        education.getProfessorsDirectory().addProfessor("P1006", "MarGon", "Dr. Maria Gonzalez", Cpassword, "sarah.miller@eduverse.edu", "(452) 555-2322", "Active", true, passHistory);
        passHistory.clear();
        passHistory.add("BenWil123");
        Cpassword = BCrypt.hashpw("BenWil123", salt);
        education.getProfessorsDirectory().addProfessor("P1007", "BenWil", "Dr. Benjamin Wilson", Cpassword, "sarah.miller@eduverse.edu", "(555) 214-5555", "Active", true, passHistory);
        passHistory.clear();
        passHistory.add("LauTay123");
        Cpassword = BCrypt.hashpw("LauTay123", salt);
        education.getProfessorsDirectory().addProfessor("P1008", "LauTay", "Prof. Laura Taylor", Cpassword, "sarah.miller@eduverse.edu", "(651) 555-3024", "Active", true, passHistory);
        passHistory.clear();
        passHistory.add("MatCla123");
        Cpassword = BCrypt.hashpw("MatCla123", salt);
        education.getProfessorsDirectory().addProfessor("P1009", "MatCla", "Dr. Matthew Clark", Cpassword, "sarah.miller@eduverse.edu", "(872) 555-1045", "Active", true, passHistory);
        passHistory.clear();
        passHistory.add("OliTur123");
        Cpassword = BCrypt.hashpw("OliTur123", salt);
        education.getProfessorsDirectory().addProfessor("P1010", "OliTur", "Dr. Olivia Turner", Cpassword, "olivia.turner@eduverse.edu", "(555) 781-5874", "Active", false, passHistory);
        passHistory.clear();
        passHistory.add("HenMit123");
        Cpassword = BCrypt.hashpw("HenMit123", salt);
        education.getProfessorsDirectory().addProfessor("P1011", "HenMit", "Prof. Henry Mitchell", Cpassword, "henry.mitchell@eduverse.edu", "(555) 234-5555", "Active", true, passHistory);
        passHistory.clear();
        passHistory.add("SopAnd123");
        Cpassword = BCrypt.hashpw("SopAnd123", salt);
        education.getProfessorsDirectory().addProfessor("P1012", "SopAnd", "Prof. Sophia Anderson", Cpassword, "sophia.anderson@eduverse.edu", "(555) 124-2365", "Active", true, passHistory);

// Student 1
        Map<String, Double> grades1 = new HashMap<>();
        grades1.put("SH1000", 3.8);
        grades1.put("SH1002", 4.0);
        grades1.put("SH1004", 2.0);
        grades1.put("SH1005", 3.0);
        grades1.put("SH1006", 3.0);
        grades1.put("SH1007", 3.0);
        passHistory.add("sambar");
        Cpassword = BCrypt.hashpw("sambar", salt);
        education.getStudentsDirectory().addStudent("S1000", "Samiksha Baral", "sambar", Cpassword, "samiksha.baral@eduverse.edu", "(555) 555-5555", 3.2, grades1, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 2
        Map<String, Double> grades2 = new HashMap<>();
        grades2.put("SH1002", 3.5);
        grades2.put("SH1004", 3.9);
        grades2.put("SH1005", 0.2);
        grades2.put("SH1006", 3.2);
        grades2.put("SH1007", 3.2);
        grades2.put("SH1008", 3.2);
        passHistory.clear();
        passHistory.add("johsmith");
        Cpassword = BCrypt.hashpw("johsmith", salt);
        education.getStudentsDirectory().addStudent("S1001", "John Smith", "johsmith", Cpassword, "john.smith@eduverse.edu", "(555) 555-5556", 3.5, grades2, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

        
//// Student 3
        Map<String, Double> grades3 = new HashMap<>();
        grades3.put("SH1004",4.0);
        grades3.put("SH1005",3.2);
        grades3.put("SH1006", 3.2);
        grades3.put("SH1007", 2.2);
        grades3.put("SH1008", 3.2);
        education.getStudentsDirectory().addStudent("S1002", "Emily Johnson", "emijohn", "emijohn", "emily.johnson@eduverse.edu", "(555) 555-5557", 3.6, grades3, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

//// Student 4
        Map<String, Double> grades4 = new HashMap<>();
        grades4.put("SH1001",3.1);
        grades4.put("SH1002",3.5);
        grades4.put("SH1006", 3.2);
        grades4.put("SH1007", 4.2);
        grades4.put("SH1008", 3.2);
        education.getStudentsDirectory().addStudent("S1003", "Henry Mitchell", "henmit", "henmit", "henry.mitchell@eduverse.edu", "(555) 555-5553", 3.3, grades4, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

//// Student 5
        Map<String, Double> grades5 = new HashMap<>();
        grades5.put("SH1003",3.5);
        grades5.put("SH1001",3.9);
        grades5.put("SH1006", 3.2);
        grades5.put("SH1007", 1.2);
        grades5.put("SH1008", 3.2);
        education.getStudentsDirectory().addStudent("S1004", "Maria Gonzalez", "margon", "margon", "maria.gonzalez@eduverse.edu", "(555) 555-5552", 9.6, grades5, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

//// Student 6
        Map<String, Double> grades6 = new HashMap<>();
        grades6.put("SH1003",4.0);
        grades6.put("SH1001",4.0);
        grades6.put("SH1009",4.0);
        grades6.put("SH1010",4.0);
        grades6.put("SH1011",4.0);
        education.getStudentsDirectory().addStudent("S1004", "Maria Gonzalez", "margon", "margon", "maria.gonzalez@eduverse.edu", "(555) 555-5552", 4.0, grades6, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

//// Student 7
        Map<String, Double> grades7 = new HashMap<>();
        grades7.put("SH1006",3.8);
        grades7.put("SH1007",4.0);
        grades7.put("SH1005",4.0);
        grades7.put("SH1004",4.0);
        grades7.put("SH1003",4.0);
        education.getStudentsDirectory().addStudent("S1006", "Olivia Martinez", "olimart", "olimart", "olivia.martinez@eduverse.edu", "(555) 555-5558", 3.9, grades7, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

//// Student 8
        Map<String, Double> grades8 = new HashMap<>();
        grades8.put("SH1007",2.0);
        grades8.put("SH1008",4.0);
        grades8.put("SH1001",4.0);
        grades8.put("SH1010",4.0);
        grades8.put("SH1011",4.0);
        education.getStudentsDirectory().addStudent("S1007", "Lucas Brown", "lucbrown", "lucbrown", "lucas.brown@eduverse.edu", "(555) 555-5559", 3.0, grades8, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 9
        Map<String, Double> grades9 = new HashMap<>();
        grades9.put("SH1008",3.0);
        grades9.put("SH1009",3.2);
        grades9.put("SH100",3.2);
        grades9.put("SH1009",3.2);
        grades9.put("SH1009",3.2);
        education.getStudentsDirectory().addStudent("S1008", "Ava Davis", "avadav", "avadav", "ava.davis@eduverse.edu", "(555) 555-5560", 3.1, grades9, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 10
        Map<String, Double> grades10 = new HashMap<>();
        grades10.put("SH1009",2.4);
        grades10.put("SH1010",2.6);
        grades10.put("SH1000", 3.8);
        grades10.put("SH1011", 3.8);
        education.getStudentsDirectory().addStudent("S1009", "Mason Garcia", "masgar", "masgar", "mason.garcia@eduverse.edu", "(555) 555-5561", 2.5, grades10, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 11
        Map<String, Double> grades11 = new HashMap<>();
        grades11.put("SH1010",3.7);
        grades11.put("SH1011",3.9);
        education.getStudentsDirectory().addStudent("S1010", "Sophia Hernandez", "sophern", "sophern", "sophia.hernandez@eduverse.edu", "(555) 555-5562", 3.8, grades11, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 12
        Map<String, Double> grades12 = new HashMap<>();
        grades12.put("SH1009",3.4);
        grades12.put("SH1010",3.8);
        education.getStudentsDirectory().addStudent("S1011", "Sophie Miller", "sophiemil", "sophiemil", "sophie.miller@eduverse.edu", "(555) 555-5563", 3.6, grades12, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 13
        Map<String, Double> grades13 = new HashMap<>();
        grades13.put("SH1010",3.0);
        grades13.put("SH1011",3.4);
        education.getStudentsDirectory().addStudent("S1012", "Elijah Brown", "elijahbro", "elijahbro", "elijah.brown@eduverse.edu", "(555) 555-5564", 3.2, grades13, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 14
        Map<String, Double> grades14 = new HashMap<>();
        grades14.put("SH1000",3.7);
        grades14.put("SH1003",3.9);
        education.getStudentsDirectory().addStudent("S1013", "Zoe Robinson", "zoerob", "zoerob", "zoe.robinson@eduverse.edu", "(555) 555-5565", 3.8, grades14, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 15
        Map<String, Double> grades15 = new HashMap<>();
        grades15.put("SH1005",3.4);
        grades15.put("SH1008",3.6);
        grades15.put("SH1000", 3.8);
        grades15.put("SH1011", 3.8);
        education.getStudentsDirectory().addStudent("S1014", "Aiden Clark", "aidencla", "aidencla", "aiden.clark@eduverse.edu", "(555) 555-5566", 3.5, grades15, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 16
        Map<String, Double> grades16 = new HashMap<>();
        grades16.put("SH1007",3.9);
        grades16.put("SH1011",3.9);
        grades16.put("SH1001",3.9);
        education.getStudentsDirectory().addStudent("S1015", "Sophia Hill", "sophiahil", "sophiahil", "sophia.hill@eduverse.edu", "(555) 555-5567", 3.9, grades16, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

//// Student 17
        Map<String, Double> grades17 = new HashMap<>();
        grades17.put("SH1006",3.4);
        grades17.put("SH1009",3.6);
        education.getStudentsDirectory().addStudent("S1016", "William Turner", "willturn", "willturn", "william.turner@eduverse.edu", "(555) 555-5568", 3.5, grades17, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 18
        Map<String, Double> grades18 = new HashMap<>();
        grades18.put("SH1001",4.0);
        grades18.put("SH1004",3.6);
        grades18.put("SH1000", 3.8);
        education.getStudentsDirectory().addStudent("S1017", "Grace White", "gracewhi", "gracewhi", "grace.white@eduverse.edu", "(555) 555-5569", 3.8, grades18, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 19
        Map<String, Double> grades19 = new HashMap<>();
        grades19.put("SH1002",1.0);
        grades19.put("SH1005",3.0);
        education.getStudentsDirectory().addStudent("S1018", "Logan Adams", "loganada", "loganada", "logan.adams@eduverse.edu", "(555) 555-5570", 2.0, grades19, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 20
        Map<String, Double> grades20 = new HashMap<>();
        grades20.put("SH1007",4.0);
        grades20.put("SH1010",3.5);
        grades20.put("SH1000", 3.8);
        education.getStudentsDirectory().addStudent("S1019", "Ava Stewart", "avastew", "avastew", "ava.stewart@eduverse.edu", "(555) 555-5571", 3.75, grades20, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 21
        Map<String, Double> grades21 = new HashMap<>();
        grades21.put("SH1003",3.0);
        grades21.put("SH1006",3.2);
        education.getStudentsDirectory().addStudent("S1020", "Daniel Parker", "danipar", "danipar", "daniel.parker@eduverse.edu", "(555) 555-5572", 3.1, grades21, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);
//
//// Student 22
        Map<String, Double> grades22 = new HashMap<>();
        grades22.put("SH1008",3.4);
        grades22.put("SH1011",2.6);
        grades22.put("SH1000", 3.8);
        education.getStudentsDirectory().addStudent("S1021", "Emma Collins", "emmacol", "emmacol", "emma.collins@eduverse.edu", "(555) 555-5573", 3.0, grades22, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 23
        Map<String, Double> grades23 = new HashMap<>();
        grades23.put("SH1004",3.2);
        grades23.put("SH1007",4.0);
        education.getStudentsDirectory().addStudent("S1022", "Michael Price", "michapri", "michapri", "michael.price@eduverse.edu", "(555) 555-5574", 3.6, grades23, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 24
        Map<String, Double> grades24 = new HashMap<>();
        grades24.put("SH1006",3.3);
        grades24.put("SH1009",3.7);
        grades24.put("SH1000",3.7);
        education.getStudentsDirectory().addStudent("S1023", "Sophia Young", "sophiyou", "sophiyou", "sophia.young@eduverse.edu", "(555) 555-5575", 3.5, grades24, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 25
        Map<String, Double> grades25 = new HashMap<>();
        grades25.put("SH1002",3.3);
        grades25.put("SH1005",3.3);
        education.getStudentsDirectory().addStudent("S1024", "Matthew King", "mattking", "mattking", "matthew.king@eduverse.edu", "(555) 555-5576", 8.4, grades25, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 26
        Map<String, Double> grades26 = new HashMap<>();
        grades26.put("SH1003",3.3);
        grades26.put("SH1006",3.3);
        education.getStudentsDirectory().addStudent("S1025", "Olivia Murphy", "olivmur", "olivmur", "olivia.murphy@eduverse.edu", "(555) 555-5577", 9.5, grades26, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 27
        Map<String, Double> grades27 = new HashMap<>();
        grades27.put("SH1001",3.3);
        grades27.put("SH1004",3.3);
        education.getStudentsDirectory().addStudent("S1026", "James Scott", "jamscott", "jamscott", "james.scott@eduverse.edu", "(555) 555-5578", 9.0, grades27, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 28
        Map<String, Double> grades28 = new HashMap<>();
        grades28.put("SH1005",3.3);
        grades28.put("SH1008",3.3);
        grades28.put("SH1000",3.3);
        grades28.put("SH1011",3.3);
        education.getStudentsDirectory().addStudent("S1027", "Sophia Green", "sophigre", "sophigre", "sophia.green@eduverse.edu", "(555) 555-5579", 8.2, grades28, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 29
        Map<String, Double> grades29 = new HashMap<>();
        grades29.put("SH1002",3.3);
        grades29.put("SH1006",3.3);
        education.getStudentsDirectory().addStudent("S1028", "Liam Carter", "liamcar", "liamcar", "liam.carter@eduverse.edu", "(555) 555-5580", 8.7, grades29, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 30
        Map<String, Double> grades30 = new HashMap<>();
        grades30.put("SH1007",3.3);
        grades30.put("SH1010",3.3);
        grades30.put("SH1000",3.3);
        grades28.put("SH1011",3.3);
        education.getStudentsDirectory().addStudent("S1029", "Olivia Ross", "olivross", "olivross", "olivia.ross@eduverse.edu", "(555) 555-5581", 8.9, grades30, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 31
        Map<String, Double> grades31 = new HashMap<>();
        grades31.put("SH1003",3.3);
        grades31.put("SH1006",3.3);
        grades31.put("SH1001",3.3);
        education.getStudentsDirectory().addStudent("S1030", "William Wright", "willwrigh", "willwrigh", "william.wright@eduverse.edu", "(555) 555-5582", 9.3, grades31, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 32
        Map<String, Double> grades32 = new HashMap<>();
        grades32.put("SH1008",3.3);
        grades32.put("SH1011",3.3);
        education.getStudentsDirectory().addStudent("S1031", "Ava Reed", "avareed", "avareed", "ava.reed@eduverse.edu", "(555) 555-5583", 9.4, grades32, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 33
        Map<String, Double> grades33 = new HashMap<>();
        grades33.put("SH1004",3.3);
        grades33.put("SH1007",3.3);
        grades33.put("SH1000",3.3);
        education.getStudentsDirectory().addStudent("S1032", "Ethan Hall", "ethanhal", "ethanhal", "ethan.hall@eduverse.edu", "(555) 555-5584", 8.6, grades33, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 34
        Map<String, Double> grades34 = new HashMap<>();
        grades34.put("SH1006",3.3);
        grades34.put("SH1009",3.3);
        education.getStudentsDirectory().addStudent("S1033", "Zoe Turner", "zoeturn", "zoeturn", "zoe.turner@eduverse.edu", "(555) 555-5585", 9.1, grades34, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 35
        Map<String, Double> grades35 = new HashMap<>();
        grades35.put("SH1002",3.3);
        grades35.put("SH1005",3.3);
        grades35.put("SH1001",3.3);
        education.getStudentsDirectory().addStudent("S1034", "Noah Lewis", "noahlewi", "noahlewi", "noah.lewis@eduverse.edu", "(555) 555-5586", 9.5, grades35, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 36
        Map<String, Double> grades36 = new HashMap<>();
        grades36.put("SH1003",3.3);
        grades36.put("SH1006",3.3);
        grades36.put("SH1004",3.3);
        education.getStudentsDirectory().addStudent("S1035", "Sophia Perez", "sophiper", "sophiper", "sophia.perez@eduverse.edu", "(555) 555-5587", 8.3, grades36, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 37
        Map<String, Double> grades37 = new HashMap<>();
        grades37.put("SH1007",3.3);
        grades37.put("SH1010",3.3);
        education.getStudentsDirectory().addStudent("S1036", "Elijah Wood", "elijwood", "elijwood", "elijah.wood@eduverse.edu", "(555) 555-5588", 9.2, grades37, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 38
        Map<String, Double> grades38 = new HashMap<>();
        grades38.put("SH1001",3.3);
        grades38.put("SH1004",3.3);
        education.getStudentsDirectory().addStudent("S1037", "Aiden Baker", "aidenbak", "aidenbak", "aiden.baker@eduverse.edu", "(555) 555-5589", 8.8, grades38, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 39
       Map<String, Double> grades39 = new HashMap<>();
        grades39.put("SH1005",3.3);
        grades39.put("SH1008",3.3);
        grades39.put("SH1004",3.3);
        education.getStudentsDirectory().addStudent("S1038", "Emma Wright", "emmawrig", "emmawrig", "emma.wright@eduverse.edu", "(555) 555-5590", 9.0, grades39, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 40
        Map<String, Double> grades40 = new HashMap<>();
        grades40.put("SH1002",3.3);
        grades40.put("SH1006",3.3);
        education.getStudentsDirectory().addStudent("S1039", "Mason Foster", "masonfos", "masonfos", "mason.foster@eduverse.edu", "(555) 555-5591", 8.4, grades40, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 41
        Map<String, Double> grades41 = new HashMap<>();
        grades41.put("SH1003",3.3);
        grades41.put("SH1006",3.3);
        education.getStudentsDirectory().addStudent("S1040", "Oliver Nelson", "olivnels", "olivnels", "oliver.nelson@eduverse.edu", "(555) 555-5592", 9.1, grades41, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 42
        Map<String, Double> grades42 = new HashMap<>();
        grades42.put("SH1008",3.3);
        grades42.put("SH1011",3.3);
        education.getStudentsDirectory().addStudent("S1041", "Ava Turner", "avaturn", "avaturn", "ava.turner@eduverse.edu", "(555) 555-5593", 8.9, grades42, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 43
        Map<String, Double> grades43 = new HashMap<>();
        grades43.put("SH1004",3.3);
        grades43.put("SH1007",3.3);
        education.getStudentsDirectory().addStudent("S1042", "Liam Hernandez", "liamhern", "liamhern", "liam.hernandez@eduverse.edu", "(555) 555-5594", 9.2, grades43, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 44
        Map<String, Double> grades44 = new HashMap<>();
        grades44.put("SH1006",3.3);
        grades44.put("SH1009",3.3);
        education.getStudentsDirectory().addStudent("S1043", "Charlotte White", "charwhit", "charwhit", "charlotte.white@eduverse.edu", "(555) 555-5595", 8.7, grades44, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 45
        Map<String, Double> grades45 = new HashMap<>();
        grades45.put("SH1002",3.3);
        grades45.put("SH1005",3.3);
        education.getStudentsDirectory().addStudent("S1044", "Benjamin Anderson", "benjandi", "benjandi", "benjamin.anderson@eduverse.edu", "(555) 555-5596", 9.5, grades45, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 46
        Map<String, Double> grades46 = new HashMap<>();
        grades46.put("SH1003",3.3);
        grades46.put("SH1006",3.3);
        education.getStudentsDirectory().addStudent("S1045", "Liam Rodriguez", "liamrodr", "liamrodr", "liam.rodriguez@eduverse.edu", "(555) 555-5597", 9.0, grades46, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 47
        Map<String, Double> grades47 = new HashMap<>();
        grades47.put("SH1007",3.3);
        grades47.put("SH1010",3.3);
        education.getStudentsDirectory().addStudent("S1046", "Olivia Adams", "oliviaada", "oliviaada", "olivia.adams@eduverse.edu", "(555) 555-5598", 8.8, grades47, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 48
        Map<String, Double> grades48 = new HashMap<>();
        grades48.put("SH1001",3.3);
        grades48.put("SH1004",3.3);
        education.getStudentsDirectory().addStudent("S1047", "William Miller", "willmill", "willmill", "william.miller@eduverse.edu", "(555) 555-5599", 9.4, grades48, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 49
        Map<String, Double> grades49 = new HashMap<>();
        grades49.put("SH1005",3.3);
        grades49.put("SH1008",3.3);
        grades49.put("SH1003",3.3);
        education.getStudentsDirectory().addStudent("S1048", "Sophia Perez", "sophiper", "sophiper", "sophia.perez@eduverse.edu", "(555) 555-5600", 8.6, grades49, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);

// Student 50
        Map<String, Double> grades50 = new HashMap<>();
        grades50.put("SH1002",3.3);
        grades50.put("SH1006",3.3);
        grades50.put("SH1003",3.3);
        education.getStudentsDirectory().addStudent("S1049", "Elijah Clark", "elijclark", "elijclark", "elijah.clark@eduverse.edu", "(555) 555-5601", 8.5, grades50, "Active", true, 8000, GraduationStatus.NOTAPPLIED, passHistory);



    // Jobs
        education.getEmployer().createJobPosting("1231231", "Software Engineer", "Company - Oracle");
        education.getEmployer().createJobPosting("2321234", "Dev Ops Engineer", "Company - Amazon");
        education.getEmployer().createJobPosting("3334322", "Front End Developer", "Company - Facebook");
        education.getEmployer().createJobPosting("9890932", "Back End Developer", "Company - Meta");
        education.getEmployer().createJobPosting("0986890", "Full Stack Developer", "Company - Tik Tok");
        education.getEmployer().createJobPosting("0987789", "Cloud Engineer", "Company - Northen Trust");
        
        return education;
    }
}
