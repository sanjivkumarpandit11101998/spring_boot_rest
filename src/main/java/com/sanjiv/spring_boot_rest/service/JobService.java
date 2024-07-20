package com.sanjiv.spring_boot_rest.service;

import com.sanjiv.spring_boot_rest.model.jobPost;
import com.sanjiv.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJobPost(jobPost job){
        repo.addJob(job);
    }

    public List<jobPost> getAllJobs(){
        return repo.getAllJobs();
    }

    public jobPost getJob(int id) {
        return repo.getJob(id);
    }

    public void addJob(jobPost jobPost) {
        repo.addJob(jobPost);
    }

    public void updateJob(jobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}
