package 기본수학2;

import java.util.Arrays;
import java.util.Scanner;

public class 소수 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int min=n;
		int sum=0;
		boolean p=true;
	
		
		for(int i=m;i<=n;i++) {
			p=true;
			for(int j=2;j<i;j++) {
				
				if(i%j==0)
					p=false;
				
				
					
			}
			if(p==true)
				sum+=i;
			p=false;
				
		}
		System.out.println(sum);
		
			

	}
	

}
