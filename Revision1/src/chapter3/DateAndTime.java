package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTime {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateAndTime = LocalDateTime.now();
		System.out.println(dateAndTime);
		
		System.out.println();
		System.out.println();
		
		LocalDate myBirthday = LocalDate.of(1995, Month.APRIL, 20);
		System.out.println(myBirthday);
		
		LocalTime time2 = LocalTime.of(20, 05);
		System.out.println(time2);
		
		LocalDateTime midnightNYE = LocalDateTime.of(2017, Month.JANUARY, 31, 23, 59);
		System.out.println(midnightNYE);
		
		System.out.println();
		midnightNYE = midnightNYE.plusSeconds(60);
		System.out.println(midnightNYE);
		
		System.out.println("************ TASK *****************************");
		
		LocalDate jan = LocalDate.of(2018, Month.JANUARY, 1);
		LocalTime theTime = LocalTime.of(9, 0);
		LocalDateTime combined = LocalDateTime.of(jan, theTime);
		combined = combined.plusYears(1).plusMonths(2).minusHours(1);
		System.out.println(combined);
		
		System.out.println();
		
		LocalDate dateNow = LocalDate.now();
		DateTimeFormatter dtfShortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter dtfMediumDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtfLongDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		System.out.println(dateNow.format(dtfShortDate));
		System.out.println(dateNow.format(dtfMediumDate));
		System.out.println(dateNow.format(dtfLongDate));
		
		System.out.println();
		
		LocalDateTime myParty = LocalDateTime.of(1995, Month.APRIL, 20, 15, 30);
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT);
		System.out.println(myParty.format(dtf));
		
		DateTimeFormatter dtfMyPattern = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yy");
		System.out.println(myParty.format(dtfMyPattern));

	}

}
