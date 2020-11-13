package profaLoiane;

import java.util.Scanner;

public class Training {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[15];
        int[] vetB = new int[vetA.length];

        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = sc.nextInt();
            vetB[i] = vetA[i] * 2;
        }
    }
}
