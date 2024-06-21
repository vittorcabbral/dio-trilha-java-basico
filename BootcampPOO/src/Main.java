import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso novoCurso = new Curso();
        novoCurso.setTitulo("Curso Java");
        novoCurso.setDescricao("Descrição Curso Java");
        novoCurso.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Cursos Js");
        curso2.setCargaHoraria(15);
        curso2.setDescricao("Descrição curso Js");


        Mentoria novaMentoria = new Mentoria();
        novaMentoria.setTitulo("Mentoria de Java");
        novaMentoria.setDescricao("Descrição Mentoria Java");
        novaMentoria.setData(LocalDate.now());


        System.out.println(novoCurso);
        System.out.println(curso2);
        System.out.println(novaMentoria);

        

    }
}