/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author chinmaygulhane
 */
// Course class
class Course {
    private int courseId;
    private String courseName;
    private String professorName;
    private String courseDescription;

    // Constructor
    public Course(int courseId, String courseName, String professorName, String courseDescription) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.professorName = professorName;
        this.courseDescription = courseDescription;
    }
    public int getCourseId() {
        return courseId;
        // Logic to create a new course
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    // Getters and setters
    // ...
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    // CRUD operations
    public void createCourse() {
        // Logic to create a new course
    }

    public Course readCourse(int courseId) {
        // Logic to read course by courseId
        return null;
    }

    public void updateCourse(int courseId) {
        // Logic to update an existing course
    }

    public void deleteCourse(int courseId) {
        // Logic to delete a course
    }

}