import java.util.Scanner;

public class Objective4Lab2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int num1, num2, num3;
        double dub1, dub2, dub3;
        
        System.out.println("Enter three integers:");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();
        
        int sumIntegers = num1 + num2 + num3;

        System.out.println("Sum of the three integers: " + sumIntegers);
        
        System.out.println("Enter three doubles:");
        dub1 = keyboard.nextDouble();
        dub2 = keyboard.nextDouble();
        dub3 = keyboard.nextDouble();

        double sumDoubles = dub1 + dub2 + dub3;

        System.out.println("Sum of the three doubles: " + sumDoubles);
    }
}