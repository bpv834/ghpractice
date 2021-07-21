package BBackjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		int max=-1000000;
		int min=1000000;
		
		for(int z=0; z<5;z++)
			arr[z]=sc.nextInt();
		
		for (int i=0; i<5;i++) {
			if(arr[i] >max)
				max=arr[i];
		}
		for (int x=0; x<5;x++) {
			if(arr[x] <min)
				min=arr[x];
		}
		System.out.println(min+" "+max);
		
		

	}

}
