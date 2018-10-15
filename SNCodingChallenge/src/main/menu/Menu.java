package main.menu;

import java.util.Scanner;

public class Menu {
	
	/**
	 * Method used to display the Welcome message for the application
	 */
	public void showWelcome() {
		System.out.println("***************************************************************");
		System.out.println("*                                                             *");
		System.out.println("*         Welcome to the Springer Paint Application           *");
		System.out.println("*                                                             *");
		System.out.println("***************************************************************");
		System.out.println("*  - To display the complete Help type:                       *");
		System.out.println("*    - H                                                      *");
		System.out.println("***************************************************************");
	}
	
	/**
	 * Method used to display the application help
	 */
	public void showHelp() {
		System.out.println("***************************************************************");
		System.out.println("*                                                             *");
		System.out.println("*       Welcome to the Springer Paint Application help        *");
		System.out.println("*                                                             *");
		System.out.println("***************************************************************");
		System.out.println("* Accepted commands are:                                      *");
		System.out.println("*  - To create a canvas:                                      *");
		System.out.println("*    - C w h                                                  *");
		System.out.println("*      - w is the numeral intent for the width                *");
		System.out.println("*      - h is the numeral intent for the height               *");
		System.out.println("*  - To draw a line in the canvas:                            *");
		System.out.println("*    - L x1 y1 x2 y2                                          *");
		System.out.println("*      - x1 is the x coordinate of the begin of the line      *");
		System.out.println("*      - y1 is the y coordinate of the begin of the line      *");
		System.out.println("*      - x2 is the x coordinate of the end of the line        *");
		System.out.println("*      - y2 is the y coordinate of the end of the line        *");
		System.out.println("*  - To draw a rectangle in the canvas:                       *");
		System.out.println("*    - R x1 y1 x2 y2                                          *");
		System.out.println("*      - x1 is the x coordinate of the begin of the rectangle *");
		System.out.println("*      - y1 is the y coordinate of the begin of the rectangle *");
		System.out.println("*      - x2 is the x coordinate of the end of the rectangle   *");
		System.out.println("*      - y2 is the y coordinate of the end of the rectangle   *");
		System.out.println("*  - To paint the canvas with a bucket tool:                  *");
		System.out.println("*    - B x y c                                                *");
		System.out.println("*      - x is the x coordinate of the point to start painting *");
		System.out.println("*      - y is the y coordinate of the point to start painting *");
		System.out.println("*      - c is the color of the paint                          *");
		System.out.println("*  - To display the Help:                                     *");
		System.out.println("*    - H                                                      *");
		System.out.println("*  - To exit the program:                                     *");
		System.out.println("*    - Q                                                      *");
		System.out.println("***************************************************************");
	}
	
	/**
	 * Method used to show the application menu
	 */
	public void showMenu() {
		Scanner input = new Scanner(System.in);
		String inputString = "";
		
		 while (!inputString.toUpperCase().equals("Q")) {
			System.out.print("Please type your command: ");
			inputString = input.next();

			if (inputString.length() == 0) {
				System.out.println("A command must be informed. ");
			} else if (inputString.toUpperCase().startsWith("C")) {
				executeCommandC(input);
			} else if (inputString.toUpperCase().startsWith("L")) {
				executeCommandL(input);
			} else if (inputString.toUpperCase().startsWith("R")) {
				executeCommandR(input);
			} else if (inputString.toUpperCase().startsWith("B")) {
				executeCommandB(input);
			} else if (inputString.toUpperCase().startsWith("H")) {
				showHelp();
			} else if (inputString.toUpperCase().startsWith("Q")) {
				System.out.print("Bye!");
				input.close();
			} else {
				System.out.println("Your command '" + inputString + "' was not recognized. ");
			}
		}
	}
	
	/**
	 * Executes the command C, that initializes the canvas
	 * @param input Scanner object used to read the user entries
	 * @return boolean true if the command executes successfully
	 */
	private boolean executeCommandC(Scanner input) {
		int[] parameters = new int[2];
		
		for (int i = 0; i < parameters.length; i++) {
			if (input.hasNextInt())
				parameters[i] = input.nextInt();
			else {
				System.out.println("Your command is malformed. Please read the instructions. ");
				return false;
			}
		}
		System.out.println("Executing command C.");
		return true;
	}
	
	/**
	 * Executes the command L, that draw a line
	 * @param input Scanner object used to read the user entries
	 * @return boolean true if the command executes successfully
	 */
	private boolean executeCommandL(Scanner input) {
		int[] parameters = new int[4];
		
		for (int i = 0; i < parameters.length; i++) {
			if (input.hasNextInt())
				parameters[i] = input.nextInt();
			else {
				System.out.println("Your command is malformed. Please read the instructions. ");
				return false;
			}
		}
		System.out.println("Executing command L.");
		return true;
	}
	
	/**
	 * Executes the command R, that draw a rectangle
	 * @param input Scanner object used to read the user entries
	 * @return boolean true if the command executes successfully
	 */
	private boolean executeCommandR(Scanner input) {
		int[] parameters = new int[4];
		
		for (int i = 0; i < parameters.length; i++) {
			if (input.hasNextInt())
				parameters[i] = input.nextInt();
			else {
				System.out.println("Your command is malformed. Please read the instructions. ");
				return false;
			}
		}
		System.out.println("Executing command R.");
		return true;
	}
	
	/**
	 * Executes the command L, that paint with a bucket
	 * @param input Scanner object used to read the user entries
	 * @return boolean true if the command executes successfully
	 */
	private boolean executeCommandB(Scanner input) {
		int[] parameters = new int[3];
		
		for (int i = 0; i < parameters.length; i++) {
			if (input.hasNextInt())
				parameters[i] = input.nextInt();
			else if ((i == 2) && input.hasNext()) {
				parameters[i] = input.next().charAt(0);
			}
			else {
				System.out.println("Your command is malformed. Please read the instructions. ");
				return false;
			}
		}
		System.out.println("Executing command B.");
		return true;
	}
}
