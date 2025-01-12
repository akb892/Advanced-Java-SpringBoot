import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB(dd-MM-yyy): ");
		String dob = sc.next();
		
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sf.parse(dob);
		Date now = new Date();
		
		long diffInMillies = now.getTime() - d.getTime();
		long day = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
//		Locale l = new Locale("HI", "IN");
//		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,l);
		System.out.println(day/365);
		
	}
}
