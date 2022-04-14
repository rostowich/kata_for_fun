package com.lacombedulionvert.kataforfun;

import java.io.PrintStream;

public class ConsolePrinter {

	private final PrintStream printStream;

	public ConsolePrinter(PrintStream printStream) {
		super();
		this.printStream = printStream;
	}
	
	public void printValue(String value) {
		printStream.println(value);
	}
}
