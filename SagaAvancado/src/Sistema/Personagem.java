package Sistema;

class Personagem {
	
	private String nome;
	private int vida;
	private int ataque;
	private int defesa;
	private int poder;
	private String classe;
	private Arma arma;
	public void setName (String name) {
		this.nome = name;
	}
	public String getName () {
		return this.nome;
	}
	public void setStats (int life, int atk, int def, int power) {
		this.vida = life;
		this.ataque = atk;
		this.defesa = def;
		this.poder = power;
	}
	public int getLife () {
		return this.vida;
	}
	public int getAtk () {
		return this.ataque;
	}
	public int getDef () {
		return this.defesa;
	}
	public int getPower () {
		return this.poder;
	}
	public void setClasse (String classe) {
		this.classe = classe;
	}
	public String getClasse () {
		return this.classe;
	}
}
