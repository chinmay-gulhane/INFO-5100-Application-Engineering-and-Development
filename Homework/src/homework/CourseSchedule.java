/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.ArrayList;
import java.util.List;

// Semester enum
enum Semester {
    FALL, SPRING
}

/**
 *
 * @author chinmaygulhane
 */
// CourseSchedule class
class CourseSchedule {
    private int scheduleId;
    private int year;
    private Semester semester;
    private List<Course> courses;

    // Constructor
    public CourseSchedule(int scheduleId, int year, Semester semester) {
        this.scheduleId = scheduleId;
        this.year = year;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    // Getters and setters
    // ...

    // CRUD operations
    public void addCourse(Course course) {
        // Logic to add a course to the schedule
        courses.add(course);
    }

    public void removeCourse(int courseId) {
        // Logic to remove a course from the schedule
        courses.removeIf(course -> course.getCourseId() == courseId);
    }

    public List<Course> getAllCourses() {
        // Return all courses in this schedule
        return courses;
    }

    public Course getCourse(int courseId) {
        // Logic to get a course from the schedule by courseId
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                return course;
            }
        }
        return null;
    }
}
