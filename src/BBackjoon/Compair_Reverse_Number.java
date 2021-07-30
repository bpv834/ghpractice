package BBackjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Compair_Reverse_Number {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	StringTokenizer tk= new StringTokenizer(s1," ");
	String s2=tk.nextToken();
	String rs2="";
	String s3=tk.nextToken();
	String rs3="";
	for(int i=s2.length()-1;i>=0;i--) {
		rs2=rs2+s2.charAt(i);
		rs3=rs3+s3.charAt(i);
	}
	
	int n1=Integer.parseInt(rs2);
	int n2=Integer.parseInt(rs3);
	
	if(n1>n2) {
		System.out.println(n1);
		
	}
	else
		System.out.println(n2);
	}

}
