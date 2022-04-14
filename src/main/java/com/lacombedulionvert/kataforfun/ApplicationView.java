package com.lacombedulionvert.kataforfun;

public class ApplicationView {

	private final ConsolePrinter consolePrinter;
	
	private final ConsoleReader consoleReader;
	
	private final KataForFun processor;
	
	public ApplicationView(ConsolePrinter consolePrinter, ConsoleReader consoleReader, KataForFun processor) {
		this.consolePrinter = consolePrinter;
		this.consoleReader = consoleReader;
		this.processor = processor;
	}

	public void startKataForFun() {
		consolePrinter.printValue("********************************************************************");
		consolePrinter.printValue("********** WELCOME TO KATA FOR FUN. LET'S START  ************");
		consolePrinter.printValue("To stop the application enter 0");
    	
		consolePrinter.printValue("********************************************************************");
		consolePrinter.printValue("                 ");
        int command = displayAndCheckValue("Proceed with the command. Exit with 0");
       
        boolean endOfTheGame = false;
        do {
        	if(command == 0) {
        		endOfTheGame = true;
        	}else {
        		
        		consolePrinter.printValue("Result == "+processor.convertInput(command));
        		command = displayAndCheckValue("Proceed with the command?");
        	}   
        	
        }
        while (!endOfTheGame);

        consolePrinter.printValue("####################");
        consolePrinter.printValue("# Goodbye #");
        consolePrinter.printValue("####################");       
    }
	
	private int displayAndCheckValue(String prompt) {
		consolePrinter.printValue(prompt);
        boolean tryAgain;
        int value = 0;

        do {
            try {
                value =  consoleReader.readValue();
                tryAgain = false;
            } catch (NumberFormatException exception) {
            	consolePrinter.printValue("Please enter a valid input");
                tryAgain = true;
            }
        }
        while (tryAgain);

        return value;
    }
}
