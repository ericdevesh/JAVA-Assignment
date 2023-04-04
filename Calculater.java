/*WAP to accept two numbers and display the following options/menu

1.Add
2.Subtract
3.Multiply
4.Divide
*/


package mypackage;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int res=0;
		System.out.println("Enter two numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: res=n1+n2;break;
		case 2: res=n1-n2;break;
		case 3: res=n1*n2;break;
		case 4: res=n1/n2;break;
		default:System.out.println("Invalid Choice");System.exit(1);
		}
		System.out.println("Result:"+res);
	}

}
