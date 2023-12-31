/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Courses;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author samik
 */
public class CourseSchedule {
    private String scheduleId;
    private String courseId;
    private String startDate;
    private String endDate;
    private String term;
    private int year;
    private String teachingProfessorId;
    private double teachingProfessorRating;
    private String language;
    private String region;
    Map<String, String> professorFeedback = new HashMap<>();

    public Map<String, String> getProfessorFeedback() {
        return professorFeedback;
    }

    public void setProfessorFeedback(Map<String, String> professorFeedback) {
        this.professorFeedback = professorFeedback;
    }

    public double getTeachingProfessorRating() {
        return teachingProfessorRating;
    }

    public void setTeachingProfessorRating(double teachingProfessorRating) {
        this.teachingProfessorRating = teachingProfessorRating;
    }    
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTeachingProfessorId() {
        return teachingProfessorId;
    }

    public void setTeachingProfessorId(String teachingProfessor) {
        this.teachingProfessorId = teachingProfessor;
    }

    @Override
    public String toString(){
        return this.getScheduleId();
    }
    
}
