/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Courses;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CoursesDirectory {
    private ArrayList<Course> coursesList;
    
    public CoursesDirectory(){
        this.coursesList = new ArrayList<Course>();
    }
        
    public ArrayList<Course> getCourseList() {
        return coursesList;
    }

    public void setCourseList(ArrayList<Course>coursesList) {
        this.coursesList = coursesList;
    }
   
    public Course addCourse(String name,String courseId,String topic,String professorOwnerId,int credit,double reputationIndex){
       Course cs = new Course();
       cs.setName(name);
       cs.setCourseId(courseId);
       cs.setCredit(credit);
       cs.setProfessorOwnerId(professorOwnerId);
       cs.setReputationIndex(reputationIndex);
       cs.setTopic(topic);
       coursesList.add(cs);
       return cs;
   } 
   
    
    public void deleteCourse(Course cs){
       coursesList.remove(cs);
    }
   
    public Course searchCourse(String cId){
       for(Course us: coursesList){
           if(us.getCourseId().equals(cId)){
               return us;
           }
       }
       return null;
   }    
}
