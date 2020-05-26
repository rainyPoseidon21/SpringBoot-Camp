package com.example.demo.user;
import java.util.*;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String>{

    //findBy<Classname>Id
    public List<User> findByLocationId(String locationId);
    
    public List<User> findByFirstName(String firstName);
}