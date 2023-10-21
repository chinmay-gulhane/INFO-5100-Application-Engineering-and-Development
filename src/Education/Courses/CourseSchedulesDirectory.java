/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Courses;

import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class CourseSchedulesDirectory {
    private ArrayList<CourseSchedule> coursesScheduleList;
    
    public CourseSchedulesDirectory(){
        this.coursesScheduleList = new ArrayList<CourseSchedule>();
    }
        
    public ArrayList<CourseSchedule> getCourseScheduleList() {
        return coursesScheduleList;
    }

    public void setCourseScheduleList(ArrayList<CourseSchedule>coursesScheduleList) {
        this.coursesScheduleList = coursesScheduleList;
    }
   
    public CourseSchedule addCourseSchedule(String scheduleId, String courseId, String startDate, String endDate, String term, int year, String teachingProfessorId, String language, String region){
       CourseSchedule cs = new CourseSchedule();
       cs.setEndDate(endDate);
       cs.setScheduleId(scheduleId);
       cs.setStartDate(startDate);
       cs.setTeachingProfessor(teachingProfessorId);
       cs.setTerm(term);
       cs.setYear(year);
       cs.setCourseId(courseId);
       cs.setLanguage(language);
       cs.setRegion(region);
       return cs;
   } 
   
    
    public void deleteCourseSchedule(CourseSchedule cs){
       coursesScheduleList.remove(cs);
    }
   
    public CourseSchedule searchCourseSchedule(String scId){
       for(CourseSchedule us: coursesScheduleList){
           if(us.getScheduleId().equals(scId)){
               return us;
           }
       }
       return null;
   }    
}
