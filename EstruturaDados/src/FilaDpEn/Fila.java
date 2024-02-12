package FilaDpEn;

import ListaDpEn.No;

public class Fila {
	private No inicio;
	private No ultimo;
	private int tamanho;

	public void enfileirar(String elemento) {

		if (this.tamanho == 0) {
			No no = new No();
			no.setElemento(elemento);
			no.setAnterior(null);
			no.setProximo(inicio);
			this.inicio = no;
			this.ultimo = no;
		}else  {
			No local = this.ultimo;
			No no = new No();
			no.setElemento(elemento);
			local.setProximo(no);
			no.setAnterior(local);
			no.setProximo(null);

			this.ultimo = no;
		}

		tamanho++;
	}
	

	public void desenfileirar() {
		if (this.tamanho == 0) {
			throw new RuntimeException("Fila está vasia");
		}
		No local = this.inicio;
		this.inicio =  this.inicio.getProximo();
		local.setProximo(null);
		this.inicio.setAnterior(null);
	}

	
	public void isEmpty() {
		
		boolean filaVazia = this.tamanho == 0;
		System.err.println("Fila vazia: " + filaVazia);
	
	}
	
	public String front() {
		
		
		return inicio.getElemento();
	}
	
	public int size() {
		return this.tamanho;
	}
	
	
	
	public No getInicio() {
		return inicio;
	}
	public void setInicio(No inicio) {
		this.inicio = inicio;
	}
	public No getUltimo() {
		return ultimo;
	}
	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
