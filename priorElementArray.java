package project3;

import java.util.Scanner;

public class priorElementArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int [] a=new int[N];
		for(int i=0;i<N;i++)
		{
			a[i]=s.nextInt();
		}
		int count=1;
		for(int i=1;i<N;i++)
		{
			if(a[0]<a[i]) {
				count++;
			}
		}
		System.out.println(count);

	}

}
