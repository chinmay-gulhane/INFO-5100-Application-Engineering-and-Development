/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Professor;

import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class ProfessorsDirectory {
    private ArrayList<Professor>professorList;
    
        public ProfessorsDirectory(){
        this.professorList = new ArrayList<Professor>();
        Professor professor = new Professor();
    }
        
        public ArrayList<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(ArrayList<Professor>professorList) {
        this.professorList = professorList;
    }
   
   public Professor addProfessor(){
       Professor person = new Professor();
       professorList.add(person);
       return person;
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
