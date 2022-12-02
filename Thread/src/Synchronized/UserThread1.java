package Synchronized;

public class UserThread1 extends Thread {

	private Calc calc;
	
	public UserThread1() {
		setName("UserThread1"); //쓰레드 이름 지정

	
	}

	public Calc getCalc() {
		return calc;
	}

	public void setCalc(Calc calc) {
		this.calc = calc;
	}

	@Override
	public void run() {
		calc.setMemory1(100);
	}
	
	
}
