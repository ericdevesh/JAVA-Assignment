//WAP to find sum of given array elements



package mypackage;

import java.util.Scanner;

public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] n=new int[5];
		int sum=0;
		System.out.println("Enter 5 value:");
		for(int i=0;i<n.length;i++)
		{
			n[i]=sc.nextInt();
			sum=sum+n[i];
		}
		System.out.println("Sum:"+sum);

	}

}
