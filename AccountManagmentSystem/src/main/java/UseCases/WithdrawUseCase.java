package UseCases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;

public class WithdrawUseCase {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the amount");
	int amount = input.nextInt();
	System.out.println("Enter the account id ");
	int id = input.nextInt();
	AccountDao ad = new AccountDaoImpl();
	System.out.println(ad.withdraw(amount, id));
	

}
}
