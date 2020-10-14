import java.util.Scanner;
import java.util.Arrays;

public class IsSorted {
	public static boolean issorted(int[] list) {
        for (int i=0;i<list.length-1;i++) {
        	if (list[i]>list[i+1])
        		return false;
        	else
        		continue;
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of the list:");
		int size=input.nextInt();
		System.out.print("Enter the contents of the list:");
		int[] list=new int[100];
		list=Arrays.copyOf(list, size);
		for (int i=0;i<size;i++) {
			list[i]=input.nextInt();
		}
		System.out.print("The list has "+size+" integers ");
		for (int i=0;i<size;i++) {
			System.out.print(list[i]);
			if (i==size-1)
				System.out.print("\n");
			else
				System.out.print(" ");
		}
		boolean flag=issorted(list);
		if (flag==true)
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
		input.close();
	}
}
