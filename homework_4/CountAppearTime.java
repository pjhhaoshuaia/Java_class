import java.util.Scanner;
import java.util.Arrays;

public class CountAppearTime {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a=new int[100];
                int c=0;
		System.out.print("Enter 10 numbers:");
		int n=input.nextInt();
		int i=0,count=1,j=0;
		while (n!=0) {
			a[i]=n;
			n=input.nextInt();
			i+=1;
		}
		a=Arrays.copyOf(a,i);
		Arrays.sort(a);
		for (j=0;j<i;j++) {
			if (j<a.length-1 && a[j+1]==a[j])
				count+=1;
			else {
				if (count>1) {
					System.out.println(a[j]+" occurs "+count+" times");
					count=1;
				}
				else if (j!=0)
					System.out.println(a[j]+" occurs "+count+" time");
			}
		}
		input.close();
	}
}
