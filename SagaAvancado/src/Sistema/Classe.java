package Sistema;

class Classe {
	private String nomeClasse;
	private Arma arma;
	private Poder poder;
	
	public Classe (String nome, Arma arma, Poder poder) {
		this.nomeClasse = nome;
		this.arma = arma;
		this.poder = poder;
	}
	public String getName () {
		return this.nomeClasse;
	}
	public Arma getArma() {
		return arma;
	}
	public Poder getPoder() {
		return poder;
	}
}
