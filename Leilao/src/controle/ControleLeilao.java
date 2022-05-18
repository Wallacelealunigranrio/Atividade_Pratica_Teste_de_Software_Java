package controle;

import java.util.Scanner;

import dominio.*;

public class ControleLeilao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o nome d Usuário : ");
		String nome = leia.nextLine();
		
		Usuario usuario = new Usuario(nome);
		
		
		
		System.out.print("Nome do leilão ");
		String leilao = leia.nextLine();
		
		
		Leilao leilao1 = new Leilao(leilao);
		
		
		System.out.print("Digite o valor do Lance ");
		double valor = leia.nextDouble();
		
		leilao1.propoe(new Lance(usuario, valor));
		
		 Avaliador leiloeiro = new Avaliador();
	        leiloeiro.avalia(leilao1);
		
		
		leia.close();
		
		double maiorEsperado = 400;
        double menorEsperado = 250;
        
        System.out.print(leilao1.getLances());
	}

}
