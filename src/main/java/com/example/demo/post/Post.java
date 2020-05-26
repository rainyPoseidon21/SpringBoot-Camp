package com.example.demo.post;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.user.*;

@Entity
public class Post {

    @Id
    private String id;
    private String postDate;

    @ManyToOne
    private User user;
    private String details;

    //default controller
    Post(){

    }

    Post(String id, String postDate, User user, String details){
        this.id = id;
        this.postDate = postDate;
        this.user = user;
        this.details = details;
    }

    public String getId(){
        return this.id;
    }

    public void SetId(String id){
        this.id = id;
    }
    


    public String getpostDate(){
        return this.postDate;
    }

    public void SetpostDate(String postDate){
        this.postDate = postDate;
    }

    public User getuser(){
        return this.user;
    }

    public void Setuser(User user){
        this.user = user;
    }

    public String getdetails(){
        return this.details;
    }

    public void Setdetails(String details){
        this.details = details;
    }
}