package com.sanjiv.spring_data_rest_demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class jobPost {
    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private String reqExperience;
    private List<String> postTechStack;
//    public jobPost() {
//    }
//
//    public jobPost(int i, String postProfile, String postDesc, String reqExperience, List<String> postTechStack) {
//        this.postId= i;
//        this.postProfile= postProfile;
//        this.postDesc= postDesc;
//        this.reqExperience= reqExperience;
//        this.postTechStack= postTechStack;
//    }

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

}