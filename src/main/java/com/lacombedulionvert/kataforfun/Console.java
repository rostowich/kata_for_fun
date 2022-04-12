package com.lacombedulionvert.kataforfun;

import java.io.PrintStream;
import java.util.Scanner;

public class Console {

	private PrintStream printStream = System.out; 
	
	private Scanner scanner = new Scanner(System.in);
	
	private int readAndCheckValue(String prompt) {
		printStream.println(prompt);
        boolean tryAgain;
        int value = 0;

        do {
            try {
                value =  Integer.parseInt(scanner.nextLine());
                tryAgain = false;
            } catch (Exception exception) {
            	scanner.nextLine();
            	printStream.println("Please enter a valid input");
            	printStream.println(prompt);
                tryAgain = true;
            }
        }
        while (tryAgain);

        return value;
    }
	
	public void startKataForFun() throws NumberFormatException {
    	printStream.println("********************************************************************");
    	printStream.println("********** WELCOME TO KATA FOR FUN. LET'S START  ************");
    	printStream.println("To stop the application enter 0");
    	
    	printStream.println("********************************************************************");
    	printStream.println("                 ");
        int command = readAndCheckValue("Proceed with the command. Exit with 0?");
       
        boolean endOfTheGame = false;
		KataForFun kataForFun = new KataForFun();
        do {
        	if(command == 0) {
        		endOfTheGame = true;
        	}else {
        		
        		printStream.println("Result == "+kataForFun.convertInput(command));
        	}   
        	command = readAndCheckValue("Proceed with the command?");
        }
        while (!endOfTheGame);

        	printStream.println("####################");
        	printStream.println("# Goodbye #");
        	printStream.println("####################");
        
    }
	
	
}
