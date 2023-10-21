/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Education to edit this template
 */
package Education;

import Education.Courses.CoursesDirectory;
import Education.Professor.ProfessorsDirectory;
import Education.Student.StudentsDirectory;
import Education.Admin.Admin;

/**
 *
 * @author ASUS
 */
public class Education {
    private String name;
    private Admin admin;
    private ProfessorsDirectory professorsDirectory;
    private StudentsDirectory studentsDirectory;
    private CoursesDirectory courseDirectory;

    public Education(String name) {
        this.name = name;
        this.admin = new Admin("admin","admin");
        this.professorsDirectory = new ProfessorsDirectory();
        this.studentsDirectory = new StudentsDirectory();
        this.courseDirectory = new CoursesDirectory();
    }

    public String getName() {
        return name;
    }

    public Admin getAdmin() {
        return admin;
    }

    public ProfessorsDirectory getProfessorsDirectory() {
        return professorsDirectory;
    }

    public StudentsDirectory getStudentsDirectory() {
        return studentsDirectory;
    }

    public CoursesDirectory getCourseDirectory() {
        return courseDirectory;
    }
    
}
