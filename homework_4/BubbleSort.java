import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
	public static void sorted(double arr[]) {
        for(int i =0 ; i<arr.length-1 ; i++) { 
            for(int j=0 ; j<arr.length-1-i ; j++) {  
                if(arr[j]>arr[j+1]) {
                    double temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }    
        }
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers in double type:");
		int i;
		double[] a=new double[10];
		for (i=0;i<10;i++) {
			a[i]=input.nextDouble();
		}
		sorted(a);
		System.out.println(Arrays.toString(a));
		input.close();
	}
}
