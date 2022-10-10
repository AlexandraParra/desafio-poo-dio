package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descri��o curso java");
		curso1.setCargaHorario(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descri��o curso js");
		curso2.setCargaHorario(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descri��o mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAlexandra = new Dev();
		devAlexandra.setNome("Alexandra");
		devAlexandra.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos Alexandra: " + devAlexandra.getConteudoInscritos());
		devAlexandra.progredir();
		devAlexandra.progredir();
		System.out.println("-");
		System.out.println("Conte�dos inscritos Alexandra: " + devAlexandra.getConteudoInscritos());
		System.out.println("Conte�dos conclu�dos Alexandra: " + devAlexandra.getConteudoConcluidos());
		System.out.println("XP: " + devAlexandra.calcularXp());
		
		System.out.println("----------------------");
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos Camila: " + devCamila.getConteudoInscritos());
		devCamila.progredir();
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conte�dos inscritos Camila: " + devCamila.getConteudoInscritos());
		System.out.println("Conte�dos conclu�dos Camila: " + devCamila.getConteudoConcluidos());
		System.out.println("XP: " + devCamila.calcularXp());
	}

}
