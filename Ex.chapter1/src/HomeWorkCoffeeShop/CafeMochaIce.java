package HomeWorkCoffeeShop;

public class CafeMochaIce extends Coffees {
	private int cost = 2800;
	public CafeMochaIce(String size) {
		setMenuName("카페모카");
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
