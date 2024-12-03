package com.jmc.sekoiacarepath.Models;
import java.util.ArrayList;
import java.util.List;

public class JobTest {
    public static void main(String[] args) {

        //creating job objects
        Job job1 = new Job(1, "Ungarbejder", "Aarhus", "Being able to use a microwave");
        Job job2 = new Job(1, "Ungarbejder", "Thisted", "you have to be able to be alone with elderly people.");

        // Deactivate a job
        job2.deactivateJob();

        // Add jobs to a list
        List<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);

        // Filter and display active jobs
        List<Job> activeJobs = Job.getActiveJobs(jobs);
        for (Job job : activeJobs) {
            System.out.println(job);

        }
    }
}
