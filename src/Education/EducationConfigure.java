/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class EducationConfigure {

    public static Education initialize() {
        ArrayList<String> scheduleId = scheduleId = new ArrayList<String>();;
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

        education.getCourseScheduleDirectory().addCourseSchedule("SH1000", "INFO 5001", "01/08/2022", "01/12/2022", "Fall", 2022, "P1000", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("SH1001", "INFO 5001", "01/08/2023", "01/12/2023", "Fall", 2023, "P1000", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("SH1002", "INFO 5101", "01/01/2022", "01/04/2022", "Spring", 2022, "P1001", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("SH1003", "INFO 5101", "01/08/2022", "01/12/2022", "Fall", 2022, "P1002", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("SH1004", "INFO 6150", "01/08/2021", "01/12/2021", "Fall", 2021, "P1003", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("SH1005", "CSYE 6200", "01/08/2022", "01/12/2022", "Fall", 2022, "P1004", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("SH1006", "CSYE 6620", "01/01/2023", "01/04/2023", "Spring", 2023, "P1004", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("SH1007", "CSYE 6620", "01/08/2021", "01/12/2021", "Fall", 2021, "P1005", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("SH1008", "ENCP 6100", "01/08/2023", "01/12/2023", "Fall", 2023, "P1006", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("SH1009", "ENCP 6101", "01/01/2020", "01/04/2020", "Spring", 2020, "P1007", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("SH1010", "DASC 2000", "01/08/2020", "01/12/2020", "Fall", 2020, "P1008", "English", "Boston");
        education.getCourseScheduleDirectory().addCourseSchedule("SH1011", "DASC 2010", "01/08/2023", "01/12/2023", "Fall", 2023, "P1009", "English", "Boston");

        education.getProfessorsDirectory().addProfessor("P1000", "SarMil", "Dr. Sarah Miller", "SarMil", "sarah.miller@eduverse.edu", "(555) 555-5555", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1001", "MicJoh", "Dr. Michael Johnson", "MicJoh", "michael.johnson@eduverse.edu", "(555) 555-5556", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1002", "EmiSmi", "Prof. Emily Smith", "EmiSmi", "emily.smith@eduverse.edu", "(781) 555-5557", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1003", "DavDav", "Dr. David Davis", "DavDav", "david.davis@eduverse.edu", "(721) 555-5558", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1004", "JenWhi", "Dr. Jennifer White", "JenWhi", "jennifer.white@eduverse.edu", "(581) 555-5559", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1005", "RicBro", "Prof. Richard Brown", "RicBro", "richard.brown@eduverse.edu", "(555) 555-5225", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1006", "MarGon", "Dr. Maria Gonzalez", "MarGon", "sarah.miller@eduverse.edu", "(452) 555-2322", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1007", "BenWil", "Dr. Benjamin Wilson", "BenWil", "sarah.miller@eduverse.edu", "(555) 214-5555", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1008", "LauTay", "Prof. Laura Taylor", "LauTay", "sarah.miller@eduverse.edu", "(651) 555-3024", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1009", "MatCla", "Dr. Matthew Clark", "MatCla", "sarah.miller@eduverse.edu", "(872) 555-1045", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1010", "OliTur", "Dr. Olivia Turner", "OliTur", "olivia.turner@eduverse.edu", "(555) 781-5874", "Active", false);
        education.getProfessorsDirectory().addProfessor("P1011", "HenMit", "Prof. Henry Mitchell", "HenMit", "henry.mitchell@eduverse.edu", "(555) 234-5555", "Active", true);
        education.getProfessorsDirectory().addProfessor("P1012", "SopAnd", "Prof. Sophia Anderson", "SopAnd", "sophia.anderson@eduverse.edu", "(555) 124-2365", "Active", true);

// Student 1
        scheduleId.add("SH1000");
        scheduleId.add("SH1002");
        education.getStudentsDirectory().addStudent("S1000", "Samiksha Baral", "sambar", "sambar", "samiksha.baral@eduverse.edu", "(555) 555-5555", 9.2, scheduleId, "Active", true);
        scheduleId.clear();
        
// Student 2
        scheduleId.add("SH1002");
        scheduleId.add("SH1003");
        education.getStudentsDirectory().addStudent("S1001", "John Smith", "johsmith", "johsmith", "john.smith@eduverse.edu", "(555) 555-5556", 8.7, scheduleId, "Active", true);
        scheduleId.clear();

// Student 3
        scheduleId.add("SH1004");
        scheduleId.add("SH1005");
        education.getStudentsDirectory().addStudent("S1002", "Emily Johnson", "emijohn", "emijohn", "emily.johnson@eduverse.edu", "(555) 555-5557", 8.9, scheduleId, "Active", true);
        scheduleId.clear();

// Student 4
        scheduleId.add("SH1001");
        scheduleId.add("SH1002");
        education.getStudentsDirectory().addStudent("S1003", "Henry Mitchell", "henmit", "henmit", "henry.mitchell@eduverse.edu", "(555) 555-5553", 9.8, scheduleId, "Active", true);
        scheduleId.clear();

// Student 5
        scheduleId.add("SH1003");
        scheduleId.add("SH1001");
        education.getStudentsDirectory().addStudent("S1004", "Maria Gonzalez", "margon", "margon", "maria.gonzalez@eduverse.edu", "(555) 555-5552", 9.6, scheduleId, "Active", true);
        scheduleId.clear();

// Student 6
        scheduleId.add("SH1004");
        scheduleId.add("SH1006");
        education.getStudentsDirectory().addStudent("S1005", "Benjamin Wilson", "benwil", "benwil", "benjamin.wilson@eduverse.edu", "(555) 555-5551", 9.7, scheduleId, "Active", true);
        scheduleId.clear();
        
        // Student 7
scheduleId.add("SH1006");
scheduleId.add("SH1007");
education.getStudentsDirectory().addStudent("S1006", "Olivia Martinez", "olimart", "olimart", "olivia.martinez@eduverse.edu", "(555) 555-5558", 8.5, scheduleId, "Active", true);
scheduleId.clear();

// Student 8
scheduleId.add("SH1007");
scheduleId.add("SH1008");
education.getStudentsDirectory().addStudent("S1007", "Lucas Brown", "lucbrown", "lucbrown", "lucas.brown@eduverse.edu", "(555) 555-5559", 9.1, scheduleId, "Active", true);
scheduleId.clear();

// Student 9
scheduleId.add("SH1008");
scheduleId.add("SH1009");
education.getStudentsDirectory().addStudent("S1008", "Ava Davis", "avadav", "avadav", "ava.davis@eduverse.edu", "(555) 555-5560", 7.8, scheduleId, "Active", true);
scheduleId.clear();

// Student 10
scheduleId.add("SH1009");
scheduleId.add("SH1010");
education.getStudentsDirectory().addStudent("S1009", "Mason Garcia", "masgar", "masgar", "mason.garcia@eduverse.edu", "(555) 555-5561", 9.0, scheduleId, "Active", true);
scheduleId.clear();

// Student 11
scheduleId.add("SH1010");
scheduleId.add("SH1011");
education.getStudentsDirectory().addStudent("S1010", "Sophia Hernandez", "sophern", "sophern", "sophia.hernandez@eduverse.edu", "(555) 555-5562", 8.3, scheduleId, "Active", true);
scheduleId.clear();

// Student 12
scheduleId.add("SH1009");
scheduleId.add("SH1010");
education.getStudentsDirectory().addStudent("S1011", "Sophie Miller", "sophiemil", "sophiemil", "sophie.miller@eduverse.edu", "(555) 555-5563", 8.4, scheduleId, "Active", true);
scheduleId.clear();

// Student 13
scheduleId.add("SH1010");
scheduleId.add("SH1011");
education.getStudentsDirectory().addStudent("S1012", "Elijah Brown", "elijahbro", "elijahbro", "elijah.brown@eduverse.edu", "(555) 555-5564", 9.2, scheduleId, "Active", true);
scheduleId.clear();

// Student 14
scheduleId.add("SH1000");
scheduleId.add("SH1003");
education.getStudentsDirectory().addStudent("S1013", "Zoe Robinson", "zoerob", "zoerob", "zoe.robinson@eduverse.edu", "(555) 555-5565", 8.7, scheduleId, "Active", true);
scheduleId.clear();

// Student 15
scheduleId.add("SH1005");
scheduleId.add("SH1008");
education.getStudentsDirectory().addStudent("S1014", "Aiden Clark", "aidencla", "aidencla", "aiden.clark@eduverse.edu", "(555) 555-5566", 9.0, scheduleId, "Active", true);
scheduleId.clear();

// Student 16
scheduleId.add("SH1007");
scheduleId.add("SH1011");
education.getStudentsDirectory().addStudent("S1015", "Sophia Hill", "sophiahil", "sophiahil", "sophia.hill@eduverse.edu", "(555) 555-5567", 9.8, scheduleId, "Active", true);
scheduleId.clear();

// Student 17
scheduleId.add("SH1006");
scheduleId.add("SH1009");
education.getStudentsDirectory().addStudent("S1016", "William Turner", "willturn", "willturn", "william.turner@eduverse.edu", "(555) 555-5568", 8.2, scheduleId, "Active", true);
scheduleId.clear();

// Student 18
scheduleId.add("SH1001");
scheduleId.add("SH1004");
education.getStudentsDirectory().addStudent("S1017", "Grace White", "gracewhi", "gracewhi", "grace.white@eduverse.edu", "(555) 555-5569", 9.4, scheduleId, "Active", true);
scheduleId.clear();

// Student 19
scheduleId.add("SH1002");
scheduleId.add("SH1005");
education.getStudentsDirectory().addStudent("S1018", "Logan Adams", "loganada", "loganada", "logan.adams@eduverse.edu", "(555) 555-5570", 8.6, scheduleId, "Active", true);
scheduleId.clear();

// Student 20
scheduleId.add("SH1007");
scheduleId.add("SH1010");
education.getStudentsDirectory().addStudent("S1019", "Ava Stewart", "avastew", "avastew", "ava.stewart@eduverse.edu", "(555) 555-5571", 9.1, scheduleId, "Active", true);
scheduleId.clear();

// Student 21
scheduleId.add("SH1003");
scheduleId.add("SH1006");
education.getStudentsDirectory().addStudent("S1020", "Daniel Parker", "danipar", "danipar", "daniel.parker@eduverse.edu", "(555) 555-5572", 8.9, scheduleId, "Active", true);
scheduleId.clear();

// Student 22
scheduleId.add("SH1008");
scheduleId.add("SH1011");
education.getStudentsDirectory().addStudent("S1021", "Emma Collins", "emmacol", "emmacol", "emma.collins@eduverse.edu", "(555) 555-5573", 9.7, scheduleId, "Active", true);
scheduleId.clear();

// Student 23
scheduleId.add("SH1004");
scheduleId.add("SH1007");
education.getStudentsDirectory().addStudent("S1022", "Michael Price", "michapri", "michapri", "michael.price@eduverse.edu", "(555) 555-5574", 8.5, scheduleId, "Active", true);
scheduleId.clear();

// Student 24
scheduleId.add("SH1006");
scheduleId.add("SH1009");
education.getStudentsDirectory().addStudent("S1023", "Sophia Young", "sophiyou", "sophiyou", "sophia.young@eduverse.edu", "(555) 555-5575", 9.3, scheduleId, "Active", true);
scheduleId.clear();

// Student 25
scheduleId.add("SH1002");
scheduleId.add("SH1005");
education.getStudentsDirectory().addStudent("S1024", "Matthew King", "mattking", "mattking", "matthew.king@eduverse.edu", "(555) 555-5576", 8.4, scheduleId, "Active", true);
scheduleId.clear();

// Student 26
scheduleId.add("SH1003");
scheduleId.add("SH1006");
education.getStudentsDirectory().addStudent("S1025", "Olivia Murphy", "olivmur", "olivmur", "olivia.murphy@eduverse.edu", "(555) 555-5577", 9.5, scheduleId, "Active", true);
scheduleId.clear();

// Student 27
scheduleId.add("SH1001");
scheduleId.add("SH1004");
education.getStudentsDirectory().addStudent("S1026", "James Scott", "jamscott", "jamscott", "james.scott@eduverse.edu", "(555) 555-5578", 9.0, scheduleId, "Active", true);
scheduleId.clear();

// Student 28
scheduleId.add("SH1005");
scheduleId.add("SH1008");
education.getStudentsDirectory().addStudent("S1027", "Sophia Green", "sophigre", "sophigre", "sophia.green@eduverse.edu", "(555) 555-5579", 8.2, scheduleId, "Active", true);
scheduleId.clear();

// Student 29
scheduleId.add("SH1002");
scheduleId.add("SH1006");
education.getStudentsDirectory().addStudent("S1028", "Liam Carter", "liamcar", "liamcar", "liam.carter@eduverse.edu", "(555) 555-5580", 8.7, scheduleId, "Active", true);
scheduleId.clear();

// Student 30
scheduleId.add("SH1007");
scheduleId.add("SH1010");
education.getStudentsDirectory().addStudent("S1029", "Olivia Ross", "olivross", "olivross", "olivia.ross@eduverse.edu", "(555) 555-5581", 8.9, scheduleId, "Active", true);
scheduleId.clear();

// Student 31
scheduleId.add("SH1003");
scheduleId.add("SH1006");
education.getStudentsDirectory().addStudent("S1030", "William Wright", "willwrigh", "willwrigh", "william.wright@eduverse.edu", "(555) 555-5582", 9.3, scheduleId, "Active", true);
scheduleId.clear();

// Student 32
scheduleId.add("SH1008");
scheduleId.add("SH1011");
education.getStudentsDirectory().addStudent("S1031", "Ava Reed", "avareed", "avareed", "ava.reed@eduverse.edu", "(555) 555-5583", 9.4, scheduleId, "Active", true);
scheduleId.clear();

// Student 33
scheduleId.add("SH1004");
scheduleId.add("SH1007");
education.getStudentsDirectory().addStudent("S1032", "Ethan Hall", "ethanhal", "ethanhal", "ethan.hall@eduverse.edu", "(555) 555-5584", 8.6, scheduleId, "Active", true);
scheduleId.clear();

// Student 34
scheduleId.add("SH1006");
scheduleId.add("SH1009");
education.getStudentsDirectory().addStudent("S1033", "Zoe Turner", "zoeturn", "zoeturn", "zoe.turner@eduverse.edu", "(555) 555-5585", 9.1, scheduleId, "Active", true);
scheduleId.clear();

// Student 35
scheduleId.add("SH1002");
scheduleId.add("SH1005");
education.getStudentsDirectory().addStudent("S1034", "Noah Lewis", "noahlewi", "noahlewi", "noah.lewis@eduverse.edu", "(555) 555-5586", 9.5, scheduleId, "Active", true);
scheduleId.clear();

// Student 36
scheduleId.add("SH1003");
scheduleId.add("SH1006");
education.getStudentsDirectory().addStudent("S1035", "Sophia Perez", "sophiper", "sophiper", "sophia.perez@eduverse.edu", "(555) 555-5587", 8.3, scheduleId, "Active", true);
scheduleId.clear();

// Student 37
scheduleId.add("SH1007");
scheduleId.add("SH1010");
education.getStudentsDirectory().addStudent("S1036", "Elijah Wood", "elijwood", "elijwood", "elijah.wood@eduverse.edu", "(555) 555-5588", 9.2, scheduleId, "Active", true);
scheduleId.clear();

// Student 38
scheduleId.add("SH1001");
scheduleId.add("SH1004");
education.getStudentsDirectory().addStudent("S1037", "Aiden Baker", "aidenbak", "aidenbak", "aiden.baker@eduverse.edu", "(555) 555-5589", 8.8, scheduleId, "Active", true);
scheduleId.clear();

// Student 39
scheduleId.add("SH1005");
scheduleId.add("SH1008");
education.getStudentsDirectory().addStudent("S1038", "Emma Wright", "emmawrig", "emmawrig", "emma.wright@eduverse.edu", "(555) 555-5590", 9.0, scheduleId, "Active", true);
scheduleId.clear();

// Student 40
scheduleId.add("SH1002");
scheduleId.add("SH1006");
education.getStudentsDirectory().addStudent("S1039", "Mason Foster", "masonfos", "masonfos", "mason.foster@eduverse.edu", "(555) 555-5591", 8.4, scheduleId, "Active", true);
scheduleId.clear();

// Student 41
scheduleId.add("SH1003");
scheduleId.add("SH1006");
education.getStudentsDirectory().addStudent("S1040", "Oliver Nelson", "olivnels", "olivnels", "oliver.nelson@eduverse.edu", "(555) 555-5592", 9.1, scheduleId, "Active", true);
scheduleId.clear();

// Student 42
scheduleId.add("SH1008");
scheduleId.add("SH1011");
education.getStudentsDirectory().addStudent("S1041", "Ava Turner", "avaturn", "avaturn", "ava.turner@eduverse.edu", "(555) 555-5593", 8.9, scheduleId, "Active", true);
scheduleId.clear();

// Student 43
scheduleId.add("SH1004");
scheduleId.add("SH1007");
education.getStudentsDirectory().addStudent("S1042", "Liam Hernandez", "liamhern", "liamhern", "liam.hernandez@eduverse.edu", "(555) 555-5594", 9.2, scheduleId, "Active", true);
scheduleId.clear();

// Student 44
scheduleId.add("SH1006");
scheduleId.add("SH1009");
education.getStudentsDirectory().addStudent("S1043", "Charlotte White", "charwhit", "charwhit", "charlotte.white@eduverse.edu", "(555) 555-5595", 8.7, scheduleId, "Active", true);
scheduleId.clear();

// Student 45
scheduleId.add("SH1002");
scheduleId.add("SH1005");
education.getStudentsDirectory().addStudent("S1044", "Benjamin Anderson", "benjandi", "benjandi", "benjamin.anderson@eduverse.edu", "(555) 555-5596", 9.5, scheduleId, "Active", true);
scheduleId.clear();

// Student 46
scheduleId.add("SH1003");
scheduleId.add("SH1006");
education.getStudentsDirectory().addStudent("S1045", "Liam Rodriguez", "liamrodr", "liamrodr", "liam.rodriguez@eduverse.edu", "(555) 555-5597", 9.0, scheduleId, "Active", true);
scheduleId.clear();

// Student 47
scheduleId.add("SH1007");
scheduleId.add("SH1010");
education.getStudentsDirectory().addStudent("S1046", "Olivia Adams", "oliviaada", "oliviaada", "olivia.adams@eduverse.edu", "(555) 555-5598", 8.8, scheduleId, "Active", true);
scheduleId.clear();

// Student 48
scheduleId.add("SH1001");
scheduleId.add("SH1004");
education.getStudentsDirectory().addStudent("S1047", "William Miller", "willmill", "willmill", "william.miller@eduverse.edu", "(555) 555-5599", 9.4, scheduleId, "Active", true);
scheduleId.clear();

// Student 49
scheduleId.add("SH1005");
scheduleId.add("SH1008");
education.getStudentsDirectory().addStudent("S1048", "Sophia Perez", "sophiper", "sophiper", "sophia.perez@eduverse.edu", "(555) 555-5600", 8.6, scheduleId, "Active", true);
scheduleId.clear();

// Student 50
scheduleId.add("SH1002");
scheduleId.add("SH1006");
education.getStudentsDirectory().addStudent("S1049", "Elijah Clark", "elijclark", "elijclark", "elijah.clark@eduverse.edu", "(555) 555-5601", 8.5, scheduleId, "Active", true);
scheduleId.clear();

        
        return education;
    }
}
