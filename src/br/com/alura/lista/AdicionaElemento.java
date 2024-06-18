package br.com.alura.lista;

import java.util.List;

public class AdicionaElemento implements Runnable {

	private List<String> lista;
	private int numeroThread;
	
	public AdicionaElemento(List<String> lista, int numeroThread) {
		this.lista = lista;
		this.numeroThread = numeroThread;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			lista.add("Thread " + numeroThread + " -> " + i);
		}
	}

}
