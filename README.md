# Java surround-with IntelliJ idea IDE
Surround a piece of code with common language contructs like if, try-catch, etc<br>
## Keyboard shortcut
<img width="292" alt="1 ctrl_alt_t_no-background" src="https://github.com/danielurra/java-surround-with/assets/51704179/ebee2f25-c6a5-4723-8245-c445a0727a55"><br>
## Grab the code
```java
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
```
