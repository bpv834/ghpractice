package sec02.exam01;

public class 반복 {

	public static void main(String[] args) {
		String str[]=new String[] {"한국","미국","북한","중국","러시아","일본"};
		String str1[]=new String[] {"한반도","아메리카","북쪽","동북아","동유럽","열도"};
		String str2[][]=new String[][] {str,str1};
		
		
		for(int x=0; x<str2.length;x++) {
			for(int y=0; y<str2[x].length;y++) {
				String strval=str2[x][y];
				System.out.println(strval);
				
				System.out.println(str2.length+"+"+str2[x].length);
			}
		}
	}


	}


