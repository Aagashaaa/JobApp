package com.project.jobApp.job;

import java.util.List;

public interface JobService {

    List<Jobs>findAll();
    void addJob(Jobs job);

    Jobs getJobById(long id);

    boolean deleteJobById(long id);

    boolean updateJob(long id, Jobs updatedJob);
}
