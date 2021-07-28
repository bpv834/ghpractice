package BBackjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Find_out_Alph {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int arr[]=new int[26];
		int al[]=new int[26];
		int a=97;
		for(int i=0;i<26;i++) {
			al[i]=a++;
			
		}
		System.out.println(Arrays.toString(al));
		for(int i=0;i<26;i++) {
			arr[i]=-1;
		}
		for(int i=0;i<s.length();i++)
			for(int j=0;j<26;j++) {
				if(s.charAt(i)==al[j]) {
					arr[j]=i;
					
				}
				
			}
		System.out.println(Arrays.toString(arr));
	}
}
