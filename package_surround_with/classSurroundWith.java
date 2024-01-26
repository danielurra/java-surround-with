package package_surround_with;

import java.util.Scanner;
public class classSurroundWith {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner dannyScanner = new Scanner(System.in);
        String nombreIngresado = dannyScanner.nextLine();

        if (nombreIngresado.equals("Carlos")) {
            System.out.println("Hello, " + nombreIngresado);
        }
    }
}
