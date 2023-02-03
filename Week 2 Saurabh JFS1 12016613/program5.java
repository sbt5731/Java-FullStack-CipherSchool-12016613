import java.util.InputMismatchException;
import java.util.Scanner;

public class program5 {
    int n1, n2, result;
    Scanner sc = new Scanner(System.in);

    void calculate() {
        try {
            System.out.println("Enter first number: ");
            n1 = sc.nextInt();
            System.out.println("Enter second number: ");
            n2 = sc.nextInt();

            if(n2==0){
                throw new ArithmeticException();
            }
            result = n1/n2;
        }
        catch (InputMismatchException ime) {
            System.out.println("Ouch !! Exception detected");
        }
        catch (ArithmeticException ae){
            System.out.println("Ouch !! Exception detected");
        }
        finally {
            System.out.println("The division is: " + result);
        }
    }

    public static void main(String[] args) {
        program5 obj = new program5();
        obj.calculate();
    }
}
