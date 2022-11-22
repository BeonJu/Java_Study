package HomeWorkCoffeeShop;

public class Coffee implements Beverage {
	protected String temperature;
	protected String Cafain;
	protected String Size;
	protected String MenuName;
	protected int cost;

	@Override
	public void setTemperatures(String temp) {
		// TODO Auto-generated method stub
		if (temp == "Hot") {
			this.temperature = temp;
		} else if (temp == "Ice") {
			this.temperature = temp;
		}
	}

	@Override
	public void setCafein(String cafein) {
		// TODO Auto-generated method stub
		if (cafein == "Cafein") {
			this.Cafain = cafein;
		} else if (cafein == "Decafein") {
			this.Cafain = cafein;
		}

	}

	@Override
	public void setSize(String size) {
		// TODO Auto-generated method stub
		if (size == "S") {
			this.Size = size;
		} else if (size == "M") {
			this.Size = size;
		} else if (size == "L") {
			this.Size = size;
		}
	}

	@Override
	public void Takeout() {
		// TODO Auto-generated method stub
		System.out.println("포장");
	}

	@Override
	public void setMenuName(String name) {
		// TODO Auto-generated method stub
		this.MenuName = name;
	}

	public void setMenuCost(int cost) {
		// TODO Auto-generated method stub
		this.cost = cost;
	}

}
