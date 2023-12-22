
public class Testapp {
	
	public static void main(String args[])
	{
	SavingAccount s = new SavingAccount ();
	s.acct_num = "0111111";
	s.acct_title = "MyAcctTitle";
	s.acct_bal = 10000.0;
	s.withdraw (2000.0);
	System.out.println ("Balance="+s.acct_bal);
	}
}


