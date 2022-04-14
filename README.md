# Kata For Fun
## Requirements
Write a program that converts an input number into a string according to the following rules :                                                                       
-If the number is divisible by 3 or contains 3, replace 3 by "Kata";                                                                                                 
-if the number is divisible by 5 or contains 5, replace 5 by "For";                                                                                                 
-if the number contains 7, replace 7 by "Fun".                                                                                                                       
-Divisors have high predecence, the content is analyzed in the order of appearance.                                                                                 
-If no match, return the input number as a string.                                                                                                                   

## Here is a list of examples :
1 should return                                                                                                                                                     
3 should return KataKata                                                                                                                                             
5 should return ForFor                                                                                                                                               
7 should return Fun                                                                                                                                                 
9 should return Kata                                                                                                                                                 
51 should return KataFor                                                                                                                                             
53 should return ForKata                                                                                                                                             
33 should return KataKataKata                                                                                                                                       
27 should return KataFun                                                                                                                                             
15 should return KataForFor                                                                                                                                         

## Prerequisites
In order use the API, you have to install the following software in your computer
	- java version 11
	- maven 3.8.5
## Run the unit tests

In order to run all the unit tests written, simply run the command "mvn clean test" in the root folder of the project

## Run the project

To run the project, first generate the jar file using the command "mvn clean package" in the root folder of the projet

After generating the jar file, run the command: "java -jar target/kataforfun-0.0.1-jar-with-dependencies.jar" in the root folder of the projet. 
Make sure you are running the right jar file

