import java.util.Scanner;

public class PrintDifferentNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a=new int[10];
		int[] b=new int[10];
		System.out.print("Enter 10 numbers:");
		int i,flag,j,count=0;
		for (i=0;i<10;i++) {
			a[i]=input.nextInt();
		}
		for (i=0;i<a.length;i++) {
			flag=1;
			for (j=0;j<i;j++) {
				if (a[i]==a[j])
					flag=0;
			}
			if (flag==1) {
				b[count]=i;
				count+=1;
			}
		}
		System.out.println("The number of distinct numbers is "+count);
		System.out.print("The distinct numbers are:");
		for (i=0;i<count;i++) {
			System.out.print(a[b[i]]);
			if (i==count-1)
				System.out.print("\n");
			else
				System.out.print(" ");
		}
		input.close();
	}
}
