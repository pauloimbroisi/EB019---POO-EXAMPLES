package bank_account;

public class Main {

	public static void main(String[] args) {
		/**Brief -> New return the adress of "x" */
		Account account = new Account();
		
		account.balance = 1000;
		
		account.withdraw_money(150);
		
		System.out.printf("\n \n withdraw money: $ 150,00");
		
		System.out.printf("\n \n new balance is: $ %2f \n \n", account.balance);
		
	}
}
