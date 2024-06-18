package br.com.alura.threads.banheiro;

public class Principal {

	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();
		
		Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "Convidado 1");
		Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Convidado 2");
		Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Convidado 3");
		Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Convidado 4");
		Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Limpando");
		limpeza.setDaemon(true);
		
		
		convidado1.start();
		convidado2.start();
		convidado3.start();
		convidado4.start();
		limpeza.start();
	}

}
