//class QuadraticEquation
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
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
	public double getDiscriminant() {
		return b*b-4*a*c;
	}
	public double getRoot1() {
		if (getDiscriminant()>=0)
			return (-1*b+Math.pow(getDiscriminant(),0.5))/(2*a);
		else
			return 0;
	}
	public double getRoot2() {
		if (getDiscriminant()>=0)
			return (-1*b-Math.pow(getDiscriminant(),0.5))/(2*a);
		else
			return 0;
	}
}
//main
public class test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter a:");
		a=input.nextDouble();
		System.out.print("Enter b:");
		b=input.nextDouble();
		System.out.print("Enter c:");
		c=input.nextDouble();
		QuadraticEquation qe=new QuadraticEquation(a,b,c);
		double judge=qe.getDiscriminant();
		if (judge>0)
			System.out.println(qe.getRoot1()+" "+qe.getRoot2());
		else if (judge==0)
			System.out.println(qe.getRoot1());
		else
			System.out.println("The equation has no roots.");
	}
}
