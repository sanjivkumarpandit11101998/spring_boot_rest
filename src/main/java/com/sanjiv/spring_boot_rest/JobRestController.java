package com.sanjiv.spring_boot_rest;


import com.sanjiv.spring_boot_rest.model.jobPost;
import com.sanjiv.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class JobRestController {

    @Autowired
    private JobService service;

//    @GetMapping(path = "jobPosts", produces = {"application/xml"})
    //install package Jackson Dataformat XML for xml
    @GetMapping("jobPosts")
    public List<jobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public jobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<jobPost> searchByKeyword(@PathVariable("keyword") String keyword){
        return service.search(keyword);
    }

    @PostMapping("jobPost")
    public jobPost addJob(@RequestBody jobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public jobPost updateJob(@RequestBody jobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public void deleteJob(@PathVariable("postId") int postId){
        service.deleteJob(postId);
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
        return "success";
    }
}
