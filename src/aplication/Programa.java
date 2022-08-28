package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		List<Empregado> lista = new ArrayList<>();		// Criação da Lista

		// PARTE 1 - Coleta dos Dados:

		System.out.print("Quanto Empregados serao registrados ");
		int n = ler.nextInt();

		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Empregado #" + i + ": ");
			System.out.print("ID: ");
			int id = ler.nextInt();
			System.out.print("Nome: ");
			ler.nextLine();
			String nome = ler.nextLine();
			System.out.print("Salario: ");
			double salario = ler.nextDouble();
			lista.add(new Empregado(id, nome, salario));
		}

		// PARTE 2 - Atualizando Salario do Empregado Escolhido:
		
		System.out.println();
		System.out.print("Entre com o ID do Empregado para incrementar o Salario: ");
		int id = ler.nextInt();
		Empregado emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);  // faz a procura do ID na lista
		if (emp == null) {
			System.out.println("Este ID não existe!");
		}
		else {
			System.out.print("Entre com a porcentagem: ");
			double porcentagem = ler.nextDouble();
			emp.increaseSalary(porcentagem);
		}

		// PARTE 3 - Lista de Empregados:

		System.out.println();
		System.out.println("Lista de Empregados:");
		for (Empregado obj : lista) {
			System.out.println(obj);
		}

		ler.close(); 
	}
}