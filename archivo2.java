import java.util.Scanner;

public class archivo2 {
    public static void main(String[] args) {
        
        System.out.println("HOLA MUNDO DOS");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the firts number");
        int num1 = input.nextInt();

        System.out.println("Enter the second number");
        int num2 = input.nextInt();

        System.out.println("The result of sum is: "+suma(num1, num2));
    }

    public static int suma(int num1, int num2){

        return num1+num2;
    }
}
