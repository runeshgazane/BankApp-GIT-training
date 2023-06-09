package code;

public class Bankaccnt {
	private int accno;
	private String name;
	private double balance;
	private String email;

	public Bankaccnt()
	{
		accno = 1;
		name = "Default";
		balance = 0.0;
		email = "Default";
	}
	
	public Bankaccnt(int actnum, String nm, double bal, String eid)
	{
		accno = actnum;
		name = nm;
		balance = bal;
		email = eid;
	}
	
	public void display()
	{
		System.out.println("Account no. "+accno);
		System.out.println("Name : "+name);
		System.out.println("Balance = "+balance);
		System.out.println("Email ID : "+email);
	}
	
	public void deposit(double amount) 
	{
		System.out.println("Before deposit : Balance = "+balance);
		balance = balance+amount;
		System.out.println("After deposit : Balance = "+balance);
	}
	
	public void withdraw(double amount) 
	{	
		System.out.println("Before withdrawal : Balance = "+balance);
		if(amount<balance)
		{
			balance = balance-amount;
			System.out.println("After withdrawal : Balance = "+balance);
		}
		else
			System.out.println("Insufficient balance");
	}
	
	public void balance() 
	{
		System.out.println("Balance = "+balance);
	}
	
	public int search(Bankaccnt[] ba, int acn)
	{
		for(int i=0; i<ba.length; i++)
		{
			if(ba[i].accno==acn)
				return i;
		}
		System.out.println("Account not found");
		return ba.length;
	}
}
