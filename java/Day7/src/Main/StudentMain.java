package Main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.cg.bean.Student;
import com.cg.sort.SortByMarks;
import com.cg.sort.SortByName;

public class StudentMain {
	public static void main(String[] args) {
//		Student s1 = new Student("Aman");
//		Student s2 = new Student("Aman");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s1.equals(s2));

//		Set<Student> s = new HashSet<Student>();

//		System.out.println("Raj".hashCode());
//		System.out.println("Ankan".hashCode());
//		System.out.println("Frankline".hashCode());
//		System.out.println("Aman".hashCode());
//		System.out.println("Aryan".hashCode());

//		s.add(new Student("Raj"));
//		s.add(new Student("Ankan"));
//		s.add(new Student("Frankline"));
//		s.add(new Student("Aman"));
//		s.add(new Student("Aryan"));
//		s.add(new Student("Amit"));
//		
//		System.out.println(s);
//		s.remove(new Student("Ankan"));
//		System.out.println(s);

//		System.out.println(s.contains(new Student("Amit")));
		
		
//		Set<String> s = new TreeSet<String>();
//		
//		s.add("Ankan");
//		s.add("Shalu");
//		s.add("Reshma");
//		s.add("Dipti");
//		s.add("Aman");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice to sort");
		String ch = sc.next();
		
		
		
		
		Set<Student> s =null;
		
		if(ch.equalsIgnoreCase("name"))
			s = new TreeSet<Student> (new SortByName());
		else {
			s = new TreeSet<Student>(new SortByMarks());
		}
		
		s.add(new Student("Ankan", 87));
		s.add(new Student("Shipra", 78));
		s.add(new Student("Dipti", 98));
		s.add(new Student("Aryan", 90));
		s.add(new Student("Shreya", 75));
		
		
		
		for(Student s1:s)
			System.out.println(s1);
	}
	sc.close();
}
