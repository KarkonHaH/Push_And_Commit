import java.util.*;

public class SumInput {
    public static void main(String[] args) {
        try (Scanner Number = new Scanner(System.in)) {
            System.out.print("Enter Number 1: ");
            int Number1 = Number.nextInt();

            System.out.print("Enter Number 2: ");
            int Number2 = Number.nextInt();

            int Total = Number1 + Number2;

            System.out.println("The Sum of Number1 and Number2 is " + Total);
        }
    }
}
