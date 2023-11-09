import java.util.Scanner;

public class binarny {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int l = input.nextInt();
        System.out.println("Binarnie: "+Integer.toBinaryString(l));
        System.out.println("Osemka: "+Integer.toOctalString(l));
        System.out.println("Szesnastkowy: "+Integer.toHexString(l));
    }
}