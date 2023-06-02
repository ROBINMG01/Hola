import java.util.Scanner;

public class archivo1{

    public static void main(String[] args) {
        
        System.out.println("HOLA MUNDO");

        System.out.println("ACTUALIZANDO CAMBIOS");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the firts number");
        int num1 = input.nextInt();

        System.out.println("Enter the second number");
        int num2 = input.nextInt();

        System.out.println("The result of substraction is: "+suma(num1, num2));
    }

    public static int suma(int num1, int num2){

        return num1-num2;
    }
}