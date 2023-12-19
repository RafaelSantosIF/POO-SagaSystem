package Sistema;

public class Poder {
	private String nomePoder;
	private int dano;
	private int acerto;
	private int custo;
	
	public Poder (String nome, int dano, int acerto, int custo) {
		this.nomePoder = nome;
		this.dano = dano;
		this.acerto = acerto;
		this.custo = custo;
	}

	public String getNomePoder() {
		return nomePoder;
	}

	public int getDano() {
		return dano;
	} 

	public int getAcerto() {
		return acerto;
	}

	public int getCusto() {
		return custo;
	}
}


