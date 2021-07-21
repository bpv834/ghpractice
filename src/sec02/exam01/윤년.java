package sec02.exam01;

public class 윤년 {

	public static void main(String[] args) {
		int x;
		x=1500;
		if(x%400==0) {
			if(x%4==0)
				System.out.println("윤년이다");
			else 
				System.out.println("아니다");
		}
			else 
			System.out.println("아냐");

	}
	}
