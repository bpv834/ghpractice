package sec02.exam01;

import java.util.Arrays;

public class 반복_배열 {

	public static void main(String[] args) {
		int intarr[]=new int[] {1,2,3,4,5};
		int intarr1[]=new int[5];
		System.arraycopy(intarr, 1, intarr1, 2, 3);
		System.out.println(Arrays.toString(intarr1));
		for(int i=1;i<4;i++) {
			int ext=intarr[i];
			intarr1[i-1]=ext;
			
			System.out.println(ext);
		}
		
		
		System.out.println(Arrays.toString(intarr1));

	}

}
