import java.util.Scanner;

public class TwoCircle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter circle1's center x-,y-coordinates,and radius:");
		double r1_x=input.nextDouble();
		double r1_y=input.nextDouble();
		double r1_radius=input.nextDouble();
		System.out.print("Enter circle2's center x-,y-coordinates,and radius:");
		double r2_x=input.nextDouble();
		double r2_y=input.nextDouble();
		double r2_radius=input.nextDouble();
		double distance=Math.pow((Math.pow(r2_x-r1_x,2)+Math.pow(r2_y-r1_y,2)),0.5);
		if (distance<=Math.abs(r1_radius-r2_radius))
			System.out.println("circle2 is inside circle1");
		else if (distance<=r1_radius+r2_radius)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlaps circle1");
	}
}
