package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Vida inicial: ");
		int life = sc.nextInt();

		System.out.print("Ataque: ");
		int attack = sc.nextInt();

		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		System.out.println();

		Champion c1 = new Champion(nome, life, attack, armor);

		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		String nome2 = sc.nextLine();

		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();

		System.out.print("Ataque: ");
		int damage = sc.nextInt();

		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		System.out.println();

		Champion c2 = new Champion(nome2, life2, damage, armor2);

		System.out.print("Quantos turnos você deseja executar? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.println();
			System.out.println("Resultado do turno " + (1 + i) + ":");
			c1.takeDamage(c2);
			System.out.println(c1.Status());
			c2.takeDamage(c1);
			System.out.println(c2.Status());
			System.out.println();

			if (c1.getLife() == 0 || c2.getLife() == 0) {
				i = N;
			}

		}

		System.out.println("FIM DO COMBATE");

		sc.close();

	}

}
