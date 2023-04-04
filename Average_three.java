//Write a Java method to compute the average of three numbers.


package Method_Assignments;

import java.util.Scanner;

public class Average_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int num1 = in.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2 = in.nextInt();
		
		System.out.println("Enter Third Number:");
		int num3 = in.nextInt();
		
		int sum = num1 + num2 + num3;
		
		int Average = sum/3;
		
		System.out.println("Average of Three Number is :" + Average);
	}

}
