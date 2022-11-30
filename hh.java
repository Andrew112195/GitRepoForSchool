import java.util.ArrayList;
import java.util.List;

public class hh {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);
		
		System.out.println(list.remove(0));
		System.out.println(list.remove(1));
		System.out.println(list.remove(2));
		System.out.println(list.remove(3));
		
		System.out.println(list);
		
	}

}
