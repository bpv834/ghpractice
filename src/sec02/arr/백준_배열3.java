package sec02.arr;

import java.util.Scanner;

public class 백준_배열3 {
	/*String str="가나";
	int arr[]=new int[] {1,2};*/
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int mul=a*b*c;
	System.out.println(mul);
	String strmul=Integer.toString(mul);
	System.out.println("문자열의 길이:"+strmul.length());
	
	
	for(int i=0;i<10;i++) {
		int count=0;
		for(int j=0;j<strmul.length();j++) {
			if((strmul.charAt(j)-'0')==i) {
			count++;
			}
			
					
		}
		System.out.println(count);
		
				
			
		
	}
	}

}



