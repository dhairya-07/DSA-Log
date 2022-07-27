package DSA.Basics;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    System.out.println("Sum = " + (num1 + num2));

    // 
    input.close();
  }
}
