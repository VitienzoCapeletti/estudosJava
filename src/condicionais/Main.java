package condicionais;

import java.util.Scanner;

public class Main {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


    String frase = sc.nextLine();
    System.out.println(frase);

    int espaco = 0;
    int vogal = 0;
    String palavra;
    for (char caracter : frase.toCharArray()) {
        switch (caracter) {
            case ' ':
                espaco++;
                break;
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                vogal++;
        }
    }

    System.out.println("Número de espaços: " + espaco);
    System.out.println("Número de vogais:" + vogal);

}
}
