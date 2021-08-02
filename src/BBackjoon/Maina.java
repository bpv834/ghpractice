package BBackjoon;

import java.util.Scanner;

public class Maina {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ns="";
		String nss=ns.trim();
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='s')
				if(s.charAt(i+1)=='=')
					ns=s.replace('=', ' ');
			
		if(s.charAt(i)=='c')
			if(s.charAt(i+1)=='=')
				ns=s.replace('=', ' ');
			else if(s.charAt(i+1)=='-')
				ns=s.replace('-', ' ');
		if(s.charAt(i)=='d')
			if(s.charAt(i+1)=='-')
				ns=s.replace('-', ' ');
			else if(s.charAt(i+1)=='z')
				ns=s.replace('z', ' ');
		if(s.charAt(i)=='l')
			if(s.charAt(i+1)=='j')
				ns=s.replace('j', ' ');
		if(s.charAt(i)=='n')
			if(s.charAt(i+1)=='j')
				ns=s.replace('j', ' ');
		if(s.charAt(i)=='z')
			if(s.charAt(i+1)=='=')
				ns=s.replace('=', ' ');
		/*if(s.charAt(i)=='d')
			if(s.charAt(i+1)=='z')
				if(s.charAt(i+2)=='=')
					cnt--;
		*/
				
		
		}
		System.out.println(ns);
		System.out.println(nss);

	}

}
