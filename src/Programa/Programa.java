package Programa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.Pessoa;
import Entidades.Pf;
import Entidades.Pj;

public class Programa {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("CNPJ ou CPF");
		 String escolha = sc.nextLine();
		 
		 Pessoa pessoa = null;
		 LocalDate dataCadastro = null;
		 Cliente cliente = null;
		 
		 if (escolha.equals("CPF")) {
			 System.out.println("Entre com os dados do cliente pessoa física: ");
			 dataCadastro = LocalDate.now();
			 System.out.println("Nome: ");
			 String nome = sc.nextLine();
			 System.out.println("Data de Nascimento (DD/MM/YYYY): ");
			 String data1 = sc.nextLine();
			 LocalDate dataNascimento = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			 System.out.println("Email: ");
			 String email = sc.nextLine();
			 System.out.println("Telefone: ");
			 String telefone = sc.nextLine();
			 System.out.println("CPF: ");
			 String cpf = sc.nextLine();
			 
			 pessoa = new Pf(nome, dataNascimento, cpf);
			 cliente = new Cliente(dataCadastro, telefone, email, pessoa);
			 
			 
		} else {
			System.out.println("Entre com os dados do cliente pessoa Jurídica: ");
			 dataCadastro = LocalDate.now();
			 System.out.println("Nome: ");
			 String nome = sc.nextLine();
			 System.out.println("Data de Nascimento (DD/MM/YYYY): ");
			 String data1 = sc.nextLine();
			 LocalDate dataNascimento = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			 System.out.println("Email: ");
			 String email = sc.nextLine();
			 System.out.println("Telefone: ");
			 String telefone = sc.nextLine();
			 System.out.println("CNPJ: ");
			 String cnpj = sc.nextLine();
			 
			 pessoa = new Pj(nome, dataNascimento,cnpj);
			 cliente = new Cliente(dataCadastro, telefone, email, pessoa);
		}
		 
		 
		 System.out.println("Cliente " + cliente.getPessoa().getNome() + "cadastrado com sucesso!");
		 
		 
		 
		 
		 
		 
		 
		 sc.close();

	}

}
