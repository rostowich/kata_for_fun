package com.lacombedulionvert.kataforfun;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class KataForFunTest {

	private KataForFun KataForFun;
	
	@Before
	public void setup() throws Exception {
		KataForFun = new KataForFun();
	}
	
	@Test
	public void take_basic_exemple_should_return_values() throws Exception{
		assertThat(KataForFun.convertInput(1)).isEqualTo("1");
		assertThat(KataForFun.convertInput(2)).isEqualTo("2");
		assertThat(KataForFun.convertInput(3)).isEqualTo("KataKata");
		assertThat(KataForFun.convertInput(5)).isEqualTo("ForFor");
		assertThat(KataForFun.convertInput(7)).isEqualTo("Fun");
		assertThat(KataForFun.convertInput(9)).isEqualTo("Kata");
		assertThat(KataForFun.convertInput(51)).isEqualTo("KataFor");
		assertThat(KataForFun.convertInput(53)).isEqualTo("KataFor");
		assertThat(KataForFun.convertInput(33)).isEqualTo("KataKataKata");
		assertThat(KataForFun.convertInput(27)).isEqualTo("KataFun");
		assertThat(KataForFun.convertInput(15)).isEqualTo("KataForFor");
		assertThat(KataForFun.convertInput(35)).isEqualTo("ForKataFor");
	}
}
