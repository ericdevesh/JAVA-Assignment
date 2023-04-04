//Write Java methods to calculate the area of a triangle.

package Method_Assignments;

import java.util.Scanner;

public class area_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter base of triangle:");
		 int num1 = in.nextInt();
		 
		 System.out.println("Enter height of Tringle:");
		 int num2 = in.nextInt();
		 
		 int area = (num1 * num2)/2;
		 
		 System.out.println("Area of Triangle is:" + area);
		 
		 
		

	}

}
