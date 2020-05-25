package com.example.demo.location;

public class Location {
    

    private String id;
    private String name;

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