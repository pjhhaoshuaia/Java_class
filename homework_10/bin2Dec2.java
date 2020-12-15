public class BinaryFormatException extends Exception{
	public BinaryFormatException(String message) {
		super(message);
	}
}
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个十六进制字符串:");
		String bin=input.next();
		try {
			System.out.println(bin2Dec(bin));
		}
		catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	public static int bin2Dec(String BinaryString) throws NumberFormatException{
		int ans=0;
		for (int i=0;i<BinaryString.length();i++) {
			int n=Integer.valueOf(BinaryString.charAt(i));
			if (n>=48 && n<=49) {
				ans=ans*2+n-48;
			}
			else {
				throw new NumberFormatException("不是二进制数");
			}
		}
		return ans;
	}
}
