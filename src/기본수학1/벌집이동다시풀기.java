package 기본수학1;

import java.util.Scanner;

public class 벌집이동다시풀기 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=1;
		int n=sc.nextInt();
		int cnt=1;
		int ct=0;
		
		while(n<num) {
			num=num+6*cnt;
			if(n>num) {
				cnt++;
			ct++;
			
				System.out.println(ct);
		}
		}
	}
	}

}
