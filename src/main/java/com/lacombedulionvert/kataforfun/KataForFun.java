package com.lacombedulionvert.kataforfun;

import org.apache.commons.lang3.StringUtils;

public enum KataForFun {

	KATA(3, "Kata"),
	FOR(5, "For"),
	FUN(7, "Fun"){
		@Override
		public boolean isDivisible(int output) {
			return false;
		}
	};
	
	private final int number;
	
	private final String value;

    KataForFun(int number, String value) {
		this.number = number;
		this.value = value;
	}
		
	public String printValueForDivisibleRule(int input) {		
		return isDivisible(input) ? value : "";		
	}
	
	public String printValueForContainRule(int input) {
		return contain(input) == 0 ? "" : StringUtils.repeat(value, contain(input));
	}
	
	public boolean isDivisible (int input) {
		return input % number == 0;
	}

	public int contain(int input){
		return StringUtils.countMatches(String.valueOf(input), String.valueOf(number));
	}

}
