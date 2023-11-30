import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        float num1 = scan.nextInt();
        System.out.println(num1);
        System.out.println("enter second  number");
        float num2 = scan.nextInt();
        System.out.println(num1);
        System.out.println("you have entered: " + num1 + " and " + num2);
        String info = ("0 for add and 1 for - ,2 for * 3 for /");
        System.out.println(info);
        int input = scan.nextInt();
        switch (input) {
            case 0:

                System.out.println("add:");
                System.out.print("the result is :");
                System.out.println(num1 + num2);
                break;
            case 1:

                System.out.println("subtraction");
                System.out.print("the result is : ");

                System.out.println(num1 - num2);
                break;
            case 2:

                System.out.println("multiplication");
                System.out.print("the result is : ");

                System.out.println(num1 * num2);
                break;
            case 3:

                System.out.println("division ");
                System.out.print("the result is : ");

                System.out.println(num1 / num2);
                break;
            default:

                System.out.println("does not match plese give coreect input ");
        }
    }

}
