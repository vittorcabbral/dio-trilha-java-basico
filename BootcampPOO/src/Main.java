import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;


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


        /*System.out.println(novoCurso);
        System.out.println(curso2);
        System.out.println(novaMentoria);
        */


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(novoCurso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(novaMentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("-------------");
        devJoao.progredir();
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP João: " + devJoao.calcularTotalXp());
        
        System.out.println();
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("-------------");
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP Camila: " + devCamila.calcularTotalXp());
        

        

    }
}