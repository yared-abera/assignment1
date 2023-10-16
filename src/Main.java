import java.util.Scanner;
public class Main {
    // Variable declaration
    static int a = 23;
    static float b = 34.3F;
    static double c = 6.8;
    static byte d= 74;
    static short e= 32;
    static long  f= 334L;
    static char letter = 'A';
    static boolean bool = true;

    public static void main(String[] args) {
        System.out.println("This code will contain some fundamental concepts in the Java programming language.");
        variableDeclaration();
        arithmeticOperation();
        relationalOperation();
        logicalOperators();
        forLoop();
        whileLoop();
        switchCase();
        System.out.println("End of program");
    }

    // Variable declaration output
    public static void variableDeclaration() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c );
        System.out.println("d: " + d);
        System.out.println("e: " +e);
        System.out.println("f: " + f);
        System.out.println("letter: " +letter);
        System.out.println("bool: " + bool);
    }

    // Arithmetic operation output
    public static void arithmeticOperation() {
        int sum = a + 5; // addition
        float difference = a - b; // subtraction
        float product = b * 4; // multiplication
        double quotient = c / 3; // division
        int modulus = a % 3; // modulus
        int inc = ++a; // increment
        float dec = --b; // decrement

        System.out.println("sum: " + sum);
        System.out.println("difference: " + difference);
        System.out.println("product: " + product);
        System.out.println("quotient: " + quotient);
        System.out.println("modulus: " + modulus);
        System.out.println("inc: " + inc);
        System.out.println("dec: " + dec);
    }

    // Relational operators output

    public static void relationalOperation() {
        System.out.println("Relational operators output");
        System.out.println("b > s: " + (b > e));
        System.out.println("b < s: " + (b < e));
        System.out.println("b >= s: " + (b >= e));
        System.out.println("b <= s: " + (b <= e));
        System.out.println("b == s: " + (b == e));
        System.out.println("b != s: " + (b != e));
    }

    // Logical operators output

    public static void logicalOperators() {
        System.out.println("Logical operators output");
        System.out.println("bool && a > e: " + (bool && a > e));
        System.out.println("bool  num < s: " + (bool || a < e));
        System.out.println("!bool: " + !bool);
    }

    // For loop
    ;
    public static void forLoop() {
        System.out.println("this is for loop code that display the triangle made of star");
        for (int i = 1; i <= 5; i++) {
            for(int j=i;j<=5;j++)
                System.out.print(" ");
            for(int j=1;j<i;j++)
                System.out.print("*");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // While loop
    public static void whileLoop() {
        System.out.println("this is  whileloop code that iterate 5 times and display the text ");
        int i = 1;
        while (i <= 5) {
            System.out.println("my first java code");
            i++;
        }
    }

    // If-else statement
    public static void ifElseStatement() {
        if (a> b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }
    }

    // Switch-case
    public static void switchCase() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1 to 7) to display the day of the week: ");
        int dayNumber = scanner.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}