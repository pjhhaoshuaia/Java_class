import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;

public class Student implements Comparable<Object> {
	private String studentNumber;
	private String name;
	private int age;
	
	public Student(String studentNumber,String name,int age) {
		this.age=age;
		this.name=name;
		this.studentNumber=studentNumber;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int compareTo(Object o) {
		if (!(o instanceof Student))
			throw new RuntimeException("not student object!");
		Student s=(Student)o;
		if (this.age>s.age)
			return 1;
		else if (this.age==s.age)
			return 0;
		else
			return -1;
	}
}
public class Test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Set<Student> list=new TreeSet<Student>();
		try {
			File output=new File("output.txt");
			if (!output.exists())
				output.createNewFile();
			FileWriter fw=new FileWriter(output.getAbsoluteFile());
			BufferedWriter bw=new BufferedWriter(fw);
			while (true) {
				String studentNumber=input.next();
				if (studentNumber.equals("exit"))
					break;
				String name=input.next();
				int age=input.nextInt();
				list.add(new Student(studentNumber,name,age));
			}
			Iterator<Student> iter=list.iterator();
			while (iter.hasNext()) {
				Student student=(Student)iter.next();
				bw.write(student.getName()+" "+student.getStudentNumber()+" "+student.getAge()+"\n");
			}
			bw.close();
			fw.close();
			input.close();
		}
		catch(IOException error) {
			error.printStackTrace();
		}
	}
}
