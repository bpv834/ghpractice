package BBackjoon;

import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= new int[9];
		int max=0;
		int ind=0;
		for(int i=0;i<9;i++) {
			 arr[i]=sc.nextInt();
			 if(arr[i]>max)
				 max=arr[i];
			 
		}
			System.out.println(max);
			for(int c=0;c<9;c++) {
				if(arr[c]==max) {
					ind=c+1;
				}
					
			}
			System.out.println(ind);
		
	}

}
