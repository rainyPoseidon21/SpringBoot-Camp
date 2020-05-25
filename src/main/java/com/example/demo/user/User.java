package com.example.demo.user;

import com.example.demo.location.*;

public class User {
    
    private String id;
    private String firstName;
    private String lastName;
    private Location location;
    private String email;

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