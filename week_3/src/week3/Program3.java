// Program 1: How Old

package week3;

import java.util.Scanner;

public class Program3 {

    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
    	
//		Initialize variables.
        int s;
        
//      Get user's age.
        System.out.print("How old are you? ");
        s = userinput.nextInt();
        userinput.nextLine();
        
//      Print evaluation of age.
        System.out.println("In 5 years you will be " + (s + 5) + " years old.");
        System.out.println("It is " + ((s < 20) && (s > 12)) +" that you are a teenager.");
        System.out.println("I am such a smart computer.");

	}

}
