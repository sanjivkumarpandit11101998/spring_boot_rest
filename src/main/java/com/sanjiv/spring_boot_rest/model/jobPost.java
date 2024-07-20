package com.sanjiv.spring_boot_rest.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class jobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private String reqExperience;
    private List<String> postTechStack;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId= postId;
    }

    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile= postProfile;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc= postDesc;
    }

    public String getReqExperience() {
        return reqExperience;
    }

    public void setReqExperience(String reqExperience) {
        this.reqExperience= reqExperience;
    }

    public List<String> getPostTechStack() {
        return postTechStack;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack= postTechStack;
    }

//    public jobPost(int postId1, String postProfile1, String postDesc1, String reqExperience1, List<String> postTechStack1) {
//        this.postId= postId1;
//        this.postProfile= postProfile1;
//        this.postDesc= postDesc1;
//        this.reqExperience= reqExperience1;
//        this.postTechStack= postTechStack1;
//    }
}