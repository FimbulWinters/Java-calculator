import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean more = true;


        while (more) {
            System.out.println("What would you like to do? (a or s, or x to exit) ");
            String choice = scanner.next();
            if (choice.equals("x")) {
                System.out.println("thanks for using this calculator");
                more = false;
                break;
            } else {
                System.out.println("enter first number...");
                int num1 = scanner.nextInt();
                System.out.println("enter second number...");
                int num2 = scanner.nextInt();


                if (choice.equals("a")) {
                    System.out.println(calc.add(num1, num2));
                    System.out.println("would you like to try another calculation? (y or n");
                    String another = scanner.next();
                    if(another.equals("n")) {
                        more = false;
                        System.out.println("thanks for using this calculator");
                    }
                } else if (choice.equals("s")) {
                    System.out.println(calc.subtract(num1, num2));
                    System.out.println("would you like to try another calculation? (y or n");
                    String another = scanner.next();
                    if(another.equals("n")) {
                        more = false;
                        System.out.println("thanks for using this calculator");
                    }
                } else  {
                    System.out.println("invalid choice");
                }
            }

        }

    }
}