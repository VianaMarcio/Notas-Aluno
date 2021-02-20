package cursojava;

import java.lang.String;


public class Executavel {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.setNome("Joao");
        System.out.println("O nome do aluno 1 eh: " + aluno1.getNome());

        Aluno aluno2 = new Aluno();

        Aluno aluno3 = new Aluno();

        Aluno aluno4 = new Aluno();

        aluno1.setNota1(6.8);
        aluno1.setNota2(9.1);
        aluno1.setNota3(8.2);
        aluno1.setNota4(5.3);

        System.out.println("A media do aluno 1 eh: " + aluno1.getMediaNota());


    }
}
