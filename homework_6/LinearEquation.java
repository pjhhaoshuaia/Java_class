//class LinearEquation
public class LinearEquation {
	private double a,b,c,d,e,f;
	
	public LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	public void seta(double a) {
		this.a=a;
	}
	public void setb(double b) {
		this.b=b;
	}
	public void setc(double c) {
		this.c=c;
	}
	public void setd(double d) {
		this.d=d;
	}
	public void sete(double e) {
		this.e=e;
	}
	public void setf(double f) {
		this.f=f;
	}
	public boolean isSovable() {
		if (a*d-b*c!=0)
			return true;
		else
			return false;
	}
	public double getx() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double gety() {
		return (a*f-e*c)/(a*d-b*c);
	}
}
//main
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a,b,c,d,e,f;
		System.out.print("Enter a:");
		a=input.nextDouble();
		System.out.print("Enter b:");
		b=input.nextDouble();
		System.out.print("Enter c:");
		c=input.nextDouble();
		System.out.print("Enter d:");
		d=input.nextDouble();
		System.out.print("Enter e:");
		e=input.nextDouble();
		System.out.print("Enter f:");
		f=input.nextDouble();
		LinearEquation le=new LinearEquation(a,b,c,d,e,f);
		if (le.isSovable())
			System.out.println(le.getx()+" "+le.gety());
		else
			System.out.println("The equation has no solution.");
	}
}
