package br.com.alura.lista;

public class Lista {
	
	private String[] elementos = new String[100];
	private Integer indice = 0;
	
	public synchronized void adicionarElementos(String elemento) {
			this.elementos[indice] = elemento;
			this.indice++;	
		
	}
	
	public Integer tamanho() {
		return this.elementos.length;
	}
	
	public String pegaElemento(Integer posicao) {
		return this.elementos[posicao];
	}
}
