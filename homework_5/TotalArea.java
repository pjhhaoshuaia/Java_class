public class TotalArea {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Circle[] circleArray;
		circleArray=createCircleArray();
		printCircleArray(circleArray);
	}
	public static Circle[] createCircleArray() {
		Circle[] circleArray=new Circle[5];
		for (int i=0;i<circleArray.length;i++) {
			circleArray[i]=new Circle(Math.random()*100);
		}
		return circleArray;
	}
	public static void printCircleArray(Circle[] circleArray) {
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for (int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n",circleArray.getRadius(),circleArray.getArea());
		}
		System.out.println("---------------------------------------------");
		System.out.printf("%-30s%-15f","The total area of radius is",sum(circleArray));
	}
	public static double sum(Circle[] circleArray) {
		double sum=0;
		for (int i=0;i<circleArray.length;i++) {
			sum+=circleArray[i].getArea();
		}
		return sum;
	}
}
