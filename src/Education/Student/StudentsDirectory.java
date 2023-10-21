/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Student;

import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class StudentsDirectory {
        private ArrayList<Student>studentList;
    
        public StudentsDirectory(){
        this.studentList = new ArrayList<Student>();
    }
        
        public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student>studentList) {
        this.studentList = studentList;
    }
   
   public Student addStudent(){
       Student student = new Student();
       studentList.add(student);
       return student;
   } 
   
    
   public void deleteStudent(Student student){
       studentList.remove(student);
   }
   
   public Student searchUser(String studentId){
       for(Student us: studentList){
           if(us.getStudentId().equals(studentId)){
               return us;
           }
       }
       return null;
   }    
}
