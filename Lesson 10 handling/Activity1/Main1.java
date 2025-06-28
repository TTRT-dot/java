import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter two numbers");
            float x = sc.nextInt();
            float y = sc.nextInt();
            float z = x / y;
            System.out.println(x+"/"+y+"="+z);
        }
        catch (ArithmeticException ex) {
            System.out.println("---Catch Block---");
            System.out.println(ex.toString());
        } finally {
            System.out.println("----Final block----");
            System.out.println("Application Designed and developed by");
            System.out.println("Someone");
            sc.close();
        }
        System.out.println("Program complete");
    }
}