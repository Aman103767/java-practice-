package com.masai.security.security.jwt;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseCookie;

import com.masai.security.service.UserDetailsImpl;

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
	
	public ResponseCookie generateJwtCookie(UserDetailsImpl userDetails) {
		String jwt = generateTokenFromUsername(userDetails.getUsername());
		ResponseCookie.from(jwtCookie, jwt).path("/api").maxAge(24*60*60).httpOnly(true).build();
	}
	
	
	// to get username from the token
	public String getUsernameFromJwtToken(String token) {
		
		return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
		
	}
	
	
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
