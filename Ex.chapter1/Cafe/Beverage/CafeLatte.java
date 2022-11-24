package Beverage;

import CafeInterface.Coffees;

public class CafeLatte extends Coffees {
	private int cost = 2500;
	public CafeLatte(String size) {
		setMenuName("카페라떼");
		setTemperatures("Hot");
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
