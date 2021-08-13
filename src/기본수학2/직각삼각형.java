package 기본수학2;

import java.util.Scanner;

public class 직각삼각형 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(x!=0&&y!=0&&z!=0)
		if(x*x+y*y==z*z)
			System.out.println("right");
		else
			System.out.println("worng");
		
		if(x==0&&y==0&&z==0)
			System.out.println();
			break;
		
		}
	}

}
