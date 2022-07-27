package DSA.Basics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Sweet red fruits");
            case "Orange" -> System.out.println("Sour round fruits");
            default -> System.out.println("Enter a valid fruit");
        }
    }
}
