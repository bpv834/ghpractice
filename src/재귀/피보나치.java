package 재귀;

import java.util.Scanner;

public class 피보나치 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(fb(10));

	}
	
	static int fb(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fb(n-2)+fb(n-1);
	}

}
