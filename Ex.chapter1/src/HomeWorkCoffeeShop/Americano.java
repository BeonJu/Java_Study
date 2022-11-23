package HomeWorkCoffeeShop;

public class Americano extends Coffees {
	private int cost = 2000;
	public Americano(String size) {
		setMenuName("아메리카노");
		setTemperatures("Hot");
		setSize(size);
		if(size =="S") {
			setMenuCost(this.cost);
		}else if(size =="M") {
			setMenuCost(this.cost + 500);
		}else if(size =="L") {
			setMenuCost(this.cost + 1000);
		}
		setOderNumber(1);
	}
}
