/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Education to edit this template
 */
package Education;


import Education.Admin.Admin;
import Education.Courses.CoursesDirectory;
import Education.Professor.ProfessorsDirectory;
import Education.Student.StudentsDirectory;
import Education.Courses.CourseSchedulesDirectory;
import Education.Professor.Professor;
import Education.Student.Student;
import java.util.ArrayList;


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
    private CourseSchedulesDirectory courseScheduleDirectory;
    private ArrayList<Professor> professorAwaitingRegistration = new ArrayList();
    private ArrayList<Student> studentAwaitingRegistration = new ArrayList();

    public Education(String name) {
        this.name = name;
        this.admin = new Admin("admin","admin",professorAwaitingRegistration,studentAwaitingRegistration);
        this.professorsDirectory = new ProfessorsDirectory();
        this.studentsDirectory = new StudentsDirectory();
        this.courseDirectory = new CoursesDirectory();
        this.courseScheduleDirectory = new CourseSchedulesDirectory();
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
    
    public CourseSchedulesDirectory getCourseScheduleDirectory() {
        return courseScheduleDirectory;
    }
}
