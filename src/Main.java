import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        devCamila.emitirCertificado();

        System.out.println("-----");

        Dev devJaciane = new Dev();
        devJaciane.setNome("Jaciane");
        devJaciane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jaciane" + devJaciane.getConteudosInscritos());
        devJaciane.progredir();
        devJaciane.progredir();
        devJaciane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jaciane" + devJaciane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jaciane" + devJaciane.getConteudosConcluidos());
        System.out.println("XP: " + devJaciane.calcularTotalXp());
        devJaciane.emitirCertificado();

        System.out.println("-----");

        var ranking = new Ranking();
        var devs = new ArrayList<Dev>();
        devs.add(devCamila);
        devs.add(devJaciane);
        ranking.setDevs(devs);
        ranking.imprimeRanking();

    }
}
