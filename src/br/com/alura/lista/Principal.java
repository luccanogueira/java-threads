package br.com.alura.lista;

import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

		//List<String> lista = new ArrayList<String>(); //N�o funciona bem com Threads
		//List<String> lista = Collections.synchronizedList(new ArrayList<String>()); //Funciona bem com Threads
		List<String> lista = new Vector<String>(); //Outra op��o que funciona bem com Threads (m�todo add usa synchronized)
		
		for (int i = 0; i < 10; i++) {
			 new Thread(new AdicionaElemento(lista, i)).start();
		}
		
		Thread.sleep(1000);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
