package maisPrati;

import java.util.Scanner;

public class Escalator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int execucoesRestantes = 30;
        System.out.println("Informe os dados:\n");
        while (execucoesRestantes>0) {
            int numPessoas = sc.nextInt();
            sc.nextLine();

            if (numPessoas == 0){
                break;
            }

            if (1 > numPessoas || numPessoas > 100) {

                System.err.println("Número inválido");
                System.exit(1);
            }

            int[] tempos = new int[numPessoas];

            for (int i = 0; i < numPessoas; i++) {
                int horaPessoa = sc.nextInt();
                if (1 > horaPessoa || horaPessoa > 1000) {
                    System.err.println("Tempo inválido.");
                    System.exit(1);
                }
                tempos[i] = horaPessoa;

            }
            sc.nextLine();

            int total = 0;
            int posicaoFinal = 0;

            for (int i = 0; i < tempos.length; i++) {
                int atual = tempos[i];
                int finish = atual + 10;
                int tempoAtivo = finish - posicaoFinal;
                posicaoFinal += tempoAtivo;

                if (tempoAtivo > 10) {
                    tempoAtivo = 10;
                }

                total += tempoAtivo;
            }
            System.out.println("Tempo ativo: " + total);

            execucoesRestantes --;
        }
    }
}
