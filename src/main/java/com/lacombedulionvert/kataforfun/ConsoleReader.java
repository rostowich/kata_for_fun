package com.lacombedulionvert.kataforfun;

import java.util.Scanner;

public class ConsoleReader {

	private final Scanner scanner;
		
	public ConsoleReader(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public int readValue() throws NumberFormatException{
		return Integer.parseInt(scanner.nextLine());
	}
}
