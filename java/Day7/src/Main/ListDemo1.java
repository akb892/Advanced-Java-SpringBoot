package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List<String> li1 = new ArrayList<String>();
		li1.add("Avinash");
		li1.add("Avi");
		li1.add("Anish");
		li1.add("Avish");
		
		
		
		
//		Iterator<String> i = li1.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//			i.remove();
//		}
		System.out.print(li1);
	}
}
