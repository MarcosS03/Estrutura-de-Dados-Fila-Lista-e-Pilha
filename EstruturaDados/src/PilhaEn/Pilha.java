package PilhaEn;


public class Pilha {
	private No inicio;
	private No topo;
	private int tamanho;

	public void push(String elemento) {

		if (this.tamanho == 0) {
			No no = new No ();
			no.setElemento(elemento);
			no.setProximo(inicio);
			this.inicio = no;
			this.topo = no;
		}else {

			No no = new No();
			no.setElemento(elemento);
			no.setProximo(no);

			this.topo = no.getProximo();
		}

		tamanho++;
	}

	public int size() {
		return this.tamanho;
	}

	public void pop() {
		if (this.tamanho == 0) {
			throw new RuntimeException("Pilha está vasia");
		}
		No local = this.topo;
		for (int i = 0; i < this.tamanho-2; i++) {
			local.getProximo();
		}
		local.setProximo(null);;
		this.topo = local;

		this.tamanho--;
	}

	public void isEmpty() {

		boolean pilhaVazia = this.tamanho == 0;
		System.err.println("Pilha vazia: " + pilhaVazia);

	}
	
	public String top() {
		
		if (this.tamanho == 0) {
			throw new RuntimeException("Pilha está vasia");
		}
		
		return this.topo.getElemento();
	}


	public Pilha() {
		// TODO Auto-generated constructor stub
	}

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public No getUltimo() {
		return topo;
	}

	public void setUltimo(No ultimo) {
		this.topo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}



}
