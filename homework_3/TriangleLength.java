import java.util.Scanner;

public class TriangleLength {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if (a+b>c && a+c>b && c+b>a) {
			int ans=a+b+c;
			System.out.println(ans);
		}
		else
			System.out.println("Invalid input");
	}
}
