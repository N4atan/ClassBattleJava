package funciona;

public class Personagem {
    private String nome;
	private float vida;
	private float danoAtaque;

	public Personagem(String nome, float vida, float danoAtaque) {
		this.nome = nome;
		this.vida = vida;
		this.danoAtaque = danoAtaque;
	}

	public String getNome() {
		return this.nome;
	}

	public float getVida() {
		return this.vida;
	}

	public float getDanoAtaque() {
		return this.danoAtaque;
	}

	public void setVida(float vidaNova) {
		this.vida = vidaNova;
	}

	//atacar (personagem)
	public void atacar(Personagem oponente) {
		oponente.setVida(oponente.getVida() - this.danoAtaque);
	}

	//vivo true = vida>0 
	public boolean estaVivo() {
		return this.vida > 0;
	}
}
