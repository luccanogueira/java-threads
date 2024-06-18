package br.com.alura.threads.buscaTexto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTexto implements Runnable {

	private String nomeDoArquivo;
	private String nome;

	public TarefaBuscaTexto(String nomeDoArquivo, String nome) {
		this.nomeDoArquivo = nomeDoArquivo;
		this.nome = nome;
		
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(nomeDoArquivo));
			
			int numLinha = 1;
			
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				
				if (linha.toLowerCase().contains(nome.toLowerCase())) {					
					System.out.println(nomeDoArquivo + " - " + numLinha + " - " + linha);
				}
				numLinha++;
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
