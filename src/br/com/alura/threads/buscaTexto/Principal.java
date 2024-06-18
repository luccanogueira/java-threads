package br.com.alura.threads.buscaTexto;

public class Principal {

	public static void main(String[] args) {
		
		String nome = "da";
		
		Thread threaadsAssinaturas1 = new Thread(new TarefaBuscaTexto("assinaturas1.txt", nome), "Threads Busca Texto");
		Thread threaadsAssinaturas2 = new Thread(new TarefaBuscaTexto("assinaturas2.txt", nome), "Threads Busca Texto");
		Thread threaadsAutores = new Thread(new TarefaBuscaTexto("autores.txt", nome), "Threads Busca Texto");
		
		threaadsAssinaturas1.start();
		threaadsAssinaturas2.start();
		threaadsAutores.start();
	}

}
