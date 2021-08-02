package BBackjoon;

import java.util.Scanner;

public class Find_Out_Croatian {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int cnt=0;
		for(int i=0;i<s.length()-1;i++) {
			char ch=s.charAt(i);
			
			if(ch=='c') {
				if(s.charAt(i+1)=='=')
					i++;
				else if(s.charAt(i+1)=='-')
					i++;
				cnt++;
			}
			
			if(ch=='d') {
				if(s.charAt(i+1)=='z')
					if(s.charAt(i+2)=='=')
					i+=2;
				else if(s.charAt(i+1)=='-')
					i++;
				cnt++;
			}
				
				
			if(ch=='l') {
				if(s.charAt(i+1)=='j')
					i++;
				cnt++;}
			if(ch=='n') {
				if(s.charAt(i+1)=='j')
					i++;
				cnt++;}
			if(ch=='s') {
				if(s.charAt(i+1)=='=')
					i++;
				cnt++;}
			if(ch=='z') {
				if(s.charAt(i+1)=='=')
					i++;
				cnt++;}
			
				
			}
			
			
		System.out.println(n-cnt);
			
		}
		
		

	}
