package com.example.demo.post;
import java.util.*;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,String> {
    
    //public List<Post> findByUserId(Integer userId);
}