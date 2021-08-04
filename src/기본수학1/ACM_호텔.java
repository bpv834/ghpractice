package 기본수학1;

import java.util.Scanner;

public class ACM_호텔 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	
	int num=sc.nextInt();
	for(int i=0;i<num;num++) {
		int h=sc.nextInt();//층 수
		int w=sc.nextInt();//방 개수
		int n=sc.nextInt();//몇번째 손놈
	int cnt=1;
	int knt=0;
	int k=0;
	int t=0;
	
	if(n<=h) {
	System.out.println(1+"0"+n);
	
	}
	else {
	while(n>h) {
		if(w*h<n)
			break;
	n=n-h;
	cnt++;
	
	}
	
	System.out.println(n+"0"+cnt);
	
	}
	
	}
	}
}

	


