package EXAM;

public class Beep {

	public static void main(String[] args) {
		Runnable Beep=new Beep();
		Thread thread=new Thread(beepTask);

	}

}
