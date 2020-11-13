package maisPrati;

import java.util.Scanner;

public class ZeroOuUm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            sc.nextLine();


            if (a == b && b == c) {
                System.out.println("*");
            } else if (b == c) {
                System.out.println("A");
            } else if (a == c) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
    }
}
