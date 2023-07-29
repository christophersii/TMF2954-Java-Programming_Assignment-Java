import java.util.Scanner;											//import the Scanner class

public class Assignment {
    public static void main (String[]args) {
        SecretCode s1 = new SecretCode();										//Create object of class SecretCode
        Scanner input = new Scanner(System.in);						//Create a Scanner object

        do {														// if this condition is not met, prompt user for a new input.
            System.out.print("\nPlease enter lower case consonants, numbers from 1-5 or whitespace ONLY");
            System.out.print("\nEnter string:");						//Accept a string literal
            s1.setInString(input.nextLine());
        }
        while (!s1.checkStringValidity(s1.getInString())); {	//Perform a check to ensure the String literal ONLY contain consonants, numbers 1-5 or whitespace
            System.out.print("inString: ");
            System.out.println(s1.getInString());
            System.out.print("len: ");
            System.out.println(s1.getStringLen(s1.getInString()));					//Compute the number of characters inside inString, excluding whitespace(s)
            System.out.print("outString: ");
            System.out.println(s1.shiftChr(s1.getInString(),s1.getStringLen(s1.getInString())));
        }
    }
}