package Auto;

import java.util.Scanner;

public class TesteProduto {
	 static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Produto p = new Produto(30, "cadeira", 400);
		Cadastro_Produto cp = new Cadastro_Produto();
		cp.totalPrecoProduto();
		
//		boolean verifcaMenu = false;
//		do {
//			menu();
//			int menu = scanner.nextInt();
//			switch(menu) {
//			case 1:
//				subMenuProduto();
//				scanner.next();
//			
//			}
//			
//		}while(!verifcaMenu);
		
		
		
	}

	public static void menu() {
		System.out.println("1 - Produto");
		System.out.println("2 - Funcionario");
		System.out.println("0 - Sair");
	}
	public static void subMenuProduto() {
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Adicionar quant de produto");
		System.out.println("3 - Remover quant de produto");
		System.out.println("4 - Voltar");
		System.out.println("0 - Sair");
	}
}
