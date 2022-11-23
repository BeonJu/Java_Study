package HomeWorkCoffeeShop;

public class CafeLatteIce extends Coffees {
	private int cost = 2500;
	public CafeLatteIce(String size) {
		setMenuName("카페라떼");
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
