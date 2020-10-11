import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		int key=(int)(Math.random()*900)+100;
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个三位整数:");
		int number=input.nextInt();
		if (key/100==number/100 && key%10==number%10 && key/10==number/10)
			System.out.println("you'll get $10000");
		else if ((key/100==number/100 || key/100==number/10 || key/100==number%10) && (key/10==number/100 || key/10==number/10 || key/10==number%10) && (key%10==number/100 || key%10==number/10 || key%10==number%10))
			System.out.println("you'll get $3000");
		else if ((key/100==number/100 || key/100==number/10 || key/100==number%10) || (key/10==number/100 || key/10==number/10 || key/10==number%10) || (key%10==number/100 || key%10==number/10 || key%10==number%10))
			System.out.println("you'll get $1000");
	}
}
