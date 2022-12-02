package Synchronized;

public class UserThread2 extends Thread {

	
	private Calc calc;
	
	public UserThread2() {
		setName("UserThread2"); //쓰레드 이름 지정

	
	}

	public Calc getCalc() {
		return calc;
	}

	public void setCalc(Calc calc) {
		this.calc = calc;
	}

	@Override
	public void run() {
		calc.setMemory2(200);
	}
}
