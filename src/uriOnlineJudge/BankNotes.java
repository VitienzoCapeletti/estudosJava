package uriOnlineJudge;

import java.util.Scanner;

public class BankNotes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        System.out.println(valor);

        int[] notas = new int[]{100, 50, 20, 10, 5, 2};

        for (int nota : notas) {
            int numNotas = valor / nota;
            System.out.println(numNotas + " nota(s) de R$ " + nota + ",00");
            valor -= (nota * numNotas);
        }
    }
}
