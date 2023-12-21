package Sistema;

class Personagem {
	
	private String nome;
	private int hp;
	private int atk;
	private int def;
	private int power;
	private String classe;
	private Arma arma;
	private Poder poder;
	
	public void setName (String name) {
		this.nome = name;
	}
	public String getName () {
		return this.nome;
	}
	public void setStats (int life, int atk, int def, int power) {
		this.hp = life;
		this.atk = atk;
		this.def = def;
		this.power = power;
	}
        public void setLife (int hp){
            this.hp = hp;
        }
	public int getLife () {
		return this.hp;
	}
	public int getAtk () {
		return this.atk;
	}
	public int getDef () {
		return this.def;
	}
        public void setPower (int pow){
            this.power = pow;
        }
	public int getPower () {
		return this.power;
	}
	public void setClasse (Classe classe) {
		this.classe = classe.getName();
	}
	public String getClasse () {
		return this.classe;
	}
	public void setArma (Classe classe) {
		this.arma = classe.getArma();
	}
	public Arma getArma () {
		return this.arma;
	}
	public Poder getPoder() {
		return poder;
	}
	public void setPoder(Classe classe) {
		this.poder = classe.getPoder();
	}
}
