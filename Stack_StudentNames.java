/**
 * Create a program that will input 10 different student names and
 * display the last name that you entered from the stack.
 */

import java.util.*;

public class Stack_StudentNames {
    public static void main(String[] args) {
        Stack <String> stackNames = new Stack <String>();
        Scanner input = new Scanner(System.in);
        String strStudentName;
        
        System.out.print("\n\n");
        for(int intIteration = 1; intIteration <= 10; intIteration++){
            System.out.print("Enter student name " + intIteration + ": ");
            strStudentName = input.nextLine();
            stackNames.add(strStudentName);
        }

        System.out.println("\nStack: " + stackNames);
        System.out.println("\n\tThe last name entered is: " + stackNames.lastElement());

        input.close();
    }
}