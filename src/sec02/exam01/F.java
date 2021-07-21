package sec02.exam01;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("기상 시간을 입력하시오");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("예약 시간");
		//10 10 > 9  25
		//0 30  > 23 45
		//23 40 > 22 55
		
		
		if(a<1&&b>45)
			a=23;
		if(b>45)
			b=b-45;
		
		else if(b<45) { 
		a=a-1;
		b=b+15;
		
		}
		
		if(a<1)
			a=24+a;
		
		
		System.out.println(a+":"+(b));
		
		
	}

}
