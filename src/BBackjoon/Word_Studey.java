package BBackjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Word_Studey {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s=s.toUpperCase();
		char a='?';
		char b='?';
		int num=0;//,
		int cnt=1;//2,2
		int max=1;//2,2
		//cnt1[]  //2,  ,2
		int cnt1[]=new int[s.length()];
		
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j))
				cnt++;
				
				if(cnt>1&&cnt==max) 
					max=cnt;
				a=s.charAt(i);
				
						}
			cnt=1;
			
		}
		System.out.println(s);
		System.out.println(max);
		System.out.println(a);

	}
}
			
		
		
		
