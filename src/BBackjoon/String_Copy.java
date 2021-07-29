package BBackjoon;
import java.util.Arrays;
import java.util.Scanner;

public class String_Copy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		int num=sc.nextInt();
		String s=sc.next();
		String s2="";
		
		for(int i=0;i<s.length();i++)
			for(int j=0;j<num;j++) {
			s2=s2+s.charAt(i);
			}
		System.out.println(s2);
		}

}
