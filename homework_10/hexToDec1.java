import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个二进制字符串:");
		String hex=input.next();
		try {
			System.out.println(hexToDec(hex));
		}
		catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	public static int hexToDec(String hexString) throws NumberFormatException{
		int ans=0;
		for (int i=0;i<hexString.length();i++) {
			int n=Integer.valueOf(hexString.charAt(i));
			if (n>=48 && n<=57) {
				ans=ans*16+n-48;
			}
			else if (n>=65 && n<=70) {
				ans=ans*16+n-55;
			}
			else {
				throw new NumberFormatException("不是十六进制数");
			}
		}
		return ans;
	}
}
