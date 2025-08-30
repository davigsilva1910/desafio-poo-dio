
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java POO e Spring Boot com integração a banco de dados e AWS");
        curso1.setCargaHoraria(10);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Python");
        curso2.setDescricao("Curso de Python para desenvolvimento de chatbots e API Restful");
        curso2.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java para melhor desenvolvimento de códigos");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp para aprendizado de POO, Spring Boot, integração com banco de dados e AWS");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devDavi.getConteudosInscritos());
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: " + devDavi.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devDavi.getConteudosConcluidos());
        System.out.println("XP" + devDavi.calcularTotalXp());
        
        System.out.println("-----------------");
        
        Dev devMariane = new Dev();
        devMariane.setNome("Mariane");
        devMariane.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devMariane.getConteudosInscritos());
        devMariane.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: " + devMariane.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devMariane.getConteudosConcluidos());
        System.out.println("XP" + devMariane.calcularTotalXp());
    }
}
