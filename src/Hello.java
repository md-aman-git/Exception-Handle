import customexception.AgeException;

import java.util.Scanner;

public class Hello {
    public static void main(String [] args) throws AgeException {
        System.out.println("Hello Exception Example :)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter age : ");
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("You are eligible to vote :)");
        }
        else {
            throw new AgeException("You are not eligible to vote :(");
        }
    }
}
