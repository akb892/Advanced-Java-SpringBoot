package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
//		String s = "Hello:World";
//		String s1[] = s.split(":");
//		System.out.println();
//		s1[0] = "World";
//		System.out.println(Arrays.toString(s1));
//		String s = "12:00:00AM";
//		
//		String[] arr = s.split(":");
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[2].contains("AM"));
//		System.out.println(Arrays.toString(arr));
//	    if(arr[0].contains("12") && arr[2].contains("AM")){
//	      arr[0] = "00";
//	    }
//	    if(arr[2].contains("PM") && !(arr[0].contains("12"))) {
//	      arr[0] = String.valueOf(Integer.parseInt(arr[0]) + 12);
//	    }
//	    s = Arrays.toString(arr);
//	    System.out.println(s);
//	    int ar[] = {0,1,2,3,4};
//	    System.out.println(Arrays.toString(ar));
		
		
//		int x1 = 21, v1 = 6, x2 = 47, v2 = 3;
//		System.out.println((double)x2);
//		double res = (double)(x2-x1)/(double)(v1-v2);
//		System.out.println(res);
//		String s = "Hello";
//		System.out.println(s.length());
//		
//		int arr[] = {0,2,24,5,6,7,5};
//		
//		System.out.println(arr.length);
		
//		int n = 3;
//		String password = "790";
//		
//		int numf = 0;
//	    int lowf = 0;
//	    int upf = 0;
//	    int spf = 0;    
//	    int count = 0;
//	    for(int i = 0; i< n;i ++){
//	      if(password.charAt(i) >= '0' && password.charAt(i) <= '9') {
//	        numf++;
//	      }
//	      else if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
//	        lowf++;
//	      }
//	      else if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
//	        upf++;
//	       }
//	      else if(password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#'|| password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '^' || password.charAt(i) == '&' || password.charAt(i) == '*' || password.charAt(i) == '(' || password.charAt(i) == ')' || password.charAt(i) == '-' || password.charAt(i) == '+') {
//	        spf++;
//	      }
//	    }
//	    
//	    System.out.println(numf);
//	    if(numf == 0){
//	      count++;
//	      System.out.println(count);
//	    }
//	    if(lowf == 0) {
//	      count++;
//	    }
//	    if(upf == 0) {
//	      count++;
//	    }
//	    if(spf==0){
//	      count++;
//	    }
//	    
//	    System.out.println(count);
//	    if((n+count) < 6){
//	      count += 6-n-count;
//	    }
	    
//		List<Integer> a = new ArrayList<>();
//	    
//	    a.add(1);
//	    a.add(4);
//	    a.add(3);
//	    a.add(2);
//	    
//	    a.addLast(6);
//	    
//	    System.out.println(a);
//		List<String> queries = new ArrayList<>();
//		queries.add("aba");
//		queries.add("xzxb");
//		queries.add("ab");
//		
//		List<String> stringList = new ArrayList<>();
//		stringList.add("aba");
//		stringList.add("baba");
//		stringList.add("aba");
//		stringList.add("xzxb");
//		
//		
//		List<Integer> li = new ArrayList<>();
//	    for(int i = 0; i<queries.size(); i++){
//	      int count = 0;
//	      for(int j = 0; j < stringList.size(); j++){
//	        if(queries.get(i).equals(stringList.get(j))){
//	          count++;
//	          System.out.println(count);
//	        }
//	      }
//	      li.add(count);
//	    }
		
//		List<Integer> li = new ArrayList<>();
//		for(int i = 0; i < 10; i++) {
//			li.add(0);
//		}
//		
//		System.out.println(li);
//		
//		li.set(1, 3);
//		
//		List<Long> li1 = new ArrayList<>(Collections.nCopies(10, 0l));
//		System.out.println(li1);
		List<List<Integer>> queries = new ArrayList<>();
		int n = 10;
		
		for (int i = 0; i < 4; i++) {
            queries.add(new ArrayList<>());
        }
		
		queries.get(0).add(2);
		queries.get(0).add(6);
		queries.get(0).add(8);
		queries.get(1).add(3);
		queries.get(1).add(5);
		queries.get(1).add(7);
		queries.get(2).add(1);
		queries.get(2).add(8);
		queries.get(2).add(1);
		queries.get(3).add(5);
		queries.get(3).add(9);
		queries.get(3).add(15);
		
		for(List<Integer> li: queries) {
			System.out.println(li);
		}
		
		long max = Long.MIN_VALUE;
	    List<Long> li = new ArrayList<>(Collections.nCopies(n,0l));
	    
	    for(int i = 0; i < queries.size(); i++){
	      for(int j = 0; j < queries.get(i).size()-2; j++){
	        for(int k = queries.get(i).get(j)-1; k <= queries.get(i).get(j+1)-1; k++) {
	          li.set(k,li.get(k) + queries.get(i).get(j+2));
	          System.out.println(li);
	        }
	      }
	    }
	    
	    for(Long l :li){
	      if(max < l) {
	        max = l;
	      }
	    }
	    System.out.println(max);
	   
	}
}
