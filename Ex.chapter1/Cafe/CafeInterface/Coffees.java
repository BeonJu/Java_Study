package CafeInterface;

import Amount.Amounts;
import Constant.Cost;

public class Coffees {
//	private String temperature;
//	private String Cafain;
	private String Size;
	private String MenuName;
	private int cost;
	private int oderNumber;

//	public void setTemperatures(String temp) {
//		// TODO Auto-generated method stub
//		if (temp == "Hot") {
//			this.temperature = temp;
//		} else if (temp == "Ice") {
//			this.temperature = temp;
//		}
//	}

//카페인 커피는 출력 안할 것 이나 디카페인은 출력 할 예정
//	public void setCafein(String cafein) {
//		// TODO Auto-generated method stub
//		if (cafein == "Cafein") {
//			this.Cafain = cafein;
//		} else if (cafein == "Decafein") {
//			this.Cafain = cafein;
//		}
//
//	}

	public void setSize(String size) {
		// TODO Auto-generated method stub
		if (size.equals("S")) {
			this.Size = size;
		} else if (size.equals("M")) {
			this.Size = size;
		} else if (size.equals("L")) {
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

	public void setMenuCost(Amounts Guest) {
		// 아메리카노, 아이스 아메리카노, 디카페인아메리카노, 디카페인아이스아메리카노 일때 아메리카노 커피 가격 삽입
		if (Guest.getMenuName().equals("아메리카노") || Guest.getMenuName().equals("아이스아메리카노")
				|| Guest.getMenuName().equals("디카페인아메리카노") || Guest.getMenuName().equals("디카페인아이스아메리카노")) {
			if (Guest.getSize().equals("S")) {
				this.cost = Cost.AmericanoSCost;
			} else if (Guest.getSize().equals("M")) {
				this.cost = Cost.AmericanoMCost;
			} else if (Guest.getSize().equals("L")) {
				this.cost = Cost.AmericanoLCost;
			}
		}
		
	}

	public int getMenuCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}

	public void setOderNumber(int odernumber) {
		// TODO Auto-generated method stub
		this.oderNumber += odernumber;
	}

	public int getOderNumber() {
		// TODO Auto-generated method stub
		return this.oderNumber;
	}

}
