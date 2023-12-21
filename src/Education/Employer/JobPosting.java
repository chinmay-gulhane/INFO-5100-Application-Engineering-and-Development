/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Employer;

import Education.Student.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author chinmaygulhane
 */
public class JobPosting {
    private String jobId;
    private String jobName;
    private String jobDescription;
    private Map<Student, String> applicants;

    public JobPosting(String jobId, String jobName, String jobDescription) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobDescription = jobDescription;
        this.applicants = new HashMap<>();
        
    }

    @Override
    public String toString() {
        return jobId;
    }

    public String getJobId() {
        return jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void addApplicant(Student student) {
        this.applicants.put(student, "Pending");
    }

    public Map<Student, String> getApplicants() {
        return this.applicants;
    }

    public void acceptStudent(Student student) {
        if (applicants.containsKey(student)) {
            applicants.put(student, "Accepted");
            student.getAppliedJobs().put(this, "Accepted");
        }
    }
    
    public void rejectStudent(Student student) {
        if (applicants.containsKey(student)) {
            applicants.put(student, "Rejected");
            student.getAppliedJobs().put(this, "Rejected");
        }
    }
}
