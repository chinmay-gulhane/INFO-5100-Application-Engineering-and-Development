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
    int shCount;
    public CourseSchedulesDirectory(){
        this.coursesScheduleList = new ArrayList<CourseSchedule>();
        this.shCount = 1050;
    }
        
    public ArrayList<CourseSchedule> getCourseScheduleList() {
        return coursesScheduleList;
    }

    public void setCourseScheduleList(ArrayList<CourseSchedule>coursesScheduleList) {
        this.coursesScheduleList = coursesScheduleList;
    }
   
    public CourseSchedule addCourseSchedule(String scheduleId, String courseId, String startDate, String endDate, String term, int year, String teachingProfessorId, String language, String region, double teachingProfessorRating){
       CourseSchedule cs = new CourseSchedule();
       cs.setEndDate(endDate);
       if(scheduleId.equals("")){
           cs.setScheduleId("SH" + shCount);
           shCount++;
       }else{
           cs.setScheduleId(scheduleId);
       }
       cs.setStartDate(startDate);
       cs.setTeachingProfessorId(teachingProfessorId);
       cs.setTerm(term);
       cs.setYear(year);
       cs.setCourseId(courseId);
       cs.setLanguage(language);
       cs.setRegion(region);
       cs.setTeachingProfessorRating(teachingProfessorRating);
       coursesScheduleList.add(cs);
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
