package Beverage;

import CafeInterface.Coffees;
import Constant.Cost;

public class Americano extends Coffees {
	private int cost = 2000;
	public Americano(String size) {
		setMenuName("아메리카노");
		setTemperatures("Hot");
		setSize(size);
		if(size =="S") {
			setMenuCost(Cost.AmericanoSCost);
		}else if(size =="M") {
			setMenuCost(Cost.AmericanoMCost);
		}else if(size =="L") {
			setMenuCost(Cost.AmericanoLCost);
		}
		setOderNumber(1);
	}
}
