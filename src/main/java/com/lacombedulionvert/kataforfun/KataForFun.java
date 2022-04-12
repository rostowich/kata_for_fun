package com.lacombedulionvert.kataforfun;

public class KataForFun {
	
	public String convertInput(int input) {
		StringBuilder result = new StringBuilder();
		//Divisors have a higher predecence, so we start by the divisors rule
		for (ConvertorEnum convertor : ConvertorEnum.values()) { 
			result.append(convertor.printValueForDivisibleRule(input)); 
		}
		for (ConvertorEnum convertor : ConvertorEnum.values()) { 
			result.append(convertor.printValueForContainRule(input)); 
		}
		
		return result.length() == 0 ? Integer.toString(input) : result.toString();
	}
}
