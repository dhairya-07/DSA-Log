package DSA.Basics;

import java.util.Scanner;

public class Occurrance {

  public static void main(String[] args) {
    System.out.println("Enter the number and whose occurrance to be found");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int digit = input.nextInt();
    int temp = num;
    int count = 0;
    while (temp > 0) {
      int rem = temp % 10;
      if (rem == digit) count++;
      temp = temp / 10;
    }
    System.out.println(digit + " occurred " + count + " times");
    input.close();
  }
}
