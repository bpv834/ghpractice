package BBackjoon;

import java.util.Scanner;

public class Wording_checker {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		int cnt=0;
		
		while(n>0) {
			if(check()==true)
				cnt++;
			n--;
		}
		System.out.println(cnt);
		
		
		
	}
	
	
	
	
	
	
	
	public static boolean check() {
		
		String s=sc.next();
		int ch=0;
		int pre=0;
		boolean alp[]=new boolean[26];
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(ch!=pre) {
				if(alp[ch-'a']==false) {
				alp[ch-'a']=true;
				pre=ch;
				}
				else 
				return false;
				}
			else continue;

		}
		return true;
		
		}
}
			
		
	

		
		
					
	

				
		

