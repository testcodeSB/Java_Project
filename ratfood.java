package project3;

import java.util.Scanner;

public class ratfood {
	public static int Result(int rat,int unit,int arr[],int n) {
		if(arr==null)
			return -1;
		int sum=0;
		int count=0;
		int r=rat*unit;
		for(int j=0;j<n;j++) {
			sum=sum+arr[j];
			count++;
			if(sum>=r)
				break;
			
		}
		if(sum<=r)
			return 0;
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a rat:");
		int rat=sc.nextInt();
		System.out.println("enter a food unit:");
		int unit=sc.nextInt();
		System.out.println("enter a arrno.");
		int n=sc.nextInt();
		System.out.println("enter all the arrays");
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++) {
		   arr[i]=sc.nextInt();
		}
		System.out.println(Result(rat,unit,arr,n));

	}

}
