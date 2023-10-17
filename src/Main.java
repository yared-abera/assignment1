import java.util.Scanner;
class Student{
    String name;
    int Age;
    String sex;
    double gpa;



    // Constructor to initialize the object
    Student(String name,int Age, String sex, double gpa) {
        this. name = name;
        this.Age = Age;
        this.sex = sex;
        this.gpa = gpa;
    }

    // Method to display the object's attributes
   public void displayObject() {
        System.out.println("student Attributes:");
        System.out.println("int: " + name);
        System.out.println("double: " + Age);
        System.out.println("char: " + sex);
        System.out.println("boolean: " + gpa);
    }
}



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
        arithmeticOperation(a,b,c);
        relationalOperation();
        logicalOperators();
        forLoop();
        whileLoop();
        switchCase();
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        int Age=scanner. nextInt();
        String sex=scanner.nextLine();
        double gpa=scanner.nextDouble();


        // Create an object of the SampleObject class
        Student stud1= new Student(name, Age, sex,gpa );

        // Demonstrate access to object members
        stud1.displayObject();
        System.out.println("End of program");


    }

    // Variable declaration output
    public static void variableDeclaration() {
        System.out.println("Variable declaration output");
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
    public static void arithmeticOperation(int a,float b,double c) {
        System.out.println("Arithmetic operation output");
        int sum = a + 5; // addition
        float difference = a - b; // subtraction
        float product = b * 4; // multiplication
        double quotient = c / 3; // division
        int modulus = a % 3; // modulus
        int inc = ++a; // increment
        float dec = --b; // decrement

        System.out.println("sum:a + 5 " + sum);
        System.out.println("difference:a - b " + difference);
        System.out.println("product:b * 4 " + product);
        System.out.println("quotient: c / 3 " + quotient);
        System.out.println("modulus: a % 3" + modulus);
        System.out.println("inc: ++a " + inc);
        System.out.println("dec: --b " + dec);
    }

    // Relational operators output

    public static void relationalOperation() {
        System.out.println("Relational operators output");
        System.out.println("b > e: " + (b > e));
        System.out.println("b < e: " + (b < e));
        System.out.println("b >= e: " + (b >= e));
        System.out.println("b <= e: " + (b <= e));
        System.out.println("b == e: " + (b == e));
        System.out.println("b != e: " + (b != e));
    }

    // Logical operators output

    public static void logicalOperators() {
        System.out.println("Logical operators output");
        System.out.println("bool && a > e: " + (bool && a > e));
        System.out.println("bool  a < e: " + (bool || a < e));
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
        System.out.println("The day of the week is: " + dayNumber);
    }

}