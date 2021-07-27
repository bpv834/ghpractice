package BBackjoon;

public class Left {

	 public static void main(String[] args) {
	     
		 boolean self[]=new boolean[10035];
		 for(int i=0;i<9999;i++) {
			 self[d(i)]=true;
		 }
		 
		 for(int i=0;i<9999;i++) {
			 if(self[i]==false) {
				 System.out.println(i);
			 }
		 }
		 
}
	 static int d(int n) {
		 int num=n;
		 while(n>0) {
			 num=num+n%10;
			 n=n/10;
		 }
		 return num;
	 }
	 
	 
	 
}