package project3;

import java.util.Scanner;

public class lenghtdiff {
	public static int findCount(int n,int arr[],int num,int dif)
	{
		int count=0;
		for(int i=0; i<n;i++)
		{
			if(Math.abs(num-arr[i])<=dif)
				count++;
		}
		return (count > 0) ? count : -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=sc.nextInt();
		int dif=sc.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(findCount(n,arr,num,dif));
		sc.close();

		}

}
