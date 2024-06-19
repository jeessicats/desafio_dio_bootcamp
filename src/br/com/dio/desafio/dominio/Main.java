package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJessica = new Dev();
        devJessica.setNome("Jéssica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " +devJessica.getConteudosInscritos());
        devJessica.progredir();
        devJessica.progredir();
        System.out.println("Conteudos inscritos: " +devJessica.getConteudosInscritos());
        System.out.println("Conteudos concluídos: " +devJessica.getConteudosConcluidos());
        System.out.println("XP: "+ devJessica.calcularXp());

        System.out.println("------------------------------------------------------");

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " +devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println("Conteudos inscritos: " +devDaniel.getConteudosInscritos());
        System.out.println("Conteudos concluídos: " +devDaniel.getConteudosConcluidos());
        System.out.println("XP: "+ devDaniel.calcularXp());

    }
}