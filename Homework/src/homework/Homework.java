/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework;

/**
 *
 * @author chinmaygulhane
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Create new course
        Course course1 = new Course(1, "Java Programming", "John Doe", "Learn Java programming basics");
        Course course2 = new Course(2, "Web Development", "Jane Smith", "HTML, CSS, and JavaScript essentials");

        // CRUD operations on course
        course1.createCourse();
        course1.readCourse(1);
        course1.updateCourse(1);
        course1.deleteCourse(1);

        // Create new course schedule
        CourseSchedule schedule = new CourseSchedule(1, 2023, Semester.FALL);
        schedule.addCourse(course1);
        schedule.addCourse(course2);

        // CRUD operations on course schedule
        schedule.addCourse(course1);
        schedule.removeCourse(1);
        schedule.getAllCourses();
        schedule.getCourse(2);
        
        // Create a professor
        Professor professor = new Professor(1, "John Doe");

        // Professor creates a course
        professor.createCourse(1, "Java Programming", "Learn Java programming basics");
        professor.createCourse(2, "Web Development", "HTML, CSS, and JavaScript essentials");

        // Professor creates a course schedule
        CourseSchedule schedule1 = professor.createCourseSchedule(1, 2023, Semester.FALL);
        
        System.out.println(schedule1.getAllCourses());
    }
    
}
