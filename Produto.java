package Auto;

public class Produto {
	private int quant;
	private String nome;
	private int preco;
	
	public Produto() {
	
	}
	
	public Produto(int quant, String nome, int preco) {
		super();
		this.quant = quant;
		this.nome = nome;
		this.preco = preco;
	}


	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	
	
}
