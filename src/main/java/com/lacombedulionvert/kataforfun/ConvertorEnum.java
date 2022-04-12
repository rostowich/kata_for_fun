package com.lacombedulionvert.kataforfun;

import org.apache.commons.lang3.StringUtils;

public enum ConvertorEnum {

	KATA(3, "Kata"),
	FOR(5, "For"),
	FUN(7, "Fun"){
		@Override
		public String printValueForDivisibleRule(int output) {
			return "";
		}
	};
	
	private int number;
	
	private String value;

    private ConvertorEnum(int number, String value) {
		this.number = number;
		this.value = value;
	}
		
	public String printValueForDivisibleRule(int input) {		
		return isDivisible(input) ? value : "";		
	}
	
	public String printValueForContainRule(int input) {
		int occurrenceCount = occurrenceOf(input, number);
		return StringUtils.repeat(value, occurrenceCount);
	}
	
	private boolean isDivisible (int input) {
		return input % number == 0;
	}
	
	private int occurrenceOf(Integer number, Integer subNumber) {
		return StringUtils.countMatches(String.valueOf(number),
				String.valueOf(subNumber));
	}
}
