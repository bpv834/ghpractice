package 기본수학1;

import java.util.Scanner;

public class 달팽이_오르기 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int v=sc.nextInt();
		int c=(a-b);
		int t=v-c;
		int dap=0;
		int e=t%v;
		if(e==0) {
			dap=t/c;
		}
		if(e!=0)
			dap=(c/v)+1;
		
		
		System.out.println(e);
		System.out.println(dap);
		
			
	}

}
