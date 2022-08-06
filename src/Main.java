import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Node");
        curso2.setDescricao("descrição curso Node");
        curso2.setCargahoraria(7);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNatalia = new Dev();
        devNatalia.setNome("Natalia");
        devNatalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Natalia " + devNatalia.getConteudosInscritos());
        devNatalia.progredir();
        devNatalia.progredir();
        System.out.println("- -");
        System.out.println("Conteúdos Concluidos Natalia " + devNatalia.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Natalia " + devNatalia.getConteudosInscritos());
        System.out.println("XP: " + devNatalia.calcularTotalXp());

        System.out.println("- - - - -");

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luiz " + devLuiz.getConteudosInscritos());
        devLuiz.progredir();
        System.out.println("- -");
        System.out.println("Conteúdos Concluidos Luiz " + devLuiz.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Luiz " + devLuiz.getConteudosInscritos());
        System.out.println("XP: " + devLuiz.calcularTotalXp());


    }
}
