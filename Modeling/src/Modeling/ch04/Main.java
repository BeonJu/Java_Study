package Modeling.ch04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//합성 관계
		Computer com1 = new Computer();
		//집약 관계
		
		MainBoard mb;
		CPU cpu;
		Memory memory;
		PowerSupply ps;
		
		Computer2 com2 = new Computer2(mb, cpu, memory, ps);
		
		
	}

}
