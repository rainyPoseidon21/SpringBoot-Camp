package com.example.demo.post;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public List<Post> getAllPosts(){
        
        List<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(posts::add);

        return posts;
    }

    public Optional<Post> getPostById(String id){
        return  postRepository.findById(id);
    }

    public void addPost(Post post){
        postRepository.save(post);
    }


    public void updatePost(String id, Post post){
        postRepository.save(post);
    }

    public void deletePost(String id){
        postRepository.deleteById(id);
    }

    //custom func from interface
    // public List<Post> getPostsByUser(Integer id){
        
    //     List<Post> posts = new ArrayList<>();
    //     postRepository.findByUserId(id).forEach(posts::add);
    //     return posts;
    // }
}