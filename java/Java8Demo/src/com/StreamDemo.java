package com;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Integer arr[] = {4,6,9,54,21,2,1,5};
		Stream<Integer> s = Arrays.stream(arr);
		
//		s.forEach(i->System.out.println(i));
//		Predicate<Integer> p = i->i<10;
//		s.filter(p).forEach(i->System.out.println(i));
		
//		s.filter(i-> i>10).forEach(i->System.out.println(i));
		
//		s.map(x->x*2).forEach(System.out::println);
		
//		s.map(new FunctionDemo()).forEach(i->System.out.println(i));
		
//		s.map(x->Math.pow(x, 2)).forEach(System.out::println);
		
		
//		int max = s.max((i,i1)->i.compareTo(i1)).get();
//		System.out.println(max);
//		int min = s.min((i,i1)->i.compareTo(i1)).get();
//		System.out.println(min);
		
		int sum = s.reduce((i,i1)-> i>i1 ? i:i1).get();
		System.out.println(sum);
		
	}
}
