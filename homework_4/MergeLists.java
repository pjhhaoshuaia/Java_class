import java.util.Scanner;
import java.util.Arrays;

public class MergeLists {
	public static void sort(int arr[]) {
        for(int i =0 ; i<arr.length-1 ; i++) { 
            for(int j=0 ; j<arr.length-1-i ; j++) {  
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }    
        }
    }
	public static int[] merge(int[] list1,int[] list2) {
		int[] list=new int[20];
		for (int i=0;i<list1.length;i++) {
			list[i]=list1[i];
		}
		for (int i=0;i<list2.length;i++) {
			list[list1.length+i]=list2[i];
		}
		list=Arrays.copyOf(list, list1.length+list2.length);
		sort(list);
		return list;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] list1=new int[10];
		int[] list2=new int[10];
		System.out.print("Enter list1 size and contents:");
		int size1=input.nextInt();
		list1=Arrays.copyOf(list1, size1);
		for (int i=0;i<size1;i++) {
			list1[i]=input.nextInt();
		}
		System.out.print("Enter list2 size and contents::");
		int size2=input.nextInt();
		list2=Arrays.copyOf(list2, size2);
		for (int i=0;i<size2;i++) {
			list2[i]=input.nextInt();
		}
		System.out.print("list1 is ");
		for (int i=0;i<size1;i++) {
			System.out.print(list1[i]);
			if (i==size1-1)
				System.out.print("\n");
			else
				System.out.print(" ");
		}
		System.out.print("list2 is ");
		for (int i=0;i<size2;i++) {
			System.out.print(list2[i]);
			if (i==size2-1)
				System.out.print("\n");
			else
				System.out.print(" ");
		}
		int[] list=merge(list1,list2);
		System.out.print("The merged list is ");
		for (int i=0;i<size1+size2;i++) {
			System.out.print(list[i]);
			if (i==size2+size1-1)
				System.out.print("\n");
			else
				System.out.print(" ");
		}
	}
}
