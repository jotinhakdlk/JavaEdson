public class Conta10 {
    double saldo = 500.0;

    double verificarSaldo(){
        return saldo;
    };

    void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor
            System.out.println("Saque de R$" + valor + "Realizado com sucesso.");
        }else{
            System.out.println("Saldo insuficiente para o saque de R$" + valor)
        }
    };
}
