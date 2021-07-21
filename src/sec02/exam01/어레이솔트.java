package sec02.exam01;

import java.util.Arrays;

public class 어레이솔트 {

	public static void main(String[] args) {
		int intarr1[]=new int[] {5,7,4,2,1};
		System.out.println(Arrays.toString(intarr1));
		
		Arrays.sort(intarr1);
		System.out.println(Arrays.toString(intarr1));
		
		String str1[]=new String[] {"나","가","하","아"};
		System.out.println(Arrays.toString(str1));
		Arrays.sort(str1);
		System.out.println(Arrays.toString(str1));

	}

}
