/**

* This program with reverse a string entered by the user recursively.

*

* @author  Laura Duffley

* @version 1.0

* @since   2022-03-28

*/

// import scanner
import java.util.Scanner;

public class Unit201 {

// function to reverse the string that the user enters
    public static void main(String[] args) {
        String str;
        // user entry
        System.out.println("Please enter the text you would like to be reversed: ");
        // new scanner
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();
        String reversed = reverseString(str);
        // display reversed string
        System.out.println("The reversed string is: " + reversed);
    }

    // method not attached to a specific instance
    public static String reverseString(String str)
    {
        // check for empty sting
        if (str.isEmpty())
        // return string
            return str;
        // call function recursively (line from https://beginnersbook.com/2017/09/java-program-to-reverse-a-string-using-recursion/)
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
