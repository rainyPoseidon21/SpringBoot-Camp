package com.example.demo.location;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
    
    @Id
    private String id;
    private String name;

    //default constructor for JPA repo.
    public Location(){

    }

    public Location(String id,String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getname(){
        return this.name;
    }

    public void setname(String name){
        this.name = name;
    }
}