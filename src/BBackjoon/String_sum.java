package BBackjoon;

import java.util.Arrays;
import java.util.Scanner;

public class String_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String st[]=new String[n];
		
		int sum=0;
		for(int i=0;i<st.length;i++) {
			String a=sc.next();
			st[i]=a;
			int x=Integer.parseInt(st[i]);
			sum+=x;
			
			
			
		}
		System.out.println(sum);
		
	}
}
		
		

