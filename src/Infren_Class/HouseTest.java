package Infren_Class;

public class HouseTest {

	public static void main(String[] args) {
		House hs=new House();
		System.out.println("에어컨"+hs.airconStat);
		
		hs.airconOn();
		System.out.println("에어컨"+hs.airconStat);
		
		hs.airconOff();
		System.out.println("에어컨"+hs.airconStat);
	}

}
