/*Write a java method to create the area of pentagon*/


package Method_Assignments;

import java.util.Scanner;

public class area_pentagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter perimeter of pentagon:");
		int num1 = in.nextInt();
		
		System.out.println("Enter apothem of pentagon:");
		int num2 = in.nextInt();
		
		int area = (num1 * num2)/2;
		
		System.out.println("Area of Pentagon is:" +area );
		

	}

}
