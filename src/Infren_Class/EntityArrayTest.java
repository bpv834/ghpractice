package Infren_Class;

public class EntityArrayTest {

	public static void main(String[] args) {
		House houseArray[]=new House[3];
		houseArray[0]=new House();
		houseArray[1]=new House();
		houseArray[2]=new House();
		
		houseArray[0].airconOn();
		houseArray[1].airconOff();
		
		System.out.println(houseArray[0].airconStat);
		System.out.println(houseArray[1].airconStat);

	}

}
