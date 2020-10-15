import java.util.Scanner;
import java.util.Arrays;

public class ListPartition {
	public static int partition(int[] list){
		int pivot=0,low=1,high=list.length-1,t;
		boolean flag=true;
		while (flag==true) {
			if (list[low]<=list[pivot]) {
				low+=1;
				continue;
			}
			else {
				if (list[high]>list[pivot]) {
					high-=1;
					continue;
				}
				else {
					t=list[low];list[low]=list[high];list[high]=t;
					low+=1;
				}
			}
			if (low==high)
				flag=false;
		}
		high-=1;
		t=list[pivot];list[pivot]=list[high];list[high]=t;
		pivot=high;
		return pivot;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list size:");
		int size=input.nextInt();
		System.out.print("Enter list content:");
		int[] list=new int[10];
		for (int i=0;i<size;i++) {
			list[i]=input.nextInt();
		}
		list=Arrays.copyOf(list, size);
		int pivot=partition(list);
		System.out.print("After the partition, the list is ");
		for (int i=0;i<size;i++) {
			System.out.print(list[i]);
			if (i!=size-1)
				System.out.print(" ");
		}
	}
}
