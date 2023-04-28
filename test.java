package Auto;

public class test {
	public static void main(String[] args) {
		
		Fornecedor f = new Fornecedor("jose","1434141");
		Fornecedor f1 = new Fornecedor("jose","1434141");
		Fornecedor f2 = new Fornecedor("jose","1434141");
		Fornecedor f3 = new Fornecedor("jose","1434141");
		Fornecedor f4 = new Fornecedor("bruno", "w");
		Cadastro_Fornecedor cf = new Cadastro_Fornecedor();
		System.out.println("a");
		cf.add(f);
		cf.add(f1);
		cf.add(f2);
		cf.add(f3);
		cf.exibir();
		cf.remover(0);
		System.out.println("==========");
		cf.exibir();
		cf.editar(0, f4);
		System.out.println("==========");
		cf.exibir();

		
	}
}
