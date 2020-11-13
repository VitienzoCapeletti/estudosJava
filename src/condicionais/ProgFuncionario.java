package condicionais;

import java.util.Scanner;

public class ProgFuncionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario funcionario1 = criarFuncionario(sc);
        Funcionario funcionario2 = criarFuncionario(sc);

        if (funcionario1.getSalario() > funcionario2.getSalario()){
            System.out.println(funcionario1.getNome() + " ganha mais.");
        }
        else if (funcionario2.getSalario() > funcionario1.getSalario()) {
            System.out.println(funcionario2.getNome()+ " ganha mais.");
        }
        else {
            System.out.println("Ambos ganham o mesmo valor.");
        }

    }

    private static Funcionario criarFuncionario(Scanner sc) {
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome do funcionário: ");
        funcionario.setNome(sc.nextLine());
        System.out.println(funcionario.getNome());

        System.out.print("Valor da hora: ");
        funcionario.setValorHora(sc.nextDouble());
        System.out.println(funcionario.getValorHora());

        System.out.print("Carga horária: ");
        double cargaHoraria = sc.nextDouble();
        while (cargaHoraria < 0 || cargaHoraria > 44){
            System.out.println("Carga horária inválida, digite novamente: ");
            cargaHoraria = sc.nextDouble();
        }
        funcionario.setCargaHoraria(cargaHoraria);
        System.out.println(funcionario.getCargaHoraria());

        System.out.print("Valor salário semanal :");
        System.out.println(funcionario.getSalario());
        sc.nextLine();
        System.out.println("---------------------------------------------------------------------------");
        return  funcionario;

    }

}
