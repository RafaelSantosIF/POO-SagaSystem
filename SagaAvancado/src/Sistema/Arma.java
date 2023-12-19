package Sistema;

public class Arma {
	private String nomeArma;
	private int dano;
	private int acerto;
	
	public Arma (String nome, int dano, int acerto) {
		this.nomeArma = nome;
		this.dano = dano;
		this.acerto = acerto;
	}

	public String getNomeArma() {
		return nomeArma;
	}

	public int getDano() {
		return dano;
	}

	public int getAcerto() {
		return acerto;
	}
	
}

class Katana extends Arma {
	public Katana(int dano, int acerto) {
		super("Katana", dano, acerto);
	}
}

class Naginata extends Arma {
	public Naginata(int dano, int acerto) {
		super("Naginata", dano, acerto);
	}
}

class Wakizashi extends Arma {
	public Wakizashi(int dano, int acerto) {
		super("Wakizashi", dano, acerto);
	}
}

class Shuriken extends Arma {
	public Shuriken(int dano, int acerto) {
		super("Shuriken", dano, acerto);
	}
}

class Kanabo extends Arma {
	public Kanabo(int dano, int acerto) {
		super("Kanabo", dano, acerto);
	}
}

class Kuzarigama extends Arma {
	public Kuzarigama(int dano, int acerto) {
		super("Kuzarigama", dano, acerto);
	}
}

class Kunai extends Arma {
	public Kunai(int dano, int acerto) {
		super("Kunai", dano, acerto);
	}
}



