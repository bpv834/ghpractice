package sec02.exam01;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		while(true) {
		
		
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("종료를 원하면 0을 아니면 점수를 입력하시오");
		int score = scan.nextInt();
		
		if(score>=90&&score<=100)//90<=score<=100 
			System.out.println("A");	
		
		else if(score>=80&&score<=89)
		System.out.println("B");	
		else if(score>=70&&score<=79)
		System.out.println("C");	
		
		else if(score>=60&&score<=69)
		System.out.println("D");
		
		else
			System.out.println("F");
		if(score==0)
			break;
		}
		System.out.println("종료합니다.");
		break;
		}
	}

}
