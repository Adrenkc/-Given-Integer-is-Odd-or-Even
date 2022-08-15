import java.util.Scanner;

public class Integer_Odd_Even {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                System.out.print("Enter your number!!!: ");
        int number = reader.nextInt();
        if(number % 2 == 0)
            System.out.print(number + "  Your number is even ");
        else
            System.out.print(number + "  Your number is odd ");

        System.out.println("Thanks!");
    }

    private static void ifelse(boolean b) {
    }
}