package Sistema;
import java.util.*;

public class Main {
	static Scanner input = new Scanner(System.in);
	static Arma katana = new Arma ("Katana", 8, 2);
	static Arma naginata = new Arma ("Naginata", 12, 1);
	static Arma wakizashi = new Arma ("Wakizashi", 4, 3);
        static Arma shuriken = new Arma ("Shuriken", 2, 4);
        static Arma kunai = new Arma ("Kunai", 1, 10);
        static Arma kuzarigama = new Arma ("Kuzarigama", 6, 2);
        static Arma kanabo = new Arma ("Kanabo", 15, 3);
        static Arma pedra = new Arma ("Pedra", 10, 1);
	
	static Poder corteSombrio = new Poder ("Corte Sombrio", 16, 2, 10);
        static Poder golpeFurioso = new Poder ("Golpe Furioso", 25, 1, 6);
        static Poder nuvemVeneno = new Poder ("Nuvem de Veneno", 6, 4, 3);
        static Poder ninjutsu = new Poder ("Ninjutsu", 50, 2, 20);
        static Poder bolaFogo = new Poder ("Bola de Fogo", 80, 4, 30);
        static Poder congelar = new Poder ("Congelar", 40, 6, 20);
        static Poder raio = new Poder ("Raio", 100, 5, 50);
        static Poder detruicao = new Poder ("Destruição", 50, 1, 10);
	
	public static int [] distribuirAtributos () {
		
		System.out.println("\nVoce possui 100 Pontos de Atributo para distribuir entre os seus quatro atributos: ");
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
			int choose1 = input.nextInt();
                        System.out.println("Escolha seu Poder! \n");
			System.out.println("[1] Corte Sombrio \n[2] Golpe Furioso \n");
                        int choose2 = input.nextInt();
                        
                        if (choose1 == 1){
                            if (choose2 == 1){
                                Classe samurai = new Classe ("Samurai", katana, corteSombrio);
                                return samurai;
                            } else if (choose2 == 2){
                                Classe samurai = new Classe ("Samurai", katana, golpeFurioso);
                                return samurai;
                            }
                        } else if (choose1 == 2){
                            if (choose2 == 1){
                                Classe samurai = new Classe ("Samurai", naginata, corteSombrio);
                                return samurai;
                            } else if (choose2 == 2){
                                Classe samurai = new Classe ("Samurai", naginata, golpeFurioso);
                                return samurai;
                            }
                        } else if (choose1 == 3){
                            if (choose2 == 1){
                                Classe samurai = new Classe ("Samurai", wakizashi, corteSombrio);
                                return samurai;
                            } else if (choose2 == 2){
                                Classe samurai = new Classe ("Samurai", wakizashi, golpeFurioso);
                                return samurai;
                            }
                        }      
		} else if (choose == 2) {
			System.out.println("Escolha sua Arma! \n");
			System.out.println("[1] Wakizashi \n[2] Shuriken \n");
			int choose1 = input.nextInt();
                        System.out.println("Escolha seu Poder! \n");
			System.out.println("[1] Nuvem de Veneno \n[2] Corte Sombrio \n[3] Ninjutsu");
                        int choose2 = input.nextInt();
                        
                        if (choose1 == 1){
                            if (choose2 == 1){
                                Classe ronin = new Classe ("Ronin", wakizashi, nuvemVeneno);
                                return ronin;
                            } else if (choose2 == 2){
                                Classe ronin = new Classe ("Ronin", wakizashi, corteSombrio);
                                return ronin;
                            } else if (choose2 == 3){
                                Classe ronin = new Classe ("Ronin", wakizashi, ninjutsu);
                                return ronin;
                            }
                        } else if (choose1 == 2){
                            if (choose2 == 1){
                                Classe ronin = new Classe ("Ronin", shuriken, nuvemVeneno);
                                return ronin;
                            } else if (choose2 == 2){
                                Classe ronin = new Classe ("Ronin", shuriken, corteSombrio);
                                return ronin;
                            } else if (choose2 == 3){
                                Classe ronin = new Classe ("Ronin", shuriken, ninjutsu);
                                return ronin;
                            }
                        }    
		} else if (choose == 3) {
			System.out.println("Escolha sua Arma! \n");
			System.out.println("[1] Kuzarigama \n[2] Kunai \n");
			int choose1 = input.nextInt();
                        System.out.println("Escolha seu Poder! \n");
			System.out.println("[1] Bola de Fogo \n[2] Congelar \n[3] Raio");
                        int choose2 = input.nextInt();
                        
                        if (choose1 == 1){
                            if (choose2 == 1){
                                Classe xama = new Classe ("Xamã", kuzarigama, bolaFogo);
                                return xama;
                            } else if (choose2 == 2){
                                Classe xama = new Classe ("Xamã", kuzarigama, congelar);
                                return xama;
                            } else if (choose2 == 3){
                                Classe xama = new Classe ("Xamã", kuzarigama, raio);
                                return xama;
                            }
                        } else if (choose1 == 2){
                            if (choose2 == 1){
                                Classe xama = new Classe ("Xamã", kunai, bolaFogo);
                                return xama;
                            } else if (choose2 == 2){
                                Classe xama = new Classe ("Xamã", kunai, congelar);
                                return xama;
                            } else if (choose2 == 3){
                                Classe xama = new Classe ("Xamã", kunai, raio);
                                return xama;
                            }
                        }  
                } else if (choose == 4) {
			System.out.println("Escolha sua Arma! \n");
			System.out.println("[1] Kanabo \n[2] Naginata \n[3] Pedra \n");
			int choose1 = input.nextInt();
                        System.out.println("Escolha seu Poder! \n");
			System.out.println("[1] Destruição \n[2] Golpe Furioso \n");
                        int choose2 = input.nextInt();
                        
                        if (choose1 == 1){
                            if (choose2 == 1){
                                Classe oni = new Classe ("Samurai", katana, corteSombrio);
                                return oni;
                            } else if (choose2 == 2){
                                Classe oni = new Classe ("Samurai", katana, golpeFurioso);
                                return oni;
                            }
                        } else if (choose1 == 2){
                            if (choose2 == 1){
                                Classe samurai = new Classe ("Samurai", naginata, corteSombrio);
                                return samurai;
                            } else if (choose2 == 2){
                                Classe samurai = new Classe ("Samurai", naginata, golpeFurioso);
                                return samurai;
                            }
                        } else if (choose1 == 3){
                            if (choose2 == 1){
                                Classe samurai = new Classe ("Samurai", wakizashi, corteSombrio);
                                return samurai;
                            } else if (choose2 == 2){
                                Classe samurai = new Classe ("Samurai", wakizashi, golpeFurioso);
                                return samurai;
                            }
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
