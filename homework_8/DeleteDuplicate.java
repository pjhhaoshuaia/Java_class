import java.util.Scanner;
import java.util.ArrayList;

public class DeleteDuplicate {
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i=0;i<list.size();i++) {
			Integer key=list.get(i);
			for (int j=0;j<i;j++) {
				if (list.get(j).equals(key)) {
					list.remove(i);
					i-=1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 Integers:");
		ArrayList<Integer> list=new ArrayList<>();
		for (int i=0;i<10;i++) {
			list.add(new Integer(input.nextInt()));
		}
		removeDuplicate(list);
		System.out.print("The distinct integers are ");
		for (int i=0;i<list.size();i++) {
			if (i!=list.size()-1)
				System.out.print(list.get(i).toString()+" ");
			else
				System.out.print(list.get(i).toString());
		}
	}
}
