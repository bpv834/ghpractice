package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 수_정렬 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int min=1000;
		int tp=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			tp=arr[i];
			for(int j=i;j<n;j++) {
				if(arr[j]<min)
					min=arr[j];
				
			}
			arr[i]=min;
			
			for(int x=i;x<n;x++) {
				if(i!=x)
				if(arr[x]==min)
					arr[x]=tp;
			}
					min=1000;
			
		}
		
		for(int i=0;i<n;i++)
		System.out.println(arr[i]);
		
		
			}
	}
	
	


