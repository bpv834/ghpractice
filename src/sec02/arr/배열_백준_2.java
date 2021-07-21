package sec02.arr;

import java.util.Arrays;
import java.util.Scanner;

public class 배열_백준_2 {

	public static void main(String[] args) {
		System.out.println("서로다른 자연수 9개를 입력하시오");
		Scanner sc=new Scanner(System.in);
		int index;
		int arr[]=new int[9];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();	
		};
		int max=0;
		
		
		for(int x=0;x<arr.length;x++) {
			if(arr[x]>max) {
				max=arr[x];
			}
		}
		System.out.println(max);
		for(int c=0;c<arr.length;c++) {
			if(arr[c]==max) {
				index=c+1;
				
				System.out.println(index);
				
				break;
			}
			
		}
	
	
		
	}

}
