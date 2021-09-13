/**
 * Javadoc
 * Args[0] is for a name
 */


package Labs;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        if (args.length == 0) {
            requestUsername();
        } else {
            System.out.println("Hello " + args[0]);
        }
        calculateStuff();
    }

    public static void requestUsername() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = in.nextLine();
        System.out.println("Username is: " + userName);

        System.out.println("Hello " + userName);
    }

    public static void calculateStuff() {
        int plusTwo = Math.abs(-2);
    }
}

