package test;
import java.util.Scanner;

import code.Bankaccnt;

public class TestBA {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of customers : ");
		int size = sc.nextInt();
		int ch, amt, res;
		Bankaccnt[] ba=new Bankaccnt[size];

		for(int i=0; i<ba.length; i++)
		{
			System.out.println("Enter account no, name, balance and email : ");
			ba[i]=new Bankaccnt(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next());
		}
		
		System.out.println("Account details-");
		for(int i=0; i<ba.length; i++)
			ba[i].display();
		
		Bankaccnt ba2=new Bankaccnt();
		System.out.println("Enter your account no : ");
		res = ba2.search(ba, sc.nextInt());
		
		
		if(res<ba.length)
		{
			do 
			{
				System.out.println("0.Exit 1.Deposit 2.Withdraw 3.Check Balance");
				System.out.println("Enter Your Choice");
				ch = sc.nextInt();
				switch(ch) 
				{
				case 1:
					System.out.println("Enter Amount to deposit : ");
					ba[res].deposit(sc.nextInt());
					break;
					
				case 2:
					System.out.println("Enter Amount to withdraw : ");
					ba[res].withdraw(sc.nextInt());
					break;
					
				case 3:
					ba[res].balance();
					break;
					
				}
			}while(ch!=0);
			
			System.out.println("Thankyou for visiting");
		}
	}
}
