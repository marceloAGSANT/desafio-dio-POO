import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setDescricao("curso java");
        curso1.setTitulo("Titulo");
        curso1.setCargaHoraria(8);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Descrição da mentoria");
        mentoria1.setTitulo("Mentoria");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);

    }
}
