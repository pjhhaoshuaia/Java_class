import java.util.Scanner;

public class InTriangle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point's x- and y- coordinates:");
		double x=input.nextDouble();
		double y=input.nextDouble();
		if (x>=0 && y>=0 && 0.5*x+y<=100)
			System.out.println("The point is in triangle");
		else
			System.out.println("The point is not in triangle");
	}
}
