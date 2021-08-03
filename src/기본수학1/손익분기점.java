package 기본수학1;

import java.util.Scanner;

public class 손익분기점 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=0;
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		x=arr[0]/(arr[2]-arr[1]);
		x++;
		if(arr[2]>arr[1]) {
		
		System.out.println(x);
		}
		
		else  {
			System.out.println("-1");
		}
		}

	}


