package 브루트_포스;

import java.util.Arrays;
import java.util.Scanner;

public class 덩치 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//사람수
		int arr[][]=new int[n][2];
		
		for(int i=0;i<n;i++)
		for(int j=0;j<2;j++) {
			arr[i][j]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int rank=1;
			for(int j=0;j<n-1;j++) {
				if(i!=j)
				if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1])
					rank++;
			}
			System.out.println(rank);
			}
		
		
	}

}
