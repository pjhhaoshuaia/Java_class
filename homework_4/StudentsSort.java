import java.util.Scanner;
import java.util.Arrays;

public class StudentsSort {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int n=input.nextInt();
		System.out.print("Enter all students' names:");
		String[] names=new String[100];
		names=Arrays.copyOf(names,n);
		for (int i=0;i<n;i++) {
			names[i]=input.next();
		}
		System.out.print("Enter all students' scores:");
		int[] scores=new int[100];
		int[] pos=new int[100];
		scores=Arrays.copyOf(scores,n);
		pos=Arrays.copyOf(pos,n);
		for (int i=0;i<n;i++) {
			scores[i]=input.nextInt();
			pos[i]=i;
		}
		for (int i=0;i<n; i++) { 
            for (int j=0;j<n-i ; j++) {  
                if (scores[j]<scores[j+1]) {
                    int temp = scores[j];scores[j]=scores[j+1];scores[j+1]=temp;
                    int t = pos[j];pos[j]=pos[j+1];pos[j+1]=t;
                }
            }    
        }
		for (int i=0;i<n;i++) {
			System.out.print(names[pos[i]]);
			if (i!=n-1)
				System.out.print(" ");
		}
	}
}
