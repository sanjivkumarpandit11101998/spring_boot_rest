package com.sanjiv.spring_boot_rest.repo;


import com.sanjiv.spring_boot_rest.model.jobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<jobPost, Integer> {

//    List<jobPost> findByPostProfile(String postProfile, String postDesc);
}