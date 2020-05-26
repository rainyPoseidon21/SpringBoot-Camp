package com.example.demo.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.location.*;

@Entity
public class User {
    
    @Id
    private String id;
    private String firstName;
    private String lastName;
    @ManyToOne
    private Location location;
    private String email;


    public User(){

    }

    public User(String id,String firstName,String lastName,Location location,String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.email = email;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getfirstName(){
        return this.firstName;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

    public String getlastName(){
        return this.lastName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public Location getlocation(){
        return this.location;
    }

    public void setlocation(Location location){
        this.location = location;
    }

    public String getemail(){
        return this.email;
    }

    public void setemail(String email){
        this.email = email;
    }
}