package 기본수학2;

import java.util.Scanner;

public class 소인수분해 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		while(n!=0) {
		
			if(n==1) {
				System.out.println(-1);
				break;
			}
			else if(n>=2)
				if(n%i==0) {
					System.out.println(i);
					n=n/i;
				}
				else i++;
			if(n==1)
				break;
			
		}
		
		

	}

}
