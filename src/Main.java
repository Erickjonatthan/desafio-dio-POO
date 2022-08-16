import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java ");
        curso1.setDescricao("descricao curso js");
        curso1.setCargaHoraria(5);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(7);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setdata(LocalDate.now());

		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/

        Bootcamp bootcamp  = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer ");
        bootcamp.setDescricao("Descrição Bootcamp Java developer ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devErick = new Dev();
        devErick.setNome("Erick");
        devErick.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos erick " + devErick.getConteudosInscritos());
        devErick.progredir();
        devErick.progredir();
        System.out.println("----------------------------");
        System.out.println("Conteudos concluidos erick " + devErick.getConteudosConcluidos());
        System.out.println("Conteudos inscritos erick " + devErick.getConteudosInscritos());
        System.out.println("XP:" + devErick.calcularTotalXp());
        System.out.println("----------------------------");
        Dev devBia = new Dev();
        devBia.setNome("Bia");
        devBia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Bia " + devBia.getConteudosInscritos());
        devBia.progredir();
        devBia.progredir();
        devBia.progredir();
        System.out.println("----------------------------");
        System.out.println("Conteudos concluidos Bia " + devBia.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Bia " + devBia.getConteudosInscritos());
        System.out.println("XP:" + devBia.calcularTotalXp());



    }

}
