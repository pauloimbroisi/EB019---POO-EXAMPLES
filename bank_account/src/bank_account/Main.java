package bank_account;

public class Main {

	public static void main(String[] args) {
		/**Brief -> New return the adress of "x" */
		Account account = new Account(400, 1250, "KAKAROTO", 1234); //Instance
		Account account2 = new Account(1000, 2000, "Goku", 5678); //Instance

		//Account 1
		System.out.printf("\n \n Account:");
		
		System.out.printf("\n \n The balance is: $ %2f \n \n", account.getBalance());

		account.withdraw_money(150);

		System.out.printf("\n \n withdraw money: $ 150,00");

		System.out.printf("\n \n new balance is: $ %2f \n \n", account.getBalance());
		
		//Account 2
		System.out.printf("\n \n Account 2:");
		
		System.out.printf("\n \n The balance is: $ %2f \n \n", account2.getBalance());

		account2.withdraw_money(250);

		System.out.printf("\n \n withdraw money: $ 150,00");

		System.out.printf("\n \n new balance is: $ %2f \n \n", account2.getBalance());
	}
}
