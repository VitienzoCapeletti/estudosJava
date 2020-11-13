package metodos;

import java.util.Scanner;

public class CreateCPF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o seu pedido: ");

        soma = sc.nextInt();
        while ( soma != 4 ){
            if (soma == 1){
                alcool++;
            }
            else if (soma == 2){
                gasolina++;
            }
            else if (soma == 3){
                diesel++;
            }
            else {
                soma = sc.nextInt();
            }

            }

            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);

    }

}
