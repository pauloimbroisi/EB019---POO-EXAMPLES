package bank_account;

public class Main {

	public static void main(String[] args) {
		/**Brief -> New return the adress of "x" */
		Account account = new Account();
		
		System.out.printf("\n \n The balance is: $ %2f \n \n", account.get_balance());
		
		account.withdraw_money(150);
		
		System.out.printf("\n \n withdraw money: $ 150,00");
		
		System.out.printf("\n \n new balance is: $ %2f \n \n", account.get_balance());
		
	}
}
