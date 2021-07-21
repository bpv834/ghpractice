package sec02.arr;

import java.util.Arrays;
import java.util.Scanner;

public class 백준1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("입력받을 정수의 개수를 입력하시오");
		int a= sc.nextInt();
		int arr[]=new int[a];
		int min=10000;
		int max=-10000;
	System.out.println("정수 n개를 입력하시오");
	
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		};
		for(int z=0;z<arr.length;z++) {
			if(arr[z]<min) {
				min=arr[z];
			}
			
		}
		for(int x=0;x<arr.length;x++) {
			if(arr[x]>max) {
				max=arr[x];
			}
		}
		
		
		System.out.println("최소값:"+min);
		System.out.println("최대값:"+max);
		
	}

}
