/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education;

import Utiltities.GraduationStatus;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ASUS
 */
public class EducationConfigure {

    public static Education initialize() {
        Education education = new Education("Eduverse");

        education.getCourseDirectory().addCourse("Application Modeling and Design", "INFO 5001", "Information Systems Programs", "P1000", 4, 9.4);
        education.getCourseDirectory().addCourse("Application Engineering and Development", "INFO 5101", "Information Systems Programs", "P1000", 4, 7);
//        education.getCourseDirectory().addCourse("Web Design and User Experience Engineering", "INFO 6150", "Information Systems Programs", "P1001", 4, 10);
//        education.getCourseDirectory().addCourse("Program Structure and Algorithms", "INFO 6150", "Information Systems Programs", "P1001", 4, 9.1);
//        education.getCourseDirectory().addCourse("Concepts of Object-Oriented Design", "CSYE 6200", "Computer Systems Engineering", "P1002", 4, 8.5);
//        education.getCourseDirectory().addCourse("Enterprise Software Design", "CSYE 6620", "Computer Systems Engineering", "P1003", 3, 8.5);
//        education.getCourseDirectory().addCourse("Introduction to Cooperative Education", "ENCP 6100", "Engineering Cooperative Education", "P1004", 1, 9.5);
//        education.getCourseDirectory().addCourse("Career Management for Engineers", "ENCP 6101", "Engineering Cooperative Education", "P1005", 1, 8.5);
//        education.getCourseDirectory().addCourse("Programming with Data", "DASC 2000", "Data Science", "P1006", 3, 8.5);
//        education.getCourseDirectory().addCourse("Data Science Programming Practicum", "DASC 2010", "Data Science", "P1007", 3, 8.5);
//        education.getCourseDirectory().addCourse("Introduction to Data Mining/Machine Learning", "DANA 5030", "Data Analytics", "P1008", 2, 8.5);
//        education.getCourseDirectory().addCourse("Systems Security", "CYSC 3740", "Cybersecurity", "P100", 2, 8.5);

        education.getCourseScheduleDirectory().addCourseSchedule("SH1000", "INFO 5001", "01/08/2022", "01/12/2022", "Fall", 2024, "P1000", "English", "Boston", 9.2);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1001", "INFO 5001", "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston", 8.3);
        education.getCourseScheduleDirectory().addCourseSchedule("SH1002", "INFO 5101", "01/01/2022", "01/04/2022", "Spring", 2022, "P1001", "English", "Boston", 8.7);
//        education.getCourseScheduleDirectory().addCourseSchedule("SH1003", "INFO 5101", "01/08/2022", "01/12/2022", "Fall", 2022, "P1002", "English", "Boston", 9.1);
//        education.getCourseScheduleDirectory().addCourseSchedule("SH1004", "INFO 6150", "01/08/2021", "01/12/2021", "Fall", 2021, "P1003", "English", "Boston", 7.8);
//        education.getCourseScheduleDirectory().addCourseSchedule("SH1005", "CSYE 6200", "01/08/2022", "01/12/2022", "Fall", 2022, "P1004", "English", "Boston",7.9);
//        education.getCourseScheduleDirectory().addCourseSchedule("SH1006", "CSYE 6620", "01/01/2023", "01/04/2023", "Spring", 2023, "P1004", "English", "Boston", 8.4);
//        education.getCourseScheduleDirectory().addCourseSchedule("SH1007", "CSYE 6620", "01/08/2021", "01/12/2021", "Fall", 2021, "P1005", "English", "Boston", 7.2);
//        education.getCourseScheduleDirectory().addCourseSchedule("SH1008", "ENCP 6100", "01/08/2023", "01/12/2023", "Fall", 2023, "P1006", "English", "Boston", 9.4);
//        education.getCourseScheduleDirectory().addCourseSchedule("SH1009", "ENCP 6101", "01/01/2020", "01/04/2020", "Spring", 2020, "P1007", "English", "Boston", 8.6);
//        education.getCourseScheduleDirectory().addCourseSchedule("SH1010", "DASC 2000", "01/08/2020", "01/12/2020", "Fall", 2020, "P1008", "English", "Boston", 7.8);
//        education.getCourseScheduleDirectory().addCourseSchedule("SH1011", "DASC 2010", "01/08/2023", "01/12/2023", "Fall", 2023, "P1009", "English", "Boston", 8.9);

        education.getProfessorsDirectory().addProfessor("P1000", "SarMil", "Dr. Sarah Miller", "SarMil", "sarah.miller@eduverse.edu", "(555) 555-5555", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1001", "MicJoh", "Dr. Michael Johnson", "MicJoh", "michael.johnson@eduverse.edu", "(555) 555-5556", "Active", true);
//        education.getProfessorsDirectory().addProfessor("P1002", "EmiSmi", "Prof. Emily Smith", "EmiSmi", "emily.smith@eduverse.edu", "(781) 555-5557", "Active", true);
//        education.getProfessorsDirectory().addProfessor("P1003", "DavDav", "Dr. David Davis", "DavDav", "david.davis@eduverse.edu", "(721) 555-5558", "Active", true);
//        education.getProfessorsDirectory().addProfessor("P1004", "JenWhi", "Dr. Jennifer White", "JenWhi", "jennifer.white@eduverse.edu", "(581) 555-5559", "Active", true);
//        education.getProfessorsDirectory().addProfessor("P1005", "RicBro", "Prof. Richard Brown", "RicBro", "richard.brown@eduverse.edu", "(555) 555-5225", "Active", true);
//        education.getProfessorsDirectory().addProfessor("P1006", "MarGon", "Dr. Maria Gonzalez", "MarGon", "sarah.miller@eduverse.edu", "(452) 555-2322", "Active", true);
//        education.getProfessorsDirectory().addProfessor("P1007", "BenWil", "Dr. Benjamin Wilson", "BenWil", "sarah.miller@eduverse.edu", "(555) 214-5555", "Active", true);
//        education.getProfessorsDirectory().addProfessor("P1008", "LauTay", "Prof. Laura Taylor", "LauTay", "sarah.miller@eduverse.edu", "(651) 555-3024", "Active", true);
//        education.getProfessorsDirectory().addProfessor("P1009", "MatCla", "Dr. Matthew Clark", "MatCla", "sarah.miller@eduverse.edu", "(872) 555-1045", "Active", true);
//        education.getProfessorsDirectory().addProfessor("P1010", "OliTur", "Dr. Olivia Turner", "OliTur", "olivia.turner@eduverse.edu", "(555) 781-5874", "Active", false);
//        education.getProfessorsDirectory().addProfessor("P1011", "HenMit", "Prof. Henry Mitchell", "HenMit", "henry.mitchell@eduverse.edu", "(555) 234-5555", "Active", true);
//        education.getProfessorsDirectory().addProfessor("P1012", "SopAnd", "Prof. Sophia Anderson", "SopAnd", "sophia.anderson@eduverse.edu", "(555) 124-2365", "Active", true);

// Student 1
        Map<String, Double> grades1 = new HashMap<>();
        grades1.put("SH1000", 3.8);
        grades1.put("SH1002", 4.0);
        grades1.put("SH1003", 2.0);
        grades1.put("SH1001", 3.0);
        education.getStudentsDirectory().addStudent("S1000", "Samiksha Baral", "sambar", "sambar", "samiksha.baral@eduverse.edu", "(555) 555-5555", 3.2, grades1, "Active", true, 2000, GraduationStatus.NOTAPPLIED);

// Student 2
        Map<String, Double> grades2 = new HashMap<>();
        grades2.put("SH1002", 3.5);
        grades2.put("SH1003", 3.9);
        grades2.put("SH1000", 0.2);
        grades2.put("SH1001", 3.2);
        education.getStudentsDirectory().addStudent("S1001", "John Smith", "johsmith", "johsmith", "john.smith@eduverse.edu", "(555) 555-5556", 8.7, grades2, "Active", true, 2000, GraduationStatus.NOTAPPLIED);
        
//// Student 3
//        ArrayList<String> scheduleId3 = new ArrayList<>();
//        scheduleId3.add("SH1004");
//        scheduleId3.add("SH1005");
//        education.getStudentsDirectory().addStudent("S1002", "Emily Johnson", "emijohn", "emijohn", "emily.johnson@eduverse.edu", "(555) 555-5557", 8.9, scheduleId3, "Active", true);
//
//// Student 4
//        ArrayList<String> scheduleIdStudent4 = new ArrayList<>();
//        scheduleIdStudent4.add("SH1001");
//        scheduleIdStudent4.add("SH1002");
//        education.getStudentsDirectory().addStudent("S1003", "Henry Mitchell", "henmit", "henmit", "henry.mitchell@eduverse.edu", "(555) 555-5553", 9.8, scheduleIdStudent4, "Active", true);
//
//// Student 5
//        ArrayList<String> scheduleIdStudent5 = new ArrayList<>();
//        scheduleIdStudent5.add("SH1003");
//        scheduleIdStudent5.add("SH1001");
//        education.getStudentsDirectory().addStudent("S1004", "Maria Gonzalez", "margon", "margon", "maria.gonzalez@eduverse.edu", "(555) 555-5552", 9.6, scheduleIdStudent5, "Active", true);
//
//// Student 6
//        ArrayList<String> scheduleIdStudent6 = new ArrayList<>();
//        scheduleIdStudent6.add("SH1003");
//        scheduleIdStudent6.add("SH1001");
//        education.getStudentsDirectory().addStudent("S1004", "Maria Gonzalez", "margon", "margon", "maria.gonzalez@eduverse.edu", "(555) 555-5552", 9.6, scheduleIdStudent6, "Active", true);
//
//        // Student 7
//        ArrayList<String> scheduleIdStudent7 = new ArrayList<>();
//        scheduleIdStudent7.add("SH1006");
//        scheduleIdStudent7.add("SH1007");
//        education.getStudentsDirectory().addStudent("S1006", "Olivia Martinez", "olimart", "olimart", "olivia.martinez@eduverse.edu", "(555) 555-5558", 8.5, scheduleIdStudent7, "Active", true);
//
//// Student 8
//        ArrayList<String> scheduleIdStudent8 = new ArrayList<>();
//        scheduleIdStudent8.add("SH1007");
//        scheduleIdStudent8.add("SH1008");
//        education.getStudentsDirectory().addStudent("S1007", "Lucas Brown", "lucbrown", "lucbrown", "lucas.brown@eduverse.edu", "(555) 555-5559", 9.1, scheduleIdStudent8, "Active", true);
//
//// Student 9
//        ArrayList<String> scheduleIdStudent9 = new ArrayList<>();
//        scheduleIdStudent9.add("SH1008");
//        scheduleIdStudent9.add("SH1009");
//        education.getStudentsDirectory().addStudent("S1008", "Ava Davis", "avadav", "avadav", "ava.davis@eduverse.edu", "(555) 555-5560", 7.8, scheduleIdStudent9, "Active", true);
//
//// Student 10
//        ArrayList<String> scheduleIdStudent10 = new ArrayList<>();
//        scheduleIdStudent10.add("SH1009");
//        scheduleIdStudent10.add("SH1010");
//        education.getStudentsDirectory().addStudent("S1009", "Mason Garcia", "masgar", "masgar", "mason.garcia@eduverse.edu", "(555) 555-5561", 9.0, scheduleIdStudent10, "Active", true);
//
//// Student 11
//        ArrayList<String> scheduleIdStudent11 = new ArrayList<>();
//        scheduleIdStudent11.add("SH1010");
//        scheduleIdStudent11.add("SH1011");
//        education.getStudentsDirectory().addStudent("S1010", "Sophia Hernandez", "sophern", "sophern", "sophia.hernandez@eduverse.edu", "(555) 555-5562", 8.3, scheduleIdStudent11, "Active", true);
//
//// Student 12
//        ArrayList<String> scheduleIdStudent12 = new ArrayList<>();
//        scheduleIdStudent12.add("SH1009");
//        scheduleIdStudent12.add("SH1010");
//        education.getStudentsDirectory().addStudent("S1011", "Sophie Miller", "sophiemil", "sophiemil", "sophie.miller@eduverse.edu", "(555) 555-5563", 8.4, scheduleIdStudent12, "Active", true);
//
//// Student 13
//        ArrayList<String> scheduleIdStudent13 = new ArrayList<>();
//        scheduleIdStudent13.add("SH1010");
//        scheduleIdStudent13.add("SH1011");
//        education.getStudentsDirectory().addStudent("S1012", "Elijah Brown", "elijahbro", "elijahbro", "elijah.brown@eduverse.edu", "(555) 555-5564", 9.2, scheduleIdStudent13, "Active", true);
//
//// Student 14
//        ArrayList<String> scheduleIdStudent14 = new ArrayList<>();
//        scheduleIdStudent14.add("SH1000");
//        scheduleIdStudent14.add("SH1003");
//        education.getStudentsDirectory().addStudent("S1013", "Zoe Robinson", "zoerob", "zoerob", "zoe.robinson@eduverse.edu", "(555) 555-5565", 8.7, scheduleIdStudent14, "Active", true);
//
//// Student 15
//        ArrayList<String> scheduleIdStudent15 = new ArrayList<>();
//        scheduleIdStudent15.add("SH1005");
//        scheduleIdStudent15.add("SH1008");
//        education.getStudentsDirectory().addStudent("S1014", "Aiden Clark", "aidencla", "aidencla", "aiden.clark@eduverse.edu", "(555) 555-5566", 9.0, scheduleIdStudent15, "Active", true);
//
//// Student 16
//        ArrayList<String> scheduleIdStudent16 = new ArrayList<>();
//        scheduleIdStudent16.add("SH1007");
//        scheduleIdStudent16.add("SH1011");
//        education.getStudentsDirectory().addStudent("S1015", "Sophia Hill", "sophiahil", "sophiahil", "sophia.hill@eduverse.edu", "(555) 555-5567", 9.8, scheduleIdStudent16, "Active", true);
//
//// Student 17
//        ArrayList<String> scheduleIdStudent17 = new ArrayList<>();
//        scheduleIdStudent17.add("SH1006");
//        scheduleIdStudent17.add("SH1009");
//        education.getStudentsDirectory().addStudent("S1016", "William Turner", "willturn", "willturn", "william.turner@eduverse.edu", "(555) 555-5568", 8.2, scheduleIdStudent17, "Active", true);
//
//// Student 18
//        ArrayList<String> scheduleIdStudent18 = new ArrayList<>();
//        scheduleIdStudent18.add("SH1001");
//        scheduleIdStudent18.add("SH1004");
//        education.getStudentsDirectory().addStudent("S1017", "Grace White", "gracewhi", "gracewhi", "grace.white@eduverse.edu", "(555) 555-5569", 9.4, scheduleIdStudent18, "Active", true);
//
//// Student 19
//        ArrayList<String> scheduleIdStudent19 = new ArrayList<>();
//        scheduleIdStudent19.add("SH1002");
//        scheduleIdStudent19.add("SH1005");
//        education.getStudentsDirectory().addStudent("S1018", "Logan Adams", "loganada", "loganada", "logan.adams@eduverse.edu", "(555) 555-5570", 8.6, scheduleIdStudent19, "Active", true);
//
//// Student 20
//        ArrayList<String> scheduleIdStudent20 = new ArrayList<>();
//        scheduleIdStudent20.add("SH1007");
//        scheduleIdStudent20.add("SH1010");
//        education.getStudentsDirectory().addStudent("S1019", "Ava Stewart", "avastew", "avastew", "ava.stewart@eduverse.edu", "(555) 555-5571", 9.1, scheduleIdStudent20, "Active", true);
//
//// Student 21
//        ArrayList<String> scheduleIdStudent21 = new ArrayList<>();
//        scheduleIdStudent21.add("SH1003");
//        scheduleIdStudent21.add("SH1006");
//        education.getStudentsDirectory().addStudent("S1020", "Daniel Parker", "danipar", "danipar", "daniel.parker@eduverse.edu", "(555) 555-5572", 8.9, scheduleIdStudent21, "Active", true);
//
//// Student 22
//        ArrayList<String> scheduleIdStudent22 = new ArrayList<>();
//        scheduleIdStudent22.add("SH1008");
//        scheduleIdStudent22.add("SH1011");
//        education.getStudentsDirectory().addStudent("S1021", "Emma Collins", "emmacol", "emmacol", "emma.collins@eduverse.edu", "(555) 555-5573", 9.7, scheduleIdStudent22, "Active", true);
//
//// Student 23
//        ArrayList<String> scheduleIdStudent23 = new ArrayList<>();
//        scheduleIdStudent23.add("SH1004");
//        scheduleIdStudent23.add("SH1007");
//        education.getStudentsDirectory().addStudent("S1022", "Michael Price", "michapri", "michapri", "michael.price@eduverse.edu", "(555) 555-5574", 8.5, scheduleIdStudent23, "Active", true);
//
//// Student 24
//        ArrayList<String> scheduleIdStudent24 = new ArrayList<>();
//        scheduleIdStudent24.add("SH1006");
//        scheduleIdStudent24.add("SH1009");
//        education.getStudentsDirectory().addStudent("S1023", "Sophia Young", "sophiyou", "sophiyou", "sophia.young@eduverse.edu", "(555) 555-5575", 9.3, scheduleIdStudent24, "Active", true);
//
//// Student 25
//        ArrayList<String> scheduleIdStudent25 = new ArrayList<>();
//        scheduleIdStudent25.add("SH1002");
//        scheduleIdStudent25.add("SH1005");
//        education.getStudentsDirectory().addStudent("S1024", "Matthew King", "mattking", "mattking", "matthew.king@eduverse.edu", "(555) 555-5576", 8.4, scheduleIdStudent25, "Active", true);
//
//// Student 26
//        ArrayList<String> scheduleIdStudent26 = new ArrayList<>();
//        scheduleIdStudent26.add("SH1003");
//        scheduleIdStudent26.add("SH1006");
//        education.getStudentsDirectory().addStudent("S1025", "Olivia Murphy", "olivmur", "olivmur", "olivia.murphy@eduverse.edu", "(555) 555-5577", 9.5, scheduleIdStudent26, "Active", true);
//
//// Student 27
//        ArrayList<String> scheduleIdStudent27 = new ArrayList<>();
//        scheduleIdStudent27.add("SH1001");
//        scheduleIdStudent27.add("SH1004");
//        education.getStudentsDirectory().addStudent("S1026", "James Scott", "jamscott", "jamscott", "james.scott@eduverse.edu", "(555) 555-5578", 9.0, scheduleIdStudent27, "Active", true);
//
//// Student 28
//        ArrayList<String> scheduleIdStudent28 = new ArrayList<>();
//        scheduleIdStudent28.add("SH1005");
//        scheduleIdStudent28.add("SH1008");
//        education.getStudentsDirectory().addStudent("S1027", "Sophia Green", "sophigre", "sophigre", "sophia.green@eduverse.edu", "(555) 555-5579", 8.2, scheduleIdStudent28, "Active", true);
//
//// Student 29
//        ArrayList<String> scheduleIdStudent29 = new ArrayList<>();
//        scheduleIdStudent29.add("SH1002");
//        scheduleIdStudent29.add("SH1006");
//        education.getStudentsDirectory().addStudent("S1028", "Liam Carter", "liamcar", "liamcar", "liam.carter@eduverse.edu", "(555) 555-5580", 8.7, scheduleIdStudent29, "Active", true);
//
//// Student 30
//        ArrayList<String> scheduleIdStudent30 = new ArrayList<>();
//        scheduleIdStudent30.add("SH1007");
//        scheduleIdStudent30.add("SH1010");
//        education.getStudentsDirectory().addStudent("S1029", "Olivia Ross", "olivross", "olivross", "olivia.ross@eduverse.edu", "(555) 555-5581", 8.9, scheduleIdStudent30, "Active", true);
//
//// Student 31
//        ArrayList<String> scheduleIdStudent31 = new ArrayList<>();
//        scheduleIdStudent31.add("SH1003");
//        scheduleIdStudent31.add("SH1006");
//        education.getStudentsDirectory().addStudent("S1030", "William Wright", "willwrigh", "willwrigh", "william.wright@eduverse.edu", "(555) 555-5582", 9.3, scheduleIdStudent31, "Active", true);
//
//// Student 32
//        ArrayList<String> scheduleIdStudent32 = new ArrayList<>();
//        scheduleIdStudent32.add("SH1008");
//        scheduleIdStudent32.add("SH1011");
//        education.getStudentsDirectory().addStudent("S1031", "Ava Reed", "avareed", "avareed", "ava.reed@eduverse.edu", "(555) 555-5583", 9.4, scheduleIdStudent32, "Active", true);
//
//// Student 33
//        ArrayList<String> scheduleIdStudent33 = new ArrayList<>();
//        scheduleIdStudent33.add("SH1004");
//        scheduleIdStudent33.add("SH1007");
//        education.getStudentsDirectory().addStudent("S1032", "Ethan Hall", "ethanhal", "ethanhal", "ethan.hall@eduverse.edu", "(555) 555-5584", 8.6, scheduleIdStudent33, "Active", true);
//
//// Student 34
//        ArrayList<String> scheduleIdStudent34 = new ArrayList<>();
//        scheduleIdStudent34.add("SH1006");
//        scheduleIdStudent34.add("SH1009");
//        education.getStudentsDirectory().addStudent("S1033", "Zoe Turner", "zoeturn", "zoeturn", "zoe.turner@eduverse.edu", "(555) 555-5585", 9.1, scheduleIdStudent34, "Active", true);
//
//// Student 35
//        ArrayList<String> scheduleIdStudent35 = new ArrayList<>();
//        scheduleIdStudent35.add("SH1002");
//        scheduleIdStudent35.add("SH1005");
//        education.getStudentsDirectory().addStudent("S1034", "Noah Lewis", "noahlewi", "noahlewi", "noah.lewis@eduverse.edu", "(555) 555-5586", 9.5, scheduleIdStudent35, "Active", true);
//
//// Student 36
//        ArrayList<String> scheduleIdStudent36 = new ArrayList<>();
//        scheduleIdStudent36.add("SH1003");
//        scheduleIdStudent36.add("SH1006");
//        education.getStudentsDirectory().addStudent("S1035", "Sophia Perez", "sophiper", "sophiper", "sophia.perez@eduverse.edu", "(555) 555-5587", 8.3, scheduleIdStudent36, "Active", true);
//
//// Student 37
//        ArrayList<String> scheduleIdStudent37 = new ArrayList<>();
//        scheduleIdStudent37.add("SH1007");
//        scheduleIdStudent37.add("SH1010");
//        education.getStudentsDirectory().addStudent("S1036", "Elijah Wood", "elijwood", "elijwood", "elijah.wood@eduverse.edu", "(555) 555-5588", 9.2, scheduleIdStudent37, "Active", true);
//
//// Student 38
//        ArrayList<String> scheduleIdStudent38 = new ArrayList<>();
//        scheduleIdStudent38.add("SH1001");
//        scheduleIdStudent38.add("SH1004");
//        education.getStudentsDirectory().addStudent("S1037", "Aiden Baker", "aidenbak", "aidenbak", "aiden.baker@eduverse.edu", "(555) 555-5589", 8.8, scheduleIdStudent38, "Active", true);
//
//// Student 39
//        ArrayList<String> scheduleIdStudent39 = new ArrayList<>();
//        scheduleIdStudent39.add("SH1005");
//        scheduleIdStudent39.add("SH1008");
//        education.getStudentsDirectory().addStudent("S1038", "Emma Wright", "emmawrig", "emmawrig", "emma.wright@eduverse.edu", "(555) 555-5590", 9.0, scheduleIdStudent39, "Active", true);
//
//// Student 40
//        ArrayList<String> scheduleIdStudent40 = new ArrayList<>();
//        scheduleIdStudent40.add("SH1002");
//        scheduleIdStudent40.add("SH1006");
//        education.getStudentsDirectory().addStudent("S1039", "Mason Foster", "masonfos", "masonfos", "mason.foster@eduverse.edu", "(555) 555-5591", 8.4, scheduleIdStudent40, "Active", true);
//
//// Student 41
//        ArrayList<String> scheduleIdStudent41 = new ArrayList<>();
//        scheduleIdStudent41.add("SH1003");
//        scheduleIdStudent41.add("SH1006");
//        education.getStudentsDirectory().addStudent("S1040", "Oliver Nelson", "olivnels", "olivnels", "oliver.nelson@eduverse.edu", "(555) 555-5592", 9.1, scheduleIdStudent41, "Active", true);
//
//// Student 42
//        ArrayList<String> scheduleIdStudent42 = new ArrayList<>();
//        scheduleIdStudent42.add("SH1008");
//        scheduleIdStudent42.add("SH1011");
//        education.getStudentsDirectory().addStudent("S1041", "Ava Turner", "avaturn", "avaturn", "ava.turner@eduverse.edu", "(555) 555-5593", 8.9, scheduleIdStudent42, "Active", true);
//
//// Student 43
//        ArrayList<String> scheduleIdStudent43 = new ArrayList<>();
//        scheduleIdStudent43.add("SH1004");
//        scheduleIdStudent43.add("SH1007");
//        education.getStudentsDirectory().addStudent("S1042", "Liam Hernandez", "liamhern", "liamhern", "liam.hernandez@eduverse.edu", "(555) 555-5594", 9.2, scheduleIdStudent43, "Active", true);
//
//// Student 44
//        ArrayList<String> scheduleIdStudent44 = new ArrayList<>();
//        scheduleIdStudent44.add("SH1006");
//        scheduleIdStudent44.add("SH1009");
//        education.getStudentsDirectory().addStudent("S1043", "Charlotte White", "charwhit", "charwhit", "charlotte.white@eduverse.edu", "(555) 555-5595", 8.7, scheduleIdStudent44, "Active", true);
//
//// Student 45
//        ArrayList<String> scheduleIdStudent45 = new ArrayList<>();
//        scheduleIdStudent45.add("SH1002");
//        scheduleIdStudent45.add("SH1005");
//        education.getStudentsDirectory().addStudent("S1044", "Benjamin Anderson", "benjandi", "benjandi", "benjamin.anderson@eduverse.edu", "(555) 555-5596", 9.5, scheduleIdStudent45, "Active", true);
//
//// Student 46
//        ArrayList<String> scheduleIdStudent46 = new ArrayList<>();
//        scheduleIdStudent46.add("SH1003");
//        scheduleIdStudent46.add("SH1006");
//        education.getStudentsDirectory().addStudent("S1045", "Liam Rodriguez", "liamrodr", "liamrodr", "liam.rodriguez@eduverse.edu", "(555) 555-5597", 9.0, scheduleIdStudent46, "Active", true);
//
//// Student 47
//        ArrayList<String> scheduleIdStudent47 = new ArrayList<>();
//        scheduleIdStudent47.add("SH1007");
//        scheduleIdStudent47.add("SH1010");
//        education.getStudentsDirectory().addStudent("S1046", "Olivia Adams", "oliviaada", "oliviaada", "olivia.adams@eduverse.edu", "(555) 555-5598", 8.8, scheduleIdStudent47, "Active", true);
//
//// Student 48
//        ArrayList<String> scheduleIdStudent48 = new ArrayList<>();
//        scheduleIdStudent48.add("SH1001");
//        scheduleIdStudent48.add("SH1004");
//        education.getStudentsDirectory().addStudent("S1047", "William Miller", "willmill", "willmill", "william.miller@eduverse.edu", "(555) 555-5599", 9.4, scheduleIdStudent48, "Active", true);
//
//// Student 49
//        ArrayList<String> scheduleIdStudent49 = new ArrayList<>();
//        scheduleIdStudent49.add("SH1005");
//        scheduleIdStudent49.add("SH1008");
//        education.getStudentsDirectory().addStudent("S1048", "Sophia Perez", "sophiper", "sophiper", "sophia.perez@eduverse.edu", "(555) 555-5600", 8.6, scheduleIdStudent49, "Active", true);
//
//// Student 50
//        ArrayList<String> scheduleIdStudent50 = new ArrayList<>();
//        scheduleIdStudent50.add("SH1002");
//        scheduleIdStudent50.add("SH1006");
//        education.getStudentsDirectory().addStudent("S1049", "Elijah Clark", "elijclark", "elijclark", "elijah.clark@eduverse.edu", "(555) 555-5601", 8.5, scheduleIdStudent50, "Active", true);



    // Jobs
        education.getEmployer().createJobPosting("1", "SDE 1", "Oracle");
        education.getEmployer().createJobPosting("2", "SDE 2", "Amazon");
        education.getEmployer().createJobPosting("3", "SDE 3", "Facebook");
        
        return education;
    }
}
