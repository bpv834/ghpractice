package 기본수학2;

import java.util.Arrays;
import java.util.Scanner;

public class 베르트와_공준 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int x=0;x<num;x++) {
		int n=sc.nextInt();
	    boolean pn[]=new boolean[2*n+1];
	    
	    for(int i=0;i<=2*n;i++)
	    	pn[i]=true;
	    int min=10;
		for(int i=2;i*i<=2*n;i++) {
			for(int j=i*i;j<=2*n;j+=i) {
				pn[0]=pn[1]=false;
				pn[j]=false;
				
			}
			
		}
	for(int i=0;i<=2*n;i++)
		for(int j=2*n;j>=0;j--) {
			if(pn[i]==true) {
				if(pn[j]==true) {
					if(j+i==n) {
					if(j>=i) {
						if(j-i<min) {
							min=j-i;
						}
					}	
					}
				}
			}
		}
	for(int i=0;i<=2*n;i++)
		for(int j=0;j<=2*n;j++) {
			if(pn[i]==true&&pn[j]==true)
				if(i+j==n)
				if(j-i==min)
					System.out.println(i+" "+ j);
		}
		}
	}
}
		
			

	
