
public class SavingAccount extends Account {

	public SavingAccount () {
	}
	public void withdraw (double amt)
	{
	if (acct_bal > amt)
	acct_bal -= amt;
	if (acct_bal < 10000)
	acct_bal -= 250;
	}
	public double calculateProfit ()
	{
	double profit = acct_bal * 0.075;
	acct_bal += profit;
	return profit;
	}
	
}
