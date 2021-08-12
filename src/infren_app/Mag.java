package infren_app;

public class Mag extends Book{
	int day;
	void date() {
		System.out.println("Ãâ°£ÀÏ"+day);
	}
	void pt() {
		super.pt();
		System.out.println("¤·¤·¤·¤·¤·¤·");
	}

}
