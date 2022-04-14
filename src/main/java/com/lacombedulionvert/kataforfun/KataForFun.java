package com.lacombedulionvert.kataforfun;

public class KataForFun {
	
	public String convertInput(int input) {
		StringBuilder result = new StringBuilder();
		//Divisors have a higher precedence, so we start by the divisors rule
		for (Convertor convertor : Convertor.values()) { 
			result.append(convertor.printValueForDivisibleRule(input)); 
		}
		for (Convertor convertor : Convertor.values()) { 
			result.append(convertor.printValueForContainRule(input)); 
		}
		
		return result.length() == 0 ? Integer.toString(input) : result.toString();
	}
}
