package project3;

import java.util.Scanner;

public class IntegralDifference {
	public static int differenceOf(int n,int m) {
		int sum1=0,sum2=0;
		for(int i=1;i<=m;i++) {
			if(i%n==0)
				sum1=sum1+i;
			else
				sum2=sum2+i;
		}
		return Math.abs(sum1-sum2);
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		System.out.println(differenceOf(n,m));

	}

}
