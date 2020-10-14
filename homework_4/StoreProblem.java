public class StoreProblem {
	public static void main(String[] args) {
		boolean[] l=new boolean[100];
		for (int i=0;i<100;i++) {
			for (int j=i;j<100;j=j+i+1) {
				l[j]=!l[j];
			}
		}
		for (int i=0;i<100;i++) {
			if (l[i]==true) {
				System.out.print("L"+i);
				if (i==99)
					System.out.print("\n");
				else
					System.out.print(" ");
			}
		}
	}
}
