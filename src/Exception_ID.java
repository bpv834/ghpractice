
public class Exception_ID {

	public static void main(String[] args) {
		try {
			boolean isSuccesee=login("g99","123123");
			if(isSuccesee) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("로그인 실패");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("저작권 g99 2021");
		}
	
	}
	static boolean login(String id, String pw) throws Exception{
		
		boolean isNetworkFailed=true;
		boolean isNoId=false;
		boolean isPasswordWrong=false;
		boolean isPWExpired=false;
		
		if(isNetworkFailed)throw new Exception("네트워크 오류");
		else if(isNoId)throw new Exception("아이디 없다");
		else if(isPasswordWrong)throw new Exception("비번 틀림");
		else if(isPWExpired)throw new Exception("비번변경필요");
		
		System.out.println("");
		return true;
		
	}
	
	

}
