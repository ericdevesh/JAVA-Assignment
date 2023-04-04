//Write a program in Java to display the cube of the number upto given an integer.


package Conditional_statements;

import java.util.Scanner;

public class cube_n_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;

	    System.out.print("Input number of terms : ");
	    Scanner in = new Scanner(System.in);
			    n = in.nextInt();

	     for(i=1;i<=n;i++)
	     {
	     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
	    }


	}

}
