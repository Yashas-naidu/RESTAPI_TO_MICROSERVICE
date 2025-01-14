package com.embarkx.firstjobapp.job;

import java.util.List;

// loose coupling if i use interface instead of class
public interface JobService {
         List<Job> findAll();
         void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
