package sec01.exam02;

public class kar {
	//필드
	
	String com="현차";
	String mo;
	String col;
	int spe;
	
	
	//생성자
	kar(){
	}
	kar(String mo){
	this (mo,null,0);
	}
	kar(String mo, String col){
		this (mo,col,0);
	}
	kar(String mo, String col, int spe){
		this.mo= mo;
		this.col= col;
		this.spe= spe;
	}
	
	

}
