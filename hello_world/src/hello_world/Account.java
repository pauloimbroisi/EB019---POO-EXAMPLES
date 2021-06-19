package hello_world;

public class Account {
	/**About the class
	 *data
	 */
	double balance;
	double limit;
	String name;
	int num_account;

	/**Do
	 * Logic
	 * Func
	 * Method
	 */

	void withdraw_money(double value) {
		balance -= value;
	}

}
