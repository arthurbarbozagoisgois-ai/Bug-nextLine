import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		Jogador jogador1 = new Jogador();
		
		System.out.print("Digite nome do jogador: ");
		jogador1.nome = sc.next();
		System.out.print("Digite nick do jogador: ");
		jogador1.nick = sc.next();
		System.out.print("Digite idade do jogador: ");
		jogador1.idade = sc.nextInt();
		System.out.print("Digite Jogo Favorito do jogador: ");
		jogador1.jogoFavorito = sc.next();
		System.out.print("Digite nível do jogador: ");
		jogador1.nivel = sc.nextInt();
		
		System.out.println(" ");
		System.out.println("----Ficha Jogador 1----");
		System.out.println("Nome Jogador: "+jogador1.nome);
		System.out.println("Nick Jogador: "+jogador1.nick);
		System.out.println("Idade Jogador: "+jogador1.idade);
		System.out.println("Jogo Favorito: "+jogador1.jogoFavorito);
		System.out.println("Nível Jogador: "+jogador1.nivel);
		System.out.println("-----------------------");
		System.out.println(" ");
		
		Jogador jogador2 = new Jogador();
		
		System.out.print("Digite nome do jogador: ");
		jogador2.nome = sc.next();
		System.out.print("Digite nick do jogador: ");
		jogador2.nick = sc.next();
		System.out.print("Digite idade do jogador: ");
		jogador2.idade = sc.nextInt();
		System.out.print("Digite Jogo Favorito do jogador: ");
		jogador2.jogoFavorito = sc.next();
		System.out.print("Digite nível do jogador: ");
		jogador2.nivel = sc.nextInt();
		
		System.out.println(" ");
		System.out.println("----Ficha Jogador 2----");
		System.out.println("Nome Jogador: "+jogador2.nome);
		System.out.println("Nick Jogador: "+jogador2.nick);
		System.out.println("Idade Jogador: "+jogador2.idade);
		System.out.println("Jogo Favorito: "+jogador2.jogoFavorito);
		System.out.println("Nível Jogador: "+jogador2.nivel);
		System.out.println("-----------------------");
		System.out.println(" ");
	}
}

