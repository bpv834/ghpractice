package BBackjoon;

import java.util.Scanner;

public class Wording_checker {
/*for(int j=s.length()-1;j>l;j--)
				if(s.charAt(i)==s.charAt(j))*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l=(s.length()-1);
		int cnt=0;
		int count=0;
		
		for(int i=0; i<=l-1;i++)
			for(int j=1; j<=l; j++) {
				if(s.charAt(i)!=s.charAt(j)) {
					cnt++;
					if(cnt==(l-i))
						count++;
					cnt=0;
					
						
					}
					
				
				}
		System.out.println(count);}
	

}

	

		
		
					
	

				
		

