import java.util.Scanner;

public class InCircle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates:");
		double x=input.nextDouble();
		double y=input.nextDouble();
		double distance=Math.pow((Math.pow(x,2)+Math.pow(y,2)), 0.5);
		if (distance<=10)
			System.out.printf("Point (%.1f,%.1f) is in the circle",x,y);
		else
			System.out.printf("Point (%.1f,%.1f) is not in the circle",x,y);
	}
}
