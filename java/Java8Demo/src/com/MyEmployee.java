package com;

import java.util.function.Consumer;

public class MyEmployee {
	
	public void printEmployee(Employee e) {
		System.out.println(e);
	}
}


class MyConsumer implements Consumer<Employee> {

	@Override
	public void accept(Employee t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}
