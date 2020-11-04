import java.util.GregorianCalendar;

public class UseCalendar {
	public static void main(String[] args) {
		GregorianCalendar gc=new GregorianCalendar();
		System.out.println(gc.get(GregorianCalendar.YEAR)+" "+gc.get(GregorianCalendar.MONTH)+" "+gc.get(GregorianCalendar.DAY_OF_MONTH));
		gc.setTimeInMillis(1234567898765L);
		System.out.println(gc.get(GregorianCalendar.YEAR)+" "+gc.get(GregorianCalendar.MONTH)+" "+gc.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
