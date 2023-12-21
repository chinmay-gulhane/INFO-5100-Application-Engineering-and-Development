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
public class UserDirectory {
    private ArrayList<User> userList;

    public UserDirectory() {
        this.userList = new ArrayList<User>();   
        
        User user = new User();
        user.setUserName("admin");
        user.setPassword("admin");
        user.setEnabledStaus("Yes");
        user.setRole("Admin");
        userList.add(user);
        
        user = new User();
        user.setUserName("chinmay");
        user.setPassword("chinmay");
        user.setEnabledStaus("Yes");
        user.setRole("User");
        user.setNUID("1");
        userList.add(user);
        
    }
    // methods for user
    public ArrayList<User> getUsers() {
        return userList;
    }

    public void setUsers(ArrayList<User> history) {
        this.userList = history;
    }
    
    public User addNewUser(){
        User newDetails = new User(); 
        userList.add(newDetails);
        return newDetails;
    }

    public void deleteUser(User ed) {
        userList.remove(ed);  
    }
    
    public User searchUserByNuId(String nuid){
        for(User u: userList){
            if(u.getRole().equals("User") && u.getNUID() != null && u.getNUID().equals(nuid)){
                return u;
            }
        }
        return null;
    }
    
    public User searchUserByUserName(String userName){
        for(User u: userList){
            if(u.getRole().equals("User") && u.getUserName().equals(userName)){
                return u;
            }
        }
        return null;
    }
}
