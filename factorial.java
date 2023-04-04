//WAP to find factorial of a given number


package mypackage;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int f=1;
		for(int i=n;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println("Factorial:"+f);

	}

}
