import java.util.Scanner;

public class Aulas12B_ContrutoresScanner{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("====Cadastro de Produto====");
        System.out.println("Nome do Console ");
        String nomeDigitado = teclado.nextLine();

        System.out.println("Preço de mercado: R$");
        double precoDigitado = teclado.nextDouble();

        VideoGame console = new VideoGame(nomeDigitado, precoDigitado);

        System.out.println("Nome: " + console.nome + "// Preço(R$): " + console.preco);
        teclado.close();
    };
};