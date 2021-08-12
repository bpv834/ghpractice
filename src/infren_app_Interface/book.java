package infren_app_Interface;

public class book {
	String name;//책이름
	int price;//가격
	int num;//수량
	book(String name,int price){
		this.name=name;
		this.price=price;
	}
	void pt(){
		System.out.println("책이름:"+name+"/책 가격:"+price+"총가격"+num*price);
	}

}
