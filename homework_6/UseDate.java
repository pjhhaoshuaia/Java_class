import java.util.Date;

public class UseDate{
	public static void main(String[] args) {
		Date time=new Date(10000);
		System.out.println(time.toString());
		time.setTime(100000);
		System.out.println(time.toString());
		time.setTime(1000000);
		System.out.println(time.toString());
		time.setTime(10000000);
		System.out.println(time.toString());
		time.setTime(100000000);
		System.out.println(time.toString());
		time.setTime(1000000000);
		System.out.println(time.toString());
		time.setSeconds(10000000);
		System.out.println(time.toString());
		time.setSeconds(100000000);
		System.out.println(time.toString());
	}
}
