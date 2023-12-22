public class Account
{
public String acct_num;
public String acct_title;
public double acct_bal;
public Account(){
}
public void withdraw (double amt)
{
if (acct_bal > amt)
acct_bal -= amt;

}
public void deposit (double amt)
{
acct_bal += amt;
}
}





