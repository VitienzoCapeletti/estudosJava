package uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int quantidade1 = sc.nextInt();
        float valor1 = sc.nextFloat();
        int cod2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        float valor2 = sc.nextFloat();

        float total = (quantidade1*valor1) + (quantidade2*valor2);

        System.out.format("VALOR A PAGAR: R$ %.2f\n",total);

    }
}
