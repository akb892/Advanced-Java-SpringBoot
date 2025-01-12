package com;

import java.util.function.Function;

public class FunctionDemo implements Function<Integer, Double>{

	@Override
	public Double apply(Integer t) {
		
		
		return t*2.0;
	}

}
