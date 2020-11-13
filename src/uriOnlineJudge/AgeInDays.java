package uriOnlineJudge;

import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numDias= sc.nextInt();

        int anos = numDias / 365;
        numDias -= anos * 365;
        int meses = numDias / 30;
        numDias -= meses * 30;

        System.out.println(anos+" ano(s)");
        System.out.println(meses+" mes(es)");
        System.out.println(numDias+" dia(s)");



    }

}
