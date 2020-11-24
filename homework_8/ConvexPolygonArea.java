public class ConvexPolygon {
	private double[] x=new double[100];
	private double[] y=new double[100];
	private int n;
	
	public ConvexPolygon(double[] x,double[] y,int n) {
		for (int i=0;i<n;i++) {
			this.x[i]=x[i];
			this.y[i]=y[i];
			this.n=n;
		}
	}
	public double getArea() {
		double ans=0;
		for (int i=0;i<n-1;i++) {
			ans+=x[i]*y[i+1];
			ans-=x[i+1]*y[i];
		}
		ans+=x[n-1]*y[0];
		ans-=x[0]*y[n-1];
		return Math.abs(ans*0.5);
	}
}
import java.util.Scanner;

public class ConvexPolygonArea {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of points:");
		int n=input.nextInt();
		double[] x=new double[n],y=new double[n];
		System.out.print("Enter the coordinates of the points:\n");
		for (int i=0;i<n;i++) {
			x[i]=input.nextDouble();
			y[i]=input.nextDouble();
		}
		ConvexPolygon cp=new ConvexPolygon(x,y,n);
		System.out.printf("The total area is %.3f",cp.getArea());
	}
}
