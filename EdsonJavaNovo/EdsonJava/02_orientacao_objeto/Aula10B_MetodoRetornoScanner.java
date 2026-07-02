import java.util.Scanner;

public class Aula10B_MetodoRetornoScanner{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaScanner minhaConta = new ContaScanner();

        System.out.println("Saldo Inicial: R$" + minhaConta.verificarSaldo());

        System.out.println("Digite o valor que deseja sacar: R$");
        double valorSaque = teclado.nextDouble();

        minhaConta.sacar(valorSaque);

        System.out.println("Saldo Atual: R$" + minhaConta.verificarSaldo());
        teclado.close();
    }
};