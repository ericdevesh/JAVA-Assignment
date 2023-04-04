//WAP to check whether the given number is prime or not


package mypackage;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		if(prime(n))
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	static boolean prime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;

	}

}
