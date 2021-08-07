package 기본수학1;

import java.math.BigInteger;
import java.util.Scanner;

public class 큰수더하기 {
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	BigInteger a=sc.nextBigInteger();
	BigInteger b=sc.nextBigInteger();
	
	System.out.println(a.add(b));

	}

}
