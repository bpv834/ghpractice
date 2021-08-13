package 기본수학2;

import java.util.Scanner;

public class 택시기하학 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int r1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int r2=sc.nextInt();
		int a1=0;
		int b1=0;
		int c1=0;
		int a2=0;
		int b2=0;
		int c2=0;
		if(r1>r2) {
			a2=x1;
			b2=y1;
			c2=r1;
			a1=x2;
			b1=y2;
			c1=r2;	
		}
		else {
			a2=x2;
			b2=y2;
			c2=r2;
			a1=x1;
			b1=y1;
			c1=r1;	
		}
		int d=(a2-a1)*(a2-a1)+(b2-b1)*(b2-b1);
		double D=Math.sqrt(d);
		if(D>c2) {//큰원 밖 다른원
			if(c1+c2>D)
				System.out.println(2);
			else if(c1+c2==D)
				System.out.println(1);
			else
				System.out.println(0);
		}
		else {//큰원 안 다른원
			if(a1==a2&&b1==b2) {
				if(c1==c2)
				System.out.println(-1);
				else 
				System.out.println(0);
			}
			else {
				if(c2<D+c1)
					System.out.println(2);
				else if(c2==D+c1)
					System.out.println(1);
				else if(c2>D+c1)
					System.out.println(0);
			}
			
		}
		}
		
		

	}

}
