package com.lacombedulionvert.kataforfun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ConsolePrinter  consolePrinter = new ConsolePrinter(System.out);
		ConsoleReader consoleReader = new ConsoleReader(new Scanner(System.in));
		Convertor processor = new Convertor();
		ApplicationView game = new ApplicationView(consolePrinter, consoleReader, processor);
		game.startKataForFun();
	}
}
