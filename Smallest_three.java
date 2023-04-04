/*Write a Java method to find the smallest number among three numbers..

*/


package Method_Assignments;

import java.util.Scanner;

public class Smallest_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		 int num1 = in.nextInt();
		 
		System.out.println("Enter Second Number:");
		 int num2 = in.nextInt();
		 
		 System.out.println("Enter Third Number:");
		 int num3 = in.nextInt();
		 
		 if(num1 < num2)
			 if(num1 < num3)
				 System.out.println("Smallest Number :" + num1 );
		 
		 if(num2 < num1)
			 if(num2 < num3)
				 System.out.println("Smallest Number :" + num2);
		 
		 if(num3 < num1)
			 if(num3 < num2)
				 System.out.println("Smallest Number :" + num3 );

	}

}
