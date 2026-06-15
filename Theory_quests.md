package JAVA_DAY_10;
/*
 * 1)Explain Java Exception hierarchy: Throwable, Exception, Error. Give one example for each.

ANS:- The Java Exception hierarchy can be concluded as, the 'Throwable' being a root or super class rather the default class for any exception found and thrown out as an exception, which is then subdivided into two other classes which is one being 'Exception' class and the other being the 'Error' class. The 'Error' class handles issues which deals with the data obeing non-recoverable or having issues in systems faultiness or logical errors. The 'Exception' class deals with issues that mainly cause runtime error's or issues related to datatypes which are inputed or in string FOR EXAMPLE: Throwable - java.lang.Throwable Error - java.io.IOException Exception - java.lang.ArithmeticException

2)Can we have multiple catch blocks? Explain with example when it is useful.

ANS:- Yes multiple catch blocks can be used, when a program can have multiple type of errors or exceptions in it. Such as in case of a single program involving cases of ( int result= 10/0 ) OR (Array index being out of range) used in a single problem then after one try block there can be multiple catch blocks of "ArithmeticException" and a "ArrayIndexOutOfBoundsException" too. Its useful specific error resolution, separating critical and minor errors and also knowing the order in which the exception comes.

3)A program crashes when user enters text instead of number. What exception occurs? How will you handle it? Where should try-catch be placed?

ANS:- When a user enters a text instead of number, the exception that occurs is "InputMismatchException". To handle this error, we should loop the input condition infinitely until it gets a correct input, using the try-catch blocks to prevent them escalating into exception. try-catch, should be placed where the input from the user is being asked and just below that using catch write the type of exception and the message of what type of error and add continue to loop it until the user inputs the correct input.

4)try { int a = 10 / 0; System.out.println("Hello"); } catch(Exception e) { System.out.println("Error handled"); } System.out.println("End"); Predict the output - What prints first? Does program stop?

ANS:- 'Error handled', is printed first. The program executes properly, and stop after priting both 'Error handled' and then 'End'./
 */
