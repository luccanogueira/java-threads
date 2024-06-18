package br.com.alura.threads.banheiro;

public class Banheiro {
	
	private boolean estaSujo = false;

	public void fazNumeor1() throws InterruptedException {
		String convidado = Thread.currentThread().getName();
		
		System.out.println(convidado + "  bate na porta");
		
		synchronized (this) {
			System.out.println(convidado + "  entra no banheiro");
			
			while (estaSujo) {
				espera(convidado);
			}
			
			System.out.println(convidado + "  rapidinho");
			
			dorme(1000L);
			
			System.out.println(convidado + "  descarga");
			System.out.println(convidado + "  lava a mão");
			this.estaSujo = true;
			System.out.println(convidado + "  sai do banheiro");
		}		
	}

	public void fazNumeor2() throws InterruptedException {
		String convidado = Thread.currentThread().getName();
		
		System.out.println(convidado + "  bate na porta");
		
		synchronized (this) {
			System.out.println(convidado + "  entra no banheiro");
			
			while (estaSujo) {
				espera(convidado);
			}
			
			System.out.println(convidado + "  demorei");
			
			dorme(2000L);
			
			System.out.println(convidado + "  descarga");
			System.out.println(convidado + "  lava a mão");
			this.estaSujo = true;
			System.out.println(convidado + "  sai do banheiro");
		}
	}
	
	public synchronized void limpaBanheiro() throws InterruptedException {
		System.out.println("Dono entrou no banheiro para limpar...");
		System.out.println("Limpou o banheiro!!");
		
		dorme(3000L);
		
		System.out.println("Banheiro liberado!!");
				
		this.estaSujo = false;
		this.notifyAll();
	}

	private void espera(String convidado) throws InterruptedException {
		System.out.println(convidado + "  disse que o banheiro está sujo");
		this.wait();
	}

	private void dorme(long tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
}
