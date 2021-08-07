package 기본수학1;

import java.util.Scanner;

public class 설탕배달 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0;
		int y=0;
		if(n>13) {
		for(int i=0;i<n;i++)
			for(int j=1;j<n;j++) {
				
					if(5*j+3*i==n) {
						x=i;
						y=j;
					}
				}
		}
		
		else {
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++) {
					
						if(5*j+3*i==n) {
							x=i;
							y=j;
						}
					}
			
		}
		if(x+y==0)
			System.out.println(-1);
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
	}
	
}
		
		
				
		
	
		
	

	

