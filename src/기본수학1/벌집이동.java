package 기본수학1;

import java.util.Arrays;
import java.util.Scanner;

public class 벌집이동 {

	public static void main(String[] args) {
		int cnt=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=0;
		int arr[]=new int[10];
		arr[0]=1;
		for(int i=1;i<10;i++) {
			arr[i]=arr[i-1]+(6*i);
			
			if(n<=arr[i]&&n>arr[i-1]) {
				num=i;
			}
				
		}
	System.out.println(Arrays.toString(arr));
		System.out.println(num+1);
		

	}

}
