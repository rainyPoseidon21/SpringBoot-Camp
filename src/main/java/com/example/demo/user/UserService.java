package com.example.demo.user;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired  
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);
        return users;
    }

    public Optional<User> getUserById(String id){

        return userRepository.findById(id);
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    
    public void updateUser(User user, String id){
        userRepository.save(user);
    }    

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }

	public List<User> getUserByLocationId(String id) {
		return userRepository.findByLocationId(id);
	}

	public List<User> getUsersByFirstName(String firstName) {
		return userRepository.findByFirstName(firstName);
	}

    
}