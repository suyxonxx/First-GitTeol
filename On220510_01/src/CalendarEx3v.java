import java.text.*;
import java.util.*;

public class CalendarEx3v {

	public static void main(String[] args) throws ParseException {
		String date1 = "2022/05/10";
		String date2 = "2021/01/02";
		
		Date format1 = new SimpleDateFormat("yyyy/MM/dd").parse(date1);
		Date format2 = new SimpleDateFormat("yyyy/MM/dd").parse(date2);
		
		long diffSec = (format1.getTime() - format2.getTime()) / 1000;
		long diffMin = (format1.getTime() - format2.getTime()) / 60000;
		long diffHour = (format1.getTime() - format2.getTime()) / 3600000;
		long diffDays = diffSec / (24 * 60 * 60);
		
		System.out.println(diffSec + "초 차이");
		System.out.println(diffMin + "분 차이");
		System.out.println(diffHour + "시 차이");
		System.out.println(diffDays + "일 차이");
	}

}
