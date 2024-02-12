package ListaDpEn;

public class ListasEncadeada{

	private No inicio;
	private No ultimo;
	private int tamanho;


	public int gettamanho() {
		return this.tamanho;
	}

	public void add(int posicao, String elemento) {

		if (posicao == 0) {
			No no = new No();
			no.setElemento(elemento);
			no.setAnterior(null);
			no.setProximo(inicio);
			this.inicio = no;
			this.ultimo = no;
		}else if (posicao == this.tamanho) {
			No no = new No();
			no.setElemento(elemento);
			no.setAnterior(ultimo);
			no.setProximo(null);
			if (this.ultimo != null) {
				this.ultimo.setProximo(no);
			}
			if (this.tamanho == 0) {
				this.inicio = no;
			}
			this.ultimo = no;
		}else if (posicao >0 && posicao < this.tamanho) {
			No  local = inicio;
			for (int i = 0; i < posicao -1; i++) {
				local = local.getProximo();
			}
			No no = new No();
			no.setElemento(elemento);
			local.setProximo(no);
			no.setAnterior(local);
			no.setProximo(local.getProximo());
			local.getProximo().setAnterior(no);

			this.ultimo = no;
		}



		tamanho++;
	}

	public void set(int posicao, String elemento) {
		if (!(posicao >= 0 || posicao < this.tamanho)) {
			throw new RuntimeException("Posicao invalida, favor informar uma posição entre "  + 0 +" e " + (this.tamanho -1));
		}
		No  local = inicio;
		for (int i = 0; i < posicao; i++) {
			local = local.getProximo();
		}
		local.setElemento(elemento);

	}


	public String getUltimo(int posicao) {
		No atual = new No();
		atual.getElemento();

		if (!(posicao >= 0 || posicao < this.tamanho)) {
			throw new RuntimeException("Posicao invalida, favor informar uma posição entre "  + 0 +" e " + (this.tamanho -1));
		}


		for (int i = 0; i < this.tamanho-1; i++) {
			atual.getElemento();
			atual = atual.getProximo();
		}


		return atual.getElemento();
	}

	public String get(int posicao) {
		if (!(posicao >= 0 || posicao < this.tamanho)) {
			throw new RuntimeException("Posicao invalida, favor informar uma posição entre "  + 0 +" e " + (this.tamanho -1));
		}
		
		No atual = this.inicio;

		for (int i = 0; i < posicao; i++) {
			if (atual == null) {
				throw new RuntimeException("Posição inválida");
			}else {
				if (i == posicao) {
					return atual.getElemento();
				}
			}
			atual = atual.getProximo();

		}
		
		
		return atual.getElemento();
		
		
	}



	public int size() {
		return this.tamanho;
	}



	public String remove(int posicao){
		if (posicao < 0 || posicao >= this.tamanho || this.inicio == null) {
			return null;
		}

		No atual = this.inicio;

		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}

		if (posicao == 0) {
			this.inicio = this.inicio.getProximo();
			if (atual.getProximo() != null) {
				atual.setAnterior(null);
			}
		}else if (atual.getProximo() == null) {
			this.ultimo.getAnterior().setProximo(null);
			this.ultimo.setAnterior(null);
		}else {
			atual.getAnterior().setProximo(atual.getProximo());
			atual.getProximo().setAnterior(atual.getAnterior());
		}


		this.tamanho--;	


		return atual.getElemento();

	}

	@Override
	public String toString() {
		return "ListasEncadeada [inicio=" + inicio + ", ultimo=" + ultimo + ", tamanho=" + tamanho + "]";
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

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


}
