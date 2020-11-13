package profaLoiane;

public class ContCorrenteEx {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.numero = " 123456 ";
        conta.agencia = " 1234 ";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        conta.valorEspecialUsado = 0;

        System.out.println("Saldo da conta"+ conta.numero +" = "+ conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta = "+ conta.saldo);
        }
        else {
            System.out.println("Não foi possível realizar o saque, saldo insuficiente.");
        }
        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de saque de 500 reais.");
        if (saqueEfetuado){
            System.out.println("Saque eqfetuado com sucesso");
            System.out.println("Saldo atual da conta = "+ conta.saldo);
        }
        else {
            System.out.println("Não foi possível realizar saque, saldo insuficiente.");
        }
        System.out.println("Depósito de R$ 500");
        conta.depositar(500);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        }
        else {
            System.out.println("Não está usando cheque especial");
        }

        conta.realizarSaque(500);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        }
        else {
            System.out.println("Não está usando cheque especial");
        }


    }


}
