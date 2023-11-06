/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chinmaygulhane
 */
class Professor {
    private int professorId;
    private String professorName;
    private List<Course> courses;

    // Constructor
    public Professor(int professorId, String professorName) {
        this.professorId = professorId;
        this.professorName = professorName;
        this.courses = new ArrayList<>();
    }

    // Getters and setters
    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    // Method to create a course
    public void createCourse(int courseId, String courseName, String courseDescription) {
        Course course = new Course(courseId, courseName, this.professorName, courseDescription);
        courses.add(course);
    }

    // Method to create a course schedule
    public CourseSchedule createCourseSchedule(int scheduleId, int year, Semester semester) {
        CourseSchedule schedule = new CourseSchedule(scheduleId, year, semester);
        for (Course course : courses) {
            schedule.addCourse(course);
        }
        return schedule;
    }

    // Other methods for the Professor class
    // ...
}
