package 기본수학1;

import java.util.Scanner;

public class 소수찾기 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int num=sc.nextInt();
		for(int x=0;x<num;x++) {
		int n=sc.nextInt();
		
		boolean p=true;
		if(n!=2&&n!=1)
		for(int i=2;i<n-1;i++) {
			if(n%i==0)
				p=false;
			
			}
		else if(n==2)
			p=true;
		else
			p=false;
		
		if(p==true)
			cnt++;
		}
		System.out.println(cnt);
		
		
	}
	
	}
	

		
	

