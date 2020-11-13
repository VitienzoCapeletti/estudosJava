package uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int segundos = sc.nextInt();

        int hora = segundos / 3600;
        segundos -= hora * 3600;
        int minuto = segundos / 60;
        segundos -= minuto * 60;

        System.out.println(hora+":"+minuto+":"+segundos);










    }
}
