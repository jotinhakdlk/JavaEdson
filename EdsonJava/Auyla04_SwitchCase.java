package CursoJava;

public class Aula04_SwitchCase {
    public static void main(string[] args){
        int opcaoMenu = 2;

        switch (opcaoMenu){
            case 1:
                System.out.println("Iniciando");
                break;
            case 2:
                System.out.println("Carregando jogo...");
                break;
            case 3:
                System.out.println("Saindo do jogo...");
                break;

        
        default:
            System.out.println("Opção inválida!")
            break;
        };
    };
};