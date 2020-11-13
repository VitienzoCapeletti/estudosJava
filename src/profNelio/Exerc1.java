package profNelio;

import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0){
            imposto = 0.0;
        }
        else if ( salario <= 3000.0){
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0){
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if ( imposto == 0.0){
            System.out.println("Isento.");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

    }
}


//        int codigo = sc.nextInt();
//        int quantidade = sc.nextInt();
//        double total = 0;
//
//        while (codigo != 6) {
//            if (codigo == 1) {
//                total = quantidade + 4.0;
//            } else if (codigo == 2) {
//                total = quantidade + 4.5;
//            } else if (codigo == 3) {
//                total = quantidade + 5.0;
//            } else if (codigo == 4) {
//                total = quantidade + 2.0;
//            } else if (codigo == 5) {
//                total = quantidade + 1.5;
//            } else if (codigo < 1 || codigo > 6) {
//                return;
//            } else {
//
//            }
//            System.out.println("Total: R$" + total);
//        }
//
//    }
//
//        }


//        int numero [] = new int[2];
//
//       numero[1] = sc.nextInt();
//       numero[2] = sc.nextInt();
//
//       if ((numero[1] % numero[2]) == 0 || (numero[2] % numero[1]) == 0){
//           System.out.println("São múltiplos.");
//       }
//       else {
//           System.out.println("Não são múltiplos.");
//       }



    // sc.nextLine().split(" ")

//        for (posicao=0; posicao<5; posicao++ ) {
//            System.out.println("Declare um número: ");
//            numeros [posicao] = sc.nextInt();
//            System.out.println(posicao);
//
//            if ((numeros [posicao] % 2) == 0) {
//                System.out.println("Número par!");
//            } else {
//                System.out.println("Numero ímpar!");
//            }
//        }




