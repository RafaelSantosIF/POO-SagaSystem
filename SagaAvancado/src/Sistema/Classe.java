package Sistema;

class Classe {
	private int nivel;
	private String [] tipos = {"Corpo-a-Corpo", "Distância", "Mágico"};
}

class Guerreiro extends Classe{
	private static String nome = "Guerreiro";
	private int tipo = 1;
	private String armas [] = {"Espada", "Machado", "Lança"};
	Arma Espada = new Arma (armas[0], 8, 5);
	Arma Machado = new Arma (armas[1], 12, 3);
	Arma Lanca = new Arma (armas[2], 6, 8);
	private Arma arma [] = {Espada, Machado, Lanca};
	
}

class Patrulheiro extends Classe{
	private static String nome = "Patrulheiro";
	private int tipo = 2;
	private String armas [] = {"Arco", "Balestra", "LançaA"};
	Arma Arco = new Arma (armas[0], 9, 5);
	Arma Balestra = new Arma (armas[1], 15, 1);
	Arma LancaA = new Arma (armas[2], 7, 7);
	private Arma arma [] = {Arco, Balestra, LancaA};
	
}
