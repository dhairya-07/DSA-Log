package DSA.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
//        BasicFunctionality();
//        prettyPrinting();
//        Operators();
//        Perfomance();
//        SB();
        Methods();
    }

    static void BasicFunctionality() {
        String a = "Dhairya";
        String b = "Dhairya";
//        This will give true because both are pointing to the same object in the heap
        System.out.println("Are the 2 pointing to the same object: " + (a == b));

//        If you want to create 2 different string objects of the same value in heap
//        == is a comparator and .equals is a method of the String class
        String c = new String("Harsh");
        String d = new String("Harsh");
//        Now this will give false because both are pointing to different objects
        System.out.println("Are the 2 pointing to the same object " + (c == d));

//        Agar sirf value check hai to use .equals
        System.out.println("Are the values of c and d equal: " + c.equals(d));
    }

    static void prettyPrinting() {
        float a = 435.146345f;

//        Will print till 2 decimal places and will also round off the value
        System.out.printf("Formatted number is %.2f\n", a);

        System.out.printf("PI: %.4f\n", Math.PI);

        System.out.printf("Hello my name is %s and I am %s\n", "Dhairya", "Cool");
    }

    static void Operators() {
//        Addind the ASCII values and printing the integer
        System.out.println('a' + 'b');

//        Adding the ASCII values and printing the character
        System.out.println((char) ('a' + 3));

//        Concatenating the strings
        System.out.println("a" + "b");
        System.out.println("c" + 'd');

//        Gives a concatenated strings
//        Here the integer 1 will be converted to Integer(wrapper) class and that wrapper class will call .toString()
        System.out.println("a" + 1);

//        ArraysList ka toString() will be called and will be converted to string
//        Koi bhi object hoga uska toString() call kiya jayega or use convert kiya jaega
        System.out.println(new ArrayList<>());
        System.out.println("Dhairya " + new Integer(21));

//   VV IMP:   " + " operator in Java is only for primitives and is overloaded for strings
//        This will throw an error
//        System.out.println(new Integer(21) + new ArrayList<>());

//        Atleast 1 bhi string object ho jaye baaki jitne marzi complex objects dalte raho tabhi + kaam karega
//        Jab bhi + use karo to if any of the object is a string object the ans of the expression will be a string
        String ans = new Integer(21) + " " + new ArrayList<>();
        System.out.println(ans);
    }

    static void Perfomance() {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
//        System.out.println(ch);
//        Both will print the same thing bass isme series me concatenate hone ke liye ch will be converted to a string
            series += ch;
        }
        System.out.println(series);

//        Series me add karna acha tareeka isliye nahi hai bcoz everytime you add to series a new object is created
//        bcoz strings are immutable to add karte time a new object is created jaise "a"+'b' = "ab" is a new object
//        to space khayega daba ke
//        Is problem ka solution hai String Builder
    }

    static void SB() {
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
//            Here we are not creating a new object everytime we are appending in the same string
            series.append(ch + " ");
        }
        System.out.println(series);
    }

    static void Methods() {
        String name = "DHAIRYA SRIVASTAVA";
        String name1 = "Dhairya Srivasyava Hello World";

//        .toCharArray will convert the string to character array and then us array to .toStrings se print kar liya
        System.out.println(Arrays.toString(name.toCharArray()));

//        This will create a new object jisme sab lower case elements honge
        System.out.println(name.toLowerCase());
//        .toLowerCase() ne alag ek object banaya or print kara but this did not affect the original name
        System.out.println(name);

//      Will print the index of the first appearance of 'a' in the string
        System.out.println(name.indexOf('A'));
        System.out.println(name.lastIndexOf('A'));

//        Strips the white spaces
//        .strip() is better than trim bcoz wo trim ka updated version keh sakte ho baki net se dekhlo
        System.out.println("    Dhairya    ".strip());
        System.out.println("   Dhairya ".trim());

//        Split the string from whatever arguement is passed jaise yaha arguement/regex is " "(space) to isne string me
//        jaha jaha space tha waha se split karke array me bhar diya
        System.out.println(Arrays.toString(name1.split(" ")));
    }

}
