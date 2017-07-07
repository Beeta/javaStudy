package joda_time.demo;

import java.util.Calendar;
import java.util.Locale;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDate.Property;
import org.joda.time.LocalTime;
import org.joda.time.Partial;

/**
 * @author gaozh
 */
public class LocalDateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		example_1();
		example_2();
		example_3();
		example_4();
	}

	private static void example_1() {
		LocalDate now = new LocalDate();
		System.out.println("Now:" + now.toString());
		LocalDate localDate = now.monthOfYear().setCopy(11) // November
				.dayOfMonth() // Access Day Of Month Property
				.withMinimumValue() // Get its minimum value
				.plusDays(6) // Add 6 days
				.dayOfWeek() // Access Day Of Week Property
				.setCopy("Monday") // Set to Monday (it will round down)
				.plusDays(1); // Gives us Tuesday
		System.out.println("Then:" + localDate.toString());

	}

	/**
	 * 1、与JDK互操作 2、获取属性并根据不同的Locale打印。。。
	 */
	private static void example_2() {

		// 与DateTime一样，都可方便与JDK交互
		LocalDate fromCalendarFields = LocalDate.fromCalendarFields(Calendar
				.getInstance());

		// 访问属性
		Property dayOfWeek = fromCalendarFields.dayOfWeek();
		String chinessWeek = dayOfWeek.getAsShortText(Locale.CHINESE);
		String usWeek = dayOfWeek.getAsText(Locale.US);
		String usWeek_S = dayOfWeek.getAsShortText(Locale.US);
		System.out.println(chinessWeek);
		System.out.println(usWeek);
		System.out.println(usWeek_S);
	}

	/**
	 * 时间处理 专注于时间
	 */
	private static void example_3() {

		// 所有时区
		for (String timezoneId : DateTimeZone.getAvailableIDs()) {
			System.out.println(timezoneId);
		}
		LocalTime localTime = new LocalTime(DateTimeZone.forID("Asia/Shanghai"));
		System.out.println(localTime);
		
		LocalTime timesxx = localTime.minusHours(6).plusMinutes(20);
		System.out.println(timesxx.getHourOfDay()+"\n"+timesxx.getMillisOfDay()+"\n"+timesxx.getMinuteOfHour());
	}

	/**
	 * Partial
	 * 任意组装时间部分,x年x时x星期等等
	 * [year=2013, dayOfMonth=3, dayOfWeek=6]
	 */
	private static void example_4() {
		//类型
		DateTimeFieldType[] types = { DateTimeFieldType.year(),
				DateTimeFieldType.dayOfMonth(),
				DateTimeFieldType.dayOfWeek() };
		//2013年3号星期6
		Partial partial = new Partial(types, new int[] { 2013, 3, 6 });
		System.out.println(partial.toString());
	}

}
