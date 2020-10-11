import java.util.Scanner;

public class TwoRectangle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter r1's center x-,y-coordinates,width,and height:");
		double r1_x=input.nextDouble();
		double r1_y=input.nextDouble();
		double r1_width=input.nextDouble();
		double r1_height=input.nextDouble();
		System.out.print("Enter r2's center x-,y-coordinates,width,and height:");
		double r2_x=input.nextDouble();
		double r2_y=input.nextDouble();
		double r2_width=input.nextDouble();
		double r2_height=input.nextDouble();
		if (r2_x-r2_width/2>=r1_x-r1_width/2 && r2_x+r2_width/2<=r1_x+r1_width/2 && r2_y-r2_height/2>=r1_y-r1_height/2 && r2_y+r2_height/2<=r1_y+r1_height/2)
			System.out.println("r2 is inside r1");
		else if (r2_x-r2_width/2>=r1_x+r1_width/2 || r2_x+r2_width/2<=r1_x-r1_width/2 || r2_y-r2_height/2>=r1_y+r1_height/2 || r2_y+r2_height/2<=r1_y-r1_height/2)
			System.out.println("r2 does not overlaps r1");
		else
			System.out.println("r2 overlaps r1");
	}
}
