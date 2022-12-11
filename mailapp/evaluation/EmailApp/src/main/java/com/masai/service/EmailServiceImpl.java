package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.EmailException;
import com.masai.models.Email;
import com.masai.models.EmailDto;
import com.masai.models.User;
import com.masai.repository.EmailDao;
import com.masai.repository.UserDao;
@Service
public class EmailServiceImpl implements EmailService{
	@Autowired
	private EmailDao emailDao;
	@Autowired
	private UserDao  userDao;

	@Override
	public Email sendEmail(String Email, EmailDto emailDto) throws EmailException {
		// TODO Auto-generated method stub
		User u = userDao.findByEmail(Email);
		User sendtoUser  = userDao.findByEmail(emailDto.getRecipients());
		if(u != null && sendtoUser != null) {
		Email emails = new Email();
		emails.setRecipients(Email);
		emails.setSubject(emailDto.getSubject());
		emails.setBody(emailDto.getBody());
		emails.setStatus("Send");
		emails.setUser(u);
		u.getEmails().add(emails);
		Email saved = emailDao.save(emails);
		if(saved != null) {
			Email emailr = new Email();
			emailr.setRecipients(Email);
			emailr.setSubject(emailDto.getSubject());
			emailr.setBody(emailDto.getBody());
			emailr.setStatus("Receiver");
			emailr.setUser(sendtoUser);
			sendtoUser.getEmails().add(emailr);
			emailDao.save(emailr);
		}
		return emails;
		
	}
	throw new EmailException("Please enter the valid email");
	
}

	@Override
	public String starred(Integer emailId) throws EmailException {
		// TODO Auto-generated method stub
		Email email = emailDao.findById(emailId).get();
		if(email != null) {
			email.setStar(true);
			User user = email.getUser();
			List<Email> emails = user.getEmails();
			for(int i=0;i<emails.size();i++) {
				if(emailId == emails.get(i).getEmailId()) {
					emails.get(i).setStar(true);
				  userDao.save(user);
				  break;
					
				}
			}
			return "Your Email is starred";
		}
		throw new EmailException("Email not found with id : "+ emailId);
	}

	@Override
	public String deleteEmail(Integer emailId) throws EmailException {
		// TODO Auto-generated method stub
		Email email = emailDao.findById(emailId).get();
		if(email != null) {
			emailDao.delete(email);
			return "User is deleted Successfully";
		}
		throw new EmailException("Email not found");
		
	}
	
	
	
}
