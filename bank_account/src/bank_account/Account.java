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

	public Account(double balance, double limit, String name, int num_account) {
		//test -> System.out.println("I exist and I am called");
		// "this" is used to identify the variable. Internal reference.
		this.balance = balance;
		this.limit = limit;
		this.name = name;
		this.num_account = num_account;
	}

	/**Do
	 * Logic
	 * Func
	 * Method
	 */

	
	public void withdraw_money(double value) {
		balance -= value;
	}
	
	/******************************************************************************
    public func.
	 ******************************************************************************/
	
	/******************************************************************************
    Getter func.
	 ******************************************************************************/

	// Write -> get+space
	public double getBalance() {
		return balance;
	}

	public double getLimit() {
		return limit;
	}

	public String getName() {
		return name;
	}

	public int getNum_account() {
		return num_account;
	}
	
}
