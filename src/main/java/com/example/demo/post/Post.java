package com.example.demo.post;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.Auditable;
import com.example.demo.user.*;

@Entity
public class Post extends Auditable<String>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime postDate;

    @ManyToOne
    @JoinColumn(name="userid",insertable = false,updatable = false)
    private User user;

    private Integer userid;

    public Integer getUserId(){
        return this.userid;
    }

    public void setUserId(Integer userid){
        this.userid = userid;
    }

    private String details;

    //default controller
    Post(){

    }

    Post(Integer id, LocalDateTime postDate, User user, String details){
        this.id = id;
        this.postDate = postDate;
        this.user = user;
        this.details = details;
    }

    public Integer getId(){
        return this.id;
    }

    public void SetId(Integer id){
        this.id = id;
    }
    


    public LocalDateTime getpostDate(){
        return this.postDate;
    }

    public void SetpostDate(LocalDateTime postDate){
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