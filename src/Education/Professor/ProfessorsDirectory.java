/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Professor;

import Education.Courses.Course;
import Education.Courses.CourseSchedule;
import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class ProfessorsDirectory {
    private ArrayList<Professor>professorList;
    
    public ProfessorsDirectory(){
        this.professorList = new ArrayList<Professor>();
    }
        
    public ArrayList<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(ArrayList<Professor>professorList) {
        this.professorList = professorList;
    }
   
    public Professor addProfessor(String professorId,String username,String name,String currentPassword,String email,String phone,ArrayList<Course>courseList,ArrayList<CourseSchedule>courseScheduleList){
       Professor prof = new Professor();
       prof.setUsername(username);
       prof.setProfessorId(professorId);
       prof.setName(name);
       prof.setCurrentPassword(currentPassword);
       prof.setEmail(email);
       prof.setPhone(phone);
       prof.setCourseList(courseList);
       prof.setCourseScheduleList(courseScheduleList);
       professorList.add(prof);
       return prof;
   } 
   
    
    public void deleteProfessor(Professor professor){
       professorList.remove(professor);
    }
   
    public Professor searchProfessor(String professorId){
       for(Professor us: professorList){
           if(us.getProfessorId().equals(professorId)){
               return us;
           }
       }
       return null;
   }    
}
