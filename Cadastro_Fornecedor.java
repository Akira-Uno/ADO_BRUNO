package Auto;

public class Cadastro_Fornecedor {
	private Fornecedor fornecedro[];
	private int tamanho;
	
	
	public Cadastro_Fornecedor () {
		fornecedro = new Fornecedor[1];
		tamanho =0;
	}
	
	public void add(Fornecedor f) {
		if( fornecedro.length==tamanho)
			aumentarTamanho();
		
		for(int i = 0; i < fornecedro.length;i++) {
			if(fornecedro != null) {
				fornecedro[tamanho] = f;
				tamanho++;
				break;
			}
		}
	}
	public void remover(int index) {
		for( int i =0;i < tamanho;i++) {
			if(fornecedro != null) {
				fornecedro[index] = null;
				tamanho--;
				break;
			}
		}
	}
	public void editar(int index, Fornecedor f) {
		for(int i = 0; i <  tamanho;i++) {
			if(fornecedro != null) {
				fornecedro[index] = f;
				break;
			}
		}
	}
	public void aumentarTamanho() {
		Fornecedor novoArray[] = new Fornecedor[this.tamanho * 2];
		for(int i =0; i <  tamanho;i++) {
			novoArray[i] = fornecedro[i];
		}
		fornecedro = novoArray;
	}
	public void exibir() {
		for(Fornecedor f : fornecedro) {
			if(f != null) {
				System.out.println(f.getNome());
			}
		}
			
	}
}
