package uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class Salário {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int numFuncionario = sc.nextInt();
        double horasTrabalhadas = sc.nextDouble();
        double valorHora = sc.nextDouble();
        double salário = horasTrabalhadas * valorHora;


        System.out.println("NUMBER = "+ numFuncionario);
        System.out.format("SALARY = U$ %.2f\n", salário);


    }
}
