package Beverage;

import CafeInterface.Coffees;

public class AmericanoIce extends Coffees {
	private int cost = 2000;
	public AmericanoIce(String size) {
		setMenuName("아메리카노");
		setTemperatures("Ice");
		setSize(size);
		if(size =="S") {
			setMenuCost(this.cost);
		}else if(size =="M") {
			setMenuCost(this.cost + 500);
		}else if(size =="L") {
			setMenuCost(this.cost + 1000);
		}
	}
}
