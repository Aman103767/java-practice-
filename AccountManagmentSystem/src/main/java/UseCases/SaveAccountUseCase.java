package UseCases;

import java.util.Scanner;

import com.masai.Bean.Account;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;

public class SaveAccountUseCase {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	  System.out.println("Enter the id ");
	  int id =input.nextInt();
	  System.out.println("Enter the email");
	  String email = input.next();
	  System.out.println("Enter the address");
	  String address = input.next();
	  System.out.println("Enter the balance");
	  double balance = input.nextDouble();
	  
	  Account a23 = new Account(id, email, address, balance);
	  AccountDao ad = new AccountDaoImpl();
	  System.out.println(ad.save(a23));
}
}
