package BBackjoon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("과목수를 입력해라");
		int n=sc.nextInt();
		double arr[]=new double[n];
		int arr1[]=new int[3];
		int max=0;
		
		System.out.println("점수들을 입력해라");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
			
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		for(int z=0;z<arr.length;z++) {
			arr[z]=arr[z]/max;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
