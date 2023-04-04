//Write a Java method to compute the sum of the digits in an integer.


package Method_Assignments;

import java.util.Scanner;

public class sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner in = new Scanner(System.in);
	      System.out.print("Input an integer: ");
	      int digits = in.nextInt();
		  System.out.println("The sum is " + sumDigits(digits));
	    }

	 public static int sumDigits(long n) {
			int result = 0;
			
			while(n > 0) {
				result += n % 10;
				n /= 10;
			}
			
			return result;


	}

}
