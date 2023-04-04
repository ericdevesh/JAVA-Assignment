/*WAP to accept the current balance and display the following options/menu

1.Deposit
2.Withdraw
3.Display Balance
4.Exit

The menu should display repeatedly until the user chooses Exit*/


package mypackage;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int bal,amt,ch;
		System.out.println("Enter Current balance:");
		bal=sc.nextInt();
		do
		{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display Balance");
			System.out.println("4.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter the amount to deposit:");
					amt=sc.nextInt();
					bal=bal+amt;
					break;
			case 2:System.out.println("Enter amount to withdraw:");
					amt=sc.nextInt();
					if(amt>bal)
						System.out.println("Insufficient Balance");
					else
						bal=bal-amt;
					break;
			case 3:
				System.out.println("Current Balance:"+bal);
				break;
			case 4:
				System.out.println("Thank you for banking with us");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}while(ch!=4);
		sc.close();

	}

}
