import java.util.Scanner;
import java.util.ArrayList;

public class Largest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the array size n:");
		int n=input.nextInt();
		int[][] list=new int[n][n];
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				list[i][j]=(int)(Math.random()*2);
			}
		}
		System.out.println("The random array is");
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(list[i][j]);
			}
			System.out.print("\n");
		}
		ArrayList<Integer> maxrow=new ArrayList<>();
		ArrayList<Integer> maxcolumn=new ArrayList<>();
		int max=0,c=0;
		for (int i=0;i<n;i++) {
			int x=0;
			for (int j=0;j<n;j++) {
				x+=list[i][j];
			}
			if (x>max) {
				if (maxrow.isEmpty()) {
					c+=1;
				}
				else {
					maxrow.remove(c-1);
				}
				maxrow.add(new Integer(i));
				max=x;
			}
			else if (x==max) {
				maxrow.add(new Integer(i));
				c+=1;
			}
		}
		System.out.print("The largest row index:");
		for (int i=0;i<c;i++) {
			System.out.print(maxrow.get(i).toString()+" ");
		}
		max=0;c=0;
		for (int i=0;i<n;i++) {
			int x=0;
			for (int j=0;j<n;j++) {
				x+=list[j][i];
			}
			if (x>max) {
				if (maxcolumn.isEmpty()){
					c+=1;
				}
				else {
					maxcolumn.remove(c-1);
				}
				maxcolumn.add(new Integer(i));
				max=x;
			}
			else if (x==max) {
				maxcolumn.add(new Integer(i));
				c+=1;
			}
		}
		System.out.print("\nThe largest column index:");
		for (int i=0;i<c;i++) {
			System.out.print(maxcolumn.get(i).toString()+" ");
		}
	}
}
