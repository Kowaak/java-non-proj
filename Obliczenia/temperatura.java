import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj temperature w \u00B0C : ");
        double t = input.nextDouble();
        System.out.printf(" %.1f\u00B0C =%.1f\u00B0F ",t,t*1.8+32);
    }
}