package uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        double salario = sc.nextDouble();
        double vVendido = sc.nextDouble();
        double salarioComicionado = (vVendido * 0.15) + salario;

        System.out.format("TOTAL = R$ %.2f\n", salarioComicionado);

    }
}
