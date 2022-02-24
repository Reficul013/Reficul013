package strings;
import java.util.*;
import java.time.*;

public class NumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date1 = LocalDate.of(1999,Month.APRIL,20);
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		Period difference = Period.between(date1, date2);
		System.out.println("Days: "+difference.getDays()+" Months: "+difference.getMonths()+" Years: "+difference.getYears());
		
	}

}
