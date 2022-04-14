package com.lacombedulionvert.kataforfun;

import java.util.stream.Stream;

public class Convertor {
	
	public String convertInput(int input) {
		StringBuilder result = new StringBuilder();
		//Divisors have a higher precedence, so we start by the divisors rule
		Stream.of(KataForFun.values()).forEach(
				(convertor -> result.append(convertor.printValueForDivisibleRule(input)))
		);

		Stream.of(KataForFun.values()).forEach(
				(convertor -> result.append(convertor.printValueForContainRule(input)))
		);
		
		return result.length() == 0 ? Integer.toString(input) : result.toString();
	}
}
