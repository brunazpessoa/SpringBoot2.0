package lab06.demo;

import static java.lang.System.out;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class App implements CommandLineRunner {
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) {
		out.println("# Gerenciador de Professores e Faculdades!");
		int entrada;
		do {
			out.println("# MENU");
			out.println("1) Cadastrar Faculdades");
			out.println("2) Listar faculdades");
			out.println("3)Cadastrar Professor");
			out.println("4)Listar Professores");
			out.println("5)Sair");
			out.print("Digite uma das opções acima: ");
			entrada = s.nextInt();
		
			switch(entrada){
				case 3:
					out.print("Nome do novo professor: ");
					String nomeProf = s.next();
					out.print("CPF do novo professor: ");
					String cpfProf = s.next();
					out.print("CPF do novo professor: ");
					int matrProf = s.nextInt();
					out.println("Faculdade do novo professor (selecione um dos números abaixo):");
					out.println("- (1) Direito");
					out.println("- (2) Computação e Informática");
					out.print("Entre o número da faculdade: ");
					int faculProf = s.nextInt();
					Professor p = new Professor(nomeProf, cpfProf, matrProf);
					Faculdade f1 = new Faculdade("Direito", 1999);
					Faculdade f2 = new Faculdade("Computação e Informática", 1999);
					if(faculProf == 1){
						//p.setFaculdade("Direito");
					}
					else if(faculProf == 2){
						//p.setFaculdade("Computação e Informática");
					}
			}
		} while(entrada != 5);
	}
}