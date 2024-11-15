package project3;

import java.util.Scanner;

public class CountEmptypack {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []a=new int[n];
		int i;
		for( i=0;i<n;i++)
			a[i]=s.nextInt();
		int coun=0;
		for( i=0;i<n;i++) {
			if(a[i]!=0)
				a[coun++]=a[i];
		}
		for( i=coun;i<n;i++) {
			a[i]=0;
		}
		for(i=0;i<n;i++)
		System.out.print(a[i]+" ");
			
		

	}

}
