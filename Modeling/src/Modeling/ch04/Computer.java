package Modeling.ch04;

import Modeling.ch03.Main;

public class Computer {

	private MainBoard mb;
	private CPU cpu;
	private Memory memory;
	private PowerSupply ps;
	//합성 관계
	public Computer() {
		this.mb = new MainBoard();
		this.cpu = new CPU();
		this.memory = new Memory();
		this.ps = new PowerSupply();
	}
	
}
