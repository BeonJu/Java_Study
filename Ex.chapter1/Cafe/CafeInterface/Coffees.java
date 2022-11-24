package CafeInterface;

public class Coffees {
	private String temperature;
	private String Cafain;
	private String Size;
	private String MenuName;
	private int cost;
	private int oderNumber;

	public void setTemperatures(String temp) {
		// TODO Auto-generated method stub
		if (temp == "Hot") {
			this.temperature = temp;
		} else if (temp == "Ice") {
			this.temperature = temp;
		}
	}

	public void setCafein(String cafein) {
		// TODO Auto-generated method stub
		if (cafein == "Cafein") {
			this.Cafain = cafein;
		} else if (cafein == "Decafein") {
			this.Cafain = cafein;
		}

	}

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
	public String getSize() {
		return this.Size;

	}

	public void Takeout() {
		// TODO Auto-generated method stub
		System.out.println("포장");
	}

	public void setMenuName(String name) {
		// TODO Auto-generated method stub
		this.MenuName = name;
	}
	public String getMenuName() {
		// TODO Auto-generated method stub
		return this.MenuName;
	}

	public void setMenuCost(int cost) {
		// TODO Auto-generated method stub
			this.cost = cost;
		}
	public int getMenuCost() {
		// TODO Auto-generated method stub
			return this.cost;		}
 
	public void setOderNumber(int odernumber) {
		// TODO Auto-generated method stub
		this.oderNumber += odernumber;
	}
	
	public int getOderNumber() {
		// TODO Auto-generated method stub
		return this.oderNumber;
	}


	

}
