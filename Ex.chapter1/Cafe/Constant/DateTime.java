package Constant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
	public static final LocalDate currentDate = LocalDate.now();  //로컬 지금 날짜 시간
	public static final LocalTime currentTime = LocalTime.now();
	public static final LocalDateTime dateTime = LocalDateTime.of(currentDate, currentTime); 
	//연도 월 일 오후/오전 시간/ 분/ 초
	public static final String currentDateTime = DateTime.dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss"));
}
