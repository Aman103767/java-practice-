package com.masai.security.security.jwt;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

public class JwtUtils {
    
	@Value("${masai.app.jwtsecret}")
	private String jwtSecret;
	@Value("${masai.app.jwtExpirationMs}")
	private int jwtExpirationMs;
	@Value("${masai.app.jwtCookieName}")
	private String jwtCookie;
	
	// to validate JWT token
	public boolean validateJwtToken(String authToken) {
		try {
		Jwts.parser().setSigningKey(jwtSecret).parse(authToken);
		return true;
		}catch(SignatureException e) {
			System.out.println(e.getMessage());
			
		}catch(ExpiredJwtException e) {
			System.out.println(e.getMessage());
			
			
		}catch(MalformedJwtException e) {
			System.out.println(e.getMessage());
			
			
		}catch(IllegalArgumentException e ) {
			System.out.println(e.getMessage());
			
			 
		 }
		catch(UnsupportedJwtException e) {
			System.out.println(e.getMessage());
			
			
		}
		return false;
		
	}
	
	// to generate a new token by username
	public String generateTokenFromUsername(String username) {
	return Jwts.builder()
	.setSubject(username)
	.setIssuedAt(new Date())
	.setExpiration(new Date((new Date()).getTime()+ jwtExpirationMs)).signWith(SignatureAlgorithm.HS512,jwtSecret).compact();
	
	
	}
}
