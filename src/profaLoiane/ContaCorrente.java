package profaLoiane;

public class ContaCorrente {

    String agencia;
    String numero;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar) {
        //tem saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else {                      //não tem saldo na conta
            if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            }
            else {
                return false;       //não é especial e não tem saldo o suficiente
            }

        }
    }
    void depositar (double valorDepositado) {
        saldo += valorDepositado;
    }
    void consultarSaldo(){
        System.out.println("Saldo atual da conta =" + saldo);
    }
    boolean verificarUsoChequeEspecial()    {
        return saldo > 0;
    }
}
