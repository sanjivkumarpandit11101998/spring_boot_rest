package com.sanjiv.spring_boot_rest.service;

import com.sanjiv.spring_boot_rest.model.jobPost;
import com.sanjiv.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;



    public void addJobPost(jobPost job){
        repo.save(job);
    }

    public List<jobPost> getAllJobs(){
        return repo.findAll();
    }

    public jobPost getJob(int id) {
        return repo.findById(id).orElse(new jobPost());
    }

    public void addJob(jobPost jobPost) {
        repo.save(jobPost);
    }

    public void updateJob(jobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
        List<String> category= new ArrayList<>(Arrays.asList("Python", "Java"));
        List<jobPost> jobs= new ArrayList<>(Arrays.asList(
                new jobPost(1, "Java Developer", "Must Have Good Experience", "3 to 5 Years Of Experience", category),
                new jobPost(2, "Java Developer", "Must Have Good Experience", "3 to 5 Years Of Experience", category),
                new jobPost(3, "Java Developer", "Must Have Good Experience", "3 to 5 Years Of Experience", category)
            ));
        repo.saveAll(jobs);

    }

    public List<jobPost> search(String keyword) {
        List<jobPost> jobList= new ArrayList<>();
        List<jobPost> allJobList= repo.findAll();

        for(jobPost job: allJobList) {
            if(job.getPostProfile().contains(keyword) || job.getPostDesc().contains(keyword)){
                jobList.add(job);
            }
        }

        return jobList;
    }


}
