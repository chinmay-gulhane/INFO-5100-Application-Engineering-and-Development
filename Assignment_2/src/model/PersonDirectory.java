/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author chinmaygulhane
 */
public class PersonDirectory {
    private ArrayList<Person> personList;
    
    public PersonDirectory(){
        this.personList = new ArrayList<Person>();
        
        // Added admin to person and user        
        Person person = new Person();
        person.setName("Chinmay");
        person.setRole("User");
        person.setGender("Male");
        person.setAge("24");
        person.setContactNumber(1231231231);
        person.setCountry("India");
        person.setCity("Pune");
        person.setEmailId("c@gmail.com");
        person.setNUID("1");
        personList.add(person);
         
//        person = new Person();
//        person.setName("Ram");
//        person.setRole("User");
//        person.setGender("Female");
//        person.setAge("30");
//        person.setContactNumber(1231231231);
//        person.setCountry("USA");
//        person.setCity("Pune");
//        person.setEmailId("Ram@gmail.com");
//        person.setNUID("23");
//        personList.add(person);
        
        System.out.println("personList "+personList);
        
        // add dummy user to person and user        
    }
    
    // methods for person    
    public ArrayList<Person> getPersons() {
        return personList;
    }
    
    public ArrayList<Person> getPersonsWhoAreUsers() {
        return personList;
    }

    public void setPersons(ArrayList<Person> history) {
        this.personList = history;
    }
    
    public Person addNewPerson(){
        //Instantiate an object of Data Type EmployeeDetails
        Person newDetails = new Person(); 
        personList.add(newDetails);
        return newDetails;
       
    }

    public void deletePerson(Person ed) {
        personList.remove(ed);   
    }
    
    public Person searchPersonByNuId(String nuid){
        for(Person p: personList){
            if(p.getNUID().equals(nuid)){
                System.out.println(p);
                return p;
            }
        }
        return null;
    }
    
}
