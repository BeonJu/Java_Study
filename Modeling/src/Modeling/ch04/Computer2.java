package Modeling.ch04;

public class Computer2 {

	private MainBoard mb;
	private CPU cpu;
	private Memory memory;
	private PowerSupply ps;
	//집약 관계
	public Computer2(MainBoard mb,CPU cpu,Memory memory,PowerSupply ps) {
		this.mb = mb;
		this.cpu = cpu;
		this.memory = memory;
		this.ps = ps;
	}
}
