package BBackjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Over_avg_balance {

	public static void main(String[] args) {
		double avg=0;
		double sum=0;
		double cnt=0;
		double bal=0.0;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
			
		}
		avg=sum/n;
		
		for(int j=0;j<n;j++) {
			if(arr[j]>avg) {
				cnt++;
			}
		}
		System.out.println(cnt+"/"+n);
		bal= cnt*100/n;
		System.out.println(bal);
		if(n==0)
			break;
		}
	}

}
