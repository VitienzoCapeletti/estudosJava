package metodos;

import java.util.Scanner;

public class PostoGaso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int numero = sc.nextInt();

        while (numero != 4 ){
            if (numero == 1){
                alcool++;
            }
            else if (numero == 2){
                gasolina++;
            }
            else if (numero == 3) {
                diesel++;
            }

            numero = sc.nextInt();
        }

        System.out.println("Alcool :" + alcool);
        System.out.println("Gasolina :" + gasolina);
        System.out.println("Diesel :" + diesel);
        System.out.println("MUITO OBRIGADO!");

    }
}
