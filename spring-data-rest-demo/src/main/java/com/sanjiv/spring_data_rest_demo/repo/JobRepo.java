package com.sanjiv.spring_data_rest_demo.repo;


import com.sanjiv.spring_data_rest_demo.model.jobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<jobPost, Integer> {

//    List<jobPost> findByPostProfile(String postProfile, String postDesc);
}