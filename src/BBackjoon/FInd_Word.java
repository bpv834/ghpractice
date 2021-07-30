package BBackjoon;

import java.util.Arrays;
import java.util.Scanner;

public class FInd_Word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int cnt=1;
		int ct=0;
		int num=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {	
				cnt++;
		  }
		
	   }
           if(s.charAt(0)==' ') {
        		   ct++;
           }
           if(s.charAt(s.length()-1)==' ') {
        	   ct++;
	}
      
           num=cnt-ct;
		
		System.out.println(cnt);
		System.out.println(ct);
		System.out.println("´Ü¾î¼ö"+num);
		
	}

}
