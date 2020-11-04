//class StopWatch
import java.util.Date;

public class StopWatch {
	private Date startTime;
	private Date endTime;
	
	public StopWatch() {
		startTime=new Date();
	}
	public void start() {
		startTime=new Date();
	}
	public void end() {
		endTime=new Date();
	}
	public long getElapsedTimes() {
		return endTime.getTime()-startTime.getTime();
	}
}
//main
public class test {
	public static void main(String[] args) {
		StopWatch watch=new StopWatch();
		int[] a=new int[100000];
		for (int i=0;i<a.length;i++) {
			a[i]=(int)Math.random()*10000;
		}
		watch.start();
		for (int i=0;i<a.length;i++) {
			for (int j=i;j<a.length;j++) {
				if (a[j]<a[i]) {
					int t=a[j];a[j]=a[i];a[i]=t;
				}
			}
		}
		watch.end();
		System.out.println(watch.getElapsedTimes());
	}
}
