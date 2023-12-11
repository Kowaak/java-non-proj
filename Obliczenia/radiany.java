import java.util.Scanner;
import java.lang.Math;

public class radiany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tne program zamienia radiany na stopnie i na odwrót");
        System.out.print("1 - radiany na stopnie, 2 stopnie na radiany: ");
        int wybor = input.nextInt();
        if(wybor == 1){
            System.out.print("Podaj ilość radianów: ");
            double radiany = input.nextDouble();
            System.out.println("To jest "+Math.toDegrees(radiany)+" stopni");
        } else if (wybor == 2) {
            System.out.print("Podaj ilość stopni: ");
            double stopnie = input.nextDouble();
            System.out.println("To jest "+Math.toRadians(stopnie)+" radianów");
        }else {
            System.out.println("Podaj prawidłową cyfre");
        }
    }
}