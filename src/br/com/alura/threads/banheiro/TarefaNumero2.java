package br.com.alura.threads.banheiro;

public class TarefaNumero2 implements Runnable {

	private Banheiro banheiro;
		
	public TarefaNumero2(Banheiro banheiro) {
		super();
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		try {
			banheiro.fazNumeor2();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
