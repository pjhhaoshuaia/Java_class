import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Book {
	public String code;
	private String name;
	private double price;
	private String publicPlace;
	
	public Book(String code,String name,double price,String publicPlace) {
		this.code=code;
		this.name=name;
		this.price=price;
		this.publicPlace=publicPlace;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getPublic() {
		return publicPlace;
	}
}
public class Test {
	public static void main(String[] args) {
		Map<String,Book> list=new TreeMap<String,Book>();
		list.put("114514", new Book("114514","book1",81.0,"place1"));
		list.put("1919810", new Book("1919810","book2",8.10,"place2"));
		list.put("5645132", new Book("5645132","book3",81.0,"place3"));
		list.put("6545614", new Book("6545614","book4",81.0,"place4"));
		Iterator iter=list.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry=(Map.Entry)iter.next();
			System.out.println("next: "+entry.getKey()+" "+((Book)entry.getValue()).getName()+" "+((Book)entry.getValue()).getPrice()+" "+((Book)entry.getValue()).getPublic());
		}
	}
}
