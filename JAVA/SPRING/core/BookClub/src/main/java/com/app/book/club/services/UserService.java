package com.app.book.club.services;


import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.app.book.club.models.LoginUser;
import com.app.book.club.models.User;
import com.app.book.club.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo; 
	
	// ***** register*************************************************************************
	
	 public User register(User newUser, BindingResult result) {
		 
		Optional<User> existingUser = userRepo.findByEmail(newUser.getEmail());
		
	        
	    // Reject if email is taken (present in database)
		
		if(existingUser.isPresent()) {
			result.rejectValue("email", "Matches","this email is already used!");
		}
		
		
		// Reject if password doesn't match confirmation
		
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm","Matches", "The Confirm Password must match Password!");
		}
		
		
		// Return null if result has errors
		
		if(result.hasErrors()) {
       	return null;
       }
		
		// Hash and set password, save user to database
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
       newUser.setPassword(hashed);
       return userRepo.save(newUser);
		
	        
	    }

	// ***** End register*********************************************************************
	 
	 
	 
	 //**** Login*****************************************************************************
	 
	 public User login(LoginUser login, BindingResult result) {
	        
	    // Find user in the DB by email
	    	
		 Optional<User> existingUser = userRepo.findByEmail(login.getEmail());
	    	
	        // Reject if NOT present
		 
	    	if(!existingUser.isPresent()) {
				result.rejectValue("email", "Matches","User not found");
				return null;
				
			}
	    	
	    	
	        // Reject if BCrypt password match fails
	    	
	    	User user = existingUser.get();
	    	if(!BCrypt.checkpw(login.getPassword(), user.getPassword())) {
	    	    result.rejectValue("password", "Matches", "Invalid Password!");
	    	    return null;
	    	   
	    	}
	    	
	        // Return null if result has errors
	    	
	    	if(result.hasErrors()) {
         	return null;
         }
	    
	        // Otherwise, return the user object
	    	return user;
	    	
	       
	    }
	 
		public User findById(Long userId) {
			Optional<User> user = userRepo.findById(userId);
			if(user.isPresent()) {
				return user.get();
			}
			
			return null;
		}
	

	 
	 
}
