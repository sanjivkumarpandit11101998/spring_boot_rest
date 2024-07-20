package com.sanjiv.spring_boot_rest.repo;


import com.sanjiv.spring_boot_rest.model.jobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<String> category= new ArrayList<>(Arrays.asList("Java", ".net", "React"));
    List<jobPost> jobs= new ArrayList<>(Arrays.asList(
            new jobPost(1, "Java Developer", "Must Have Good Experience", "3 to 5 Years Of Experience", category),
            new jobPost(2, "Java Developer", "Must Have Good Experience", "3 to 5 Years Of Experience", category),
            new jobPost(3, "Java Developer", "Must Have Good Experience", "3 to 5 Years Of Experience", category)
    ));
    public List<jobPost> getAllJobs(){
        return jobs;
    }
    public void addJob(jobPost job){
        jobs.add(job);
    }

    public jobPost getJob(int id) {
        for(jobPost job: jobs){
            if(job.getPostId() == id){
                return job;
            }
        }

        return null;

    }

    public void updateJob(jobPost jobPost) {
         for(jobPost jobPost1: jobs){
             if(jobPost1.getPostId() == jobPost.getPostId()){
                 jobPost1.setPostProfile(jobPost.getPostProfile());
                 jobPost1.setPostDesc(jobPost.getPostDesc());
                 jobPost1.setReqExperience(jobPost.getReqExperience());
                 jobPost1.setPostTechStack(jobPost.getPostTechStack());
             }
         }
    }

    public void deleteJob(int postId) {
        for(jobPost job: jobs){
            if(job.getPostId() == postId){
                jobs.remove(job);
            }
        }
    }
}