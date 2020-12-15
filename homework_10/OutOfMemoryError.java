import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("输入需要分配的数组空间:");
		int n=input.nextInt();
		try {
			System.out.print(call(n));
		}
		catch (Error e){
			System.out.print(e.getMessage());
		}
	}
	public static String call(int n) throws OutOfMemoryError{
		if (n>10000) 
			throw new OutOfMemoryError("OutOfMemory");
		else
			return "分配成功";
	}
}
