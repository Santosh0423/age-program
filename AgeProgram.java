// AgeProgram.java
// this program asks user for the age 
// this tells them their age catefory
// Example used for Git and GitHub exercise.

import java.util.Scanner;

public class AgeProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask user for their age
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        // Check age category
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 20) {
            System.out.println("You are a teenager.");
        } else if (age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior.");
        }

        in.close();
    }
}
