package uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        System.out.println("NOTAS:");
        int[] notas = new int[]{100, 50, 20, 10, 5, 2};

        for (int nota : notas) {
            int numNotas = (int) (valor / nota);
            System.out.println(numNotas + " nota(s) de R$ " + nota + ".00");
            valor -= (nota * numNotas);
        }

        valor *= 100;
        System.out.println("MOEDAS:");
        int[] moedas = new int[]{100, 50, 25, 10, 5, 1};

        for (int moeda : moedas) {
            int numMoedas = (int) (valor / moeda);
            System.out.format(numMoedas + " moeda(s) de R$ %.2f\n", (double) moeda / 100);
            valor -= (moeda * numMoedas);

        }


    }


}
