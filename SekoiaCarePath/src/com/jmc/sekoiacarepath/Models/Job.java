package com.jmc.sekoiacarepath.Models;
import java.util.List;
import java.util.stream.Collectors;

public class Job {
    /* this is the job class. This classshows job postings created by an employer,
    where it will be possible to read details such as title, description and requirements.
     */

    //Creat fields/attributes:
    private int jobId;
    private String jobTitle;
    //her skal der være mulighed for at uploade discription (PDF)
    private String municipality;
    private String additionalRequirements;
    private boolean isActive;


    public Job(int jobId, String jobTitle, String municipality, String additionalRequirements, boolean isActive) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.municipality = municipality;
        this.additionalRequirements = additionalRequirements;
        this.isActive = true; // Default to active when it is created;
    }


//make setters;

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public void setAdditionalRequirements(String additionalRequirements) {
        this.additionalRequirements = additionalRequirements;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    //make getters:


    public int getJobId() {
        return jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getMunicipality() {
        return municipality;
    }

    public String getAdditionalRequirements() {
        return additionalRequirements;
    }

    public boolean isActive() {
        return isActive; // return the current status
    }

    //methods to deactivate the job
    public void deactivateJob() {
        this.isActive = false;
    }

    @Override
    public String toString() {
        if (!isActive) {
            return "This job is no longer available.";
        }
        return "Job ID: " + jobId +
                "\nTitle: " + jobTitle +
                "\nMunicipality: " + municipality +
                "\nAdditional Requirements: " + additionalRequirements +
                "\nStatus: Active";
    }

    // Example of filtering active jobs (in some list of jobs)
    public static List<Job> getActiveJobs(List<Job> jobs) {
        return jobs.stream()
                .filter(Job::isActive)
                .collect(Collectors.toList());
    }
}
