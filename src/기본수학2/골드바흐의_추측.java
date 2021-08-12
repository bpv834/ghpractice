package 기본수학2;

import java.util.Arrays;
import java.util.Scanner;

public class 골드바흐의_추측 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean pr[]=new boolean[n+1];
		for(int i=0;i<=n;i++) {
		pr[i]=true;	
		}
		
		for(int i=2;i*i<=n;i++) {
			for(int j=i*i;j<=n;j+=i) {
				pr[j]=false;
				pr[1]=pr[0]=false;
			
			}
			
			}
		System.out.println(Arrays.toString(pr));
	
			
		
	
	}
	

}
