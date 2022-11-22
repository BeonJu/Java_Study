package Coffe;

public abstract class Beverage {
//	Beverage는 추상 클래스이며 getDescription()과 cost()라는 2개의 메소드를 가집니다.
//	필드
	String description = "제목 없음";
	
//	메소스
//	getDescript은 이미 구현, cost()는 서브클래스에서 구현
	public String getDescription() {
		return description;
	}
// 추상 메소스
	public abstract double cost();
}
