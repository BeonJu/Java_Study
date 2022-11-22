package HomeWorkCoffeeShop;

public interface Beverage {
//	Hot or Ice 선택
	void setTemperatures(String temp);
//	Cafein or DeCafein 선택
	void setCafein(String cafein);
//	Size S M L 선택
	void setSize(String size);
//	Takeout or ShopInDrink 선택
	void Takeout();
//	주문 메뉴 명 return 메소스
	void setMenuName(String name);
}
