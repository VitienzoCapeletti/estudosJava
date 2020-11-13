package uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class DistanceBeetwenTwoPoints {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distanciax = Math.pow(x2 - x1, 2);
        double distanciay = Math.pow(y2 - y1, 2);
        double distanciaFinal = Math.sqrt(distanciax + distanciay);

        System.out.format( "%.4f\n",distanciaFinal);


    }
}
