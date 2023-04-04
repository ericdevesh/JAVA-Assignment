//WAP to check whether the given number is Even or Odd


package mypackage;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		sc.close();

	}

}
