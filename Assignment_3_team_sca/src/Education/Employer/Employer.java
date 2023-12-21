/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Education.Employer;

import Education.Student.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author chinmaygulhane
 */
public class Employer {
    private String username;
    private String password;
    private List<JobPosting> jobPostings;
    
    public Employer(String username, String password) {
        this.jobPostings = new ArrayList<>();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public void createJobPosting(String jobId, String jobName, String jobDescription) {
        JobPosting jobPosting = new JobPosting(jobId, jobName, jobDescription);
        this.jobPostings.add(jobPosting);
    }

    public List<JobPosting> getJobPostings() {
        return this.jobPostings;
    }

    public void reviewApplicants(JobPosting jobPosting) {
        Map<Student, String> applicants = jobPosting.getApplicants();
        // Some logic for reviewing applicants
    }
}

