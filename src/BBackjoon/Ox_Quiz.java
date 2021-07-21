package BBackjoon;

import java.util.Scanner;

public class Ox_Quiz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int sum=0;
		
		System.out.println("테스트 개수");
		int n=sc.nextInt();
		for(int i=0; i<n;i++) {
			String str=sc.next();
		
		for(int j=0;j<str.length();j++) {
			if(str.charAt(j)=='O') {
				cnt++;
				sum+=cnt;
				}
			else {
				cnt=0;
			}
		}
					
		}
		
		System.out.println(sum);

	}

}
