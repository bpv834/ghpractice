package EXAM;

import java.awt.Toolkit;

public class Task_implements_Runnable {
	public void run() {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(5);}catch(Exception e) {}
		}
	}

}
