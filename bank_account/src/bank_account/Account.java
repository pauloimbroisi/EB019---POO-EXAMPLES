package bank_account;

public class Account {
	
	/**Public members can be accessed from the child class of 
	 * the same package. Private members cannot be accessed 
	 * from the child class of the same package. Public member 
	 * can be accessed from non-child class of same package. 
	 * Private members cannot be accessed from non-child class of same package.
	 */
	
	/**About the class
	 *data
	 */
	private double balance;
	private double limit;
	private String name;
	private int num_account;
	
	/**The constructor is invoked implicitly.
	 * The Java compiler provides a default constructor 
	 * if you don't have any constructor in a class. 
	 * The method is not provided by the compiler in any case. 
	 * The constructor name must be same as the class name.
	 */
	
	public Account() {
	//test -> System.out.println("I exist and I am called");
		balance = 1000;
		limit = 1200;
		name = "User";
		num_account = 1234;
	}

	/**Do
	 * Logic
	 * Func
	 * Method
	 */
	
/******************************************************************************
    public func.
 ******************************************************************************/
	public void withdraw_money(double value) {
		balance -= value;
	}
	public double get_balance() {
		return balance;
	}
}
