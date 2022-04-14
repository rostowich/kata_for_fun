package com.lacombedulionvert.kataforfun;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class KataForFunTest {

	private KataForFun KataForFun;

	@BeforeEach
	public void setup() {
		KataForFun = new KataForFun();
	}

	@DisplayName("Should take a list of integer and test its converted values")
	@ParameterizedTest
	@CsvSource({"1,1", "2,2", "3,KataKata", "5,ForFor", "7,Fun", "9,Kata",
			"51,KataFor", "53,KataFor", "33,KataKataKata", "27,KataFun", "15,KataForFor",
			"35,ForKataFor"})
	void take_basic_example_should_return_values(String input, String expected){

		int inputValue = Integer.parseInt(input);

		String result = KataForFun.convertInput(inputValue);

		assertThat(result).isEqualTo(expected);
	}
}
