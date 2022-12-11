package com.masai.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.UserException;
import com.masai.models.CurrentUserSession;
import com.masai.models.Email;
import com.masai.models.User;
import com.masai.models.UserDto;
import com.masai.repository.SessionDao;
import com.masai.repository.UserDao;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
	private UserDao userDao;
    @Autowired
    private SessionDao sDao;
	
	@Override
	public User createUser(UserDto user) {
		// TODO Auto-generated method stub
		User u = new User();
		u.setEmail(user.getEmail());
		u.setFistName(user.getFistName());
		u.setLastName(user.getLastName());
		u.setMobileNumber(user.getMobileNumber());
		u.setPassword(user.getPassword());
		LocalDate localDate = LocalDate.parse(user.getDateOfBirth());
		u.setDateOfBirth(localDate);
		userDao.save(u);
		return u;
	}

	@Override
	public User updateUser(UserDto user,String key) throws UserException {
		CurrentUserSession loggedInUser= sDao.findByUuid(key);
		
		if(loggedInUser == null) {
			throw new UserException("Please provide a valid key to update a customer");
		}
		
	
		
		if(user.getEmail().equals(loggedInUser.getEmail())) {
		
		
	User u  = 	userDao.findByEmail(user.getEmail());
	if(u!= null) {
		u.setEmail(user.getEmail());
		u.setFistName(user.getFistName());
		u.setLastName(user.getLastName());
		u.setMobileNumber(user.getMobileNumber());
		u.setPassword(user.getPassword());
		LocalDate localDate = LocalDate.parse(user.getDateOfBirth());
		u.setDateOfBirth(localDate);
		userDao.save(u);
		return u;
		
	}else {
		throw new UserException("user not found with email :"+ user.getEmail());

	}
		}else {
			throw new UserException("Invalid User Details, please login first");
		}
    	}

	@Override
	public List<Email> getAllMails(String email,String key) throws UserException {
		
      CurrentUserSession loggedInUser= sDao.findByUuid(key);
		
		if(loggedInUser == null) {
			throw new UserException("Please provide a valid key to update a customer");
		}
		
	
		
		if(email.equals(loggedInUser.getEmail())) {
		// TODO Auto-generated method stub
		User u  = 	userDao.findByEmail(email);
		if(u!= null) {
			return u.getEmails();
		}else
	  throw new UserException("email is not registered");
		
		}else throw new UserException("Invalid User Details, please login first");
	}

	@Override
	public List<Email> getAllStarredMails(String email,String key) throws UserException {
		// TODO Auto-generated method stub
		  CurrentUserSession loggedInUser= sDao.findByUuid(key);
			
			if(loggedInUser == null) {
				throw new UserException("Please provide a valid key to update a customer");
			}
			
		
			
			if(email.equals(loggedInUser.getEmail())) {
		
		User u  = 	userDao.findByEmail(email);
		if(u!= null) {
			List<Email> emails = new ArrayList<>();
			List<Email> e = u.getEmails();
		    for(int i =0;i<e.size();i++) {
		    	if(e.get(i).isStar()) {
		    		emails.add(e.get(i));
		    	}
		    }
		    if(emails.size() == 0) {
		    	throw new UserException("email not found");
		    }
		    return emails;
		}else
	  throw new UserException("email is not registered");
			}else {
				throw new UserException("Invalid User Details, please login first");
			}
	}


	
	
	
	

}
