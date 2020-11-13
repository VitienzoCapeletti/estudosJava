package uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class FuelSpent {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempoViagem = sc.nextInt();
        int velocidadeMedia = sc.nextInt();
        double distancia = tempoViagem * velocidadeMedia;
        double gasolina = distancia / 12;

        System.out.format("%.3f\n", gasolina);


    }
}
