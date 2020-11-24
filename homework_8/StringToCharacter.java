import java.util.Scanner;
import java.util.ArrayList;

public class StringToCharacter {
	public static ArrayList<Character> toCharacterArray(String s){
		ArrayList<Character> list=new ArrayList<>();
		for (int i=0;i<s.length();i++) {
			list.add(s.charAt(i));
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=input.next();
		ArrayList<Character> list=toCharacterArray(s);
		System.out.print(list.toString());
	}
}
