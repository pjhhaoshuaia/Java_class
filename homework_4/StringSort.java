import java.util.Scanner;
import java.util.Arrays;

public class StringSort {
	public static String sort(String s) {
		char[] array=s.toCharArray();
		Arrays.sort(array);
		String news=new String(array);
		return news;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=input.nextLine();
		String news=sort(s);
		System.out.println(news);
	}
}
