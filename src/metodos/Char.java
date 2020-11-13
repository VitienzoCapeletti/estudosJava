package metodos;


import java.util.Scanner;

public class Char {

    private static Object Palavra;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        System.out.println(frase);

        int espaco = 0;
        int vogal = 0;

        for (char caracter : frase.toCharArray()) {
            switch (caracter) {
                case ' ':
                    espaco++;
                    break;
                case'A':
                case'a':
                case'E':
                case'e':
                case'I':
                case'i':
                case'O':
                case'o':
                case'U':
                case'u':
                    vogal++;
            }
        }

        

        System.out.println("Quantidade de espaços: "+ espaco);
        System.out.println("Quantidade de vogais: "+ vogal);
        System.out.println("");



}


    }
