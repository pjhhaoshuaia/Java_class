import java.util.Scanner;

public class ISBN {
	public static void main(String[] args) {
		int d=0,i=9,ans=0;
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		Scanner input=new Scanner(System.in);
		int code=input.nextInt();
		int res=code;
		while (i!=0) {
			d=code%10;
			ans+=d*i;
			code=code/10;
			i-=1;
		}
		ans=ans%11;
		System.out.print("The ISBN-10 number is ");
		int len=(res+"").length();
		for (int j=0;j<9-len;j++) {
			System.out.print("0");
		}
		System.out.print(res);
		switch (ans) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:System.out.println(ans);break;
			case 10:System.out.println("X");break;
		}
	}
}
