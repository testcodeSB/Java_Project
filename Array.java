package project3;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter array length:");
		int x=s.nextInt();
		System.out.println();
		int []a=new int[x];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.println("sum of array:"+sum);
		
		
		

	}

}
