package com.masai.dao;

import com.masai.Bean.Account;


public interface AccountDao {
	Account findById(int id);
	String save(Account account);
	String update(Account account);
	String remove(int id);
	String withdraw(double amount,int accountId);
	String deposit(double amount,int accountId);

}
