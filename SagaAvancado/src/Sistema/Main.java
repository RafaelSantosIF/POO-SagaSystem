package Sistema;
import java.util.*;

public class Main {
	static Scanner input = new Scanner(System.in);
	static Arma katana = new Arma ("Katana", 8, 2);
	static Arma naginata = new Arma ("Naginata", 12, 1);
	static Arma wakizashi = new Arma ("Wakizashi", 4, 3);
	
	static Poder corteSombrio = new Poder ("Corte Sombrio", 16, 2, 10);
	
	public static int [] distribuirAtributos () {
		
		System.out.println("\nVocê possui 100 Pontos de Atributo para distribuir entre os seus quatro atributos: ");
		System.out.print("\nVida: ");
		int hp = input.nextInt();
		System.out.print("\nAtaque: ");
		int atk = input.nextInt();
		System.out.print("\nDefesa: ");
		int def = input.nextInt();
		System.out.print("\nPoder: ");
		int pow = input.nextInt();
		
		
		int atributos [] = {hp, atk, def, pow};
		return atributos;
	}
	
	public static Classe escolherClasse () {
		System.out.println("Escolha sua Classe! \n");
		System.out.println("[1] Samurai \n[2] Ronin \n[3] Xamã \n[4] Oni \n");
		int choose = input.nextInt();
		
		if (choose == 1) {
			System.out.println("Escolha sua Arma! \n");
			System.out.println("[1] Katana \n[2] Naginata \n[3] Wakizashi \n");
			
			Classe samurai = new Classe ("Samurai", katana, corteSombrio);
			return samurai;
		}
		
	}
	
	public static void criarChar1 () {
		String nome;
		System.out.print("\nNome: ");
		nome = input.next();
		int atributos [] = distribuirAtributos();
		Classe classe = escolherClasse();
		
	}
	
	public static void main(String[] args) {
		

	}

}
