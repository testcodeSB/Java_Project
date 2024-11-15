package project3;

import java.util.Scanner;

public class sortedArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int C0=0,C1=1,C2=2;
		for(int i=0;i<n;i++) {
			if(arr[i]==0)
				C0++;
			else if(arr[i]==1)
				C1++;
			else if(arr[i]==2)
				C2++;
		}
		int j=0;
		while(C0>0) {
			arr[j++]=0;
			C0--;
		}
		while(C1>0) {
			arr[j++]=1;
			C1--;
		}
		while(C2>0) {
			arr[j++]=2;
			C2--;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
			
		

	}

}
