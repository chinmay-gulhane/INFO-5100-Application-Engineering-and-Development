/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Courses;


/**
 *
 * @author ASUS
 */
 public class Course {

    private String name;
    private String courseId;
    private String topic;
    private String professorOwnerId;
    private int credit;
    private double reputationIndex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getProfessorOwnerId() {
        return professorOwnerId;
    }

    public void setProfessorOwnerId(String professorOwnerId) {
        this.professorOwnerId = professorOwnerId;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getReputationIndex() {
        return reputationIndex;
    }

    public void setReputationIndex(double reputationIndex) {
        this.reputationIndex = reputationIndex;
    }
 }