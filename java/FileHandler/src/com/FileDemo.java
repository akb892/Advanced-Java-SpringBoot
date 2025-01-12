package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import bean.Student;

public class FileDemo {

	public static void main(String[] args) {
		
		/*
		 * FileReader fr; try { //fr = new
		 * FileReader("C:\\Users\\ARBARNWA\\Downloads\\New Text Document.txt");
		 * 
		 * BufferedReader br = new BufferedReader(fr); String str = br.readLine();
		 * System.out.println(str); } catch (Exception e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */
		
		/*
		 * try { FileReader fr = new
		 * FileReader("C:\\Users\\ARBARNWA\\Downloads\\New Text Document.txt"); int data
		 * = 0 ; while((data = fr.read())!=-1){ System.out.println(data); }
		 * 
		 * } catch (Exception e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		
		/*
		 * try { FileReader fr = new
		 * FileReader("C:\\Users\\ARBARNWA\\Downloads\\New Text Document.txt");
		 * BufferedReader br = new BufferedReader(fr); String data = null ; while((data
		 * = br.readLine())!= null){ System.out.println(data); }
		 * 
		 * } catch (Exception e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Name: ");
//		String name = sc.next();
//		System.out.println("Enter Email: ");
//		String emailString = sc.next();
//		
//
//		try {
//			FileWriter fr = new FileWriter("C:\\Users\\ARBARNWA\\Downloads\\New Text Document.txt",true);
//			fr.write("\n" + name + "\t" + emailString);
//			System.out.println("Done...");
//			fr.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		List<Student> students = new ArrayList<>();
		try {
			FileReader fr = new FileReader("C:\\Users\\ARBARNWA\\Downloads\\New Text Document.txt");
			BufferedReader br = new BufferedReader(fr);
			String data = null;
			while((data = br.readLine()) != null) {
				String d[] = data.split("\t");
				students.add(new Student(d[0], d[1]));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Comparator<Student>c = (s,s1)->s.getName().compareTo(s1.getName());
		Collections.sort(students,c);
		students.forEach(System.out::println);
	}
}
