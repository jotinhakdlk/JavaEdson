package CursoJava;

public class Aula03_condicoes{
    publicstaticvoid main(String[] args){
        double nota = 5.5;

        if(nota>=7.0){
            System.out.print("Aprovado");
        } else if (nota >= 5.0){
            System.out.print("Recuperação");
        } else{
            System.out.print("Reprovado");        
        };
    };
};