package com.example.demo.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.Auditable;
import com.example.demo.location.*;

@Entity
public class User extends Auditable<String>{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name="locationid",insertable = false, updatable=false)
    private Location location;

    private Integer locationid;


    private String email;

    public Integer getLocationid(){
        return locationid;
    }

    public void setLocationid(Integer locationid){
        this.locationid = locationid;
    }

    public User(){

    }

    public User(final Integer id,final String firstName,final String lastName,final Location location,final String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.email = email;
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(final Integer id){
        this.id = id;
    }

    public String getfirstName(){
        return this.firstName;
    }

    public void setfirstName(final String firstName){
        this.firstName = firstName;
    }

    public String getlastName(){
        return this.lastName;
    }

    public void setlastName(final String lastName){
        this.lastName = lastName;
    }

    public Location getlocation(){
        return this.location;
    }

    public void setlocation(final Location location){
        this.location = location;
    }

    public String getemail(){
        return this.email;
    }

    public void setemail(final String email){
        this.email = email;
    }
}