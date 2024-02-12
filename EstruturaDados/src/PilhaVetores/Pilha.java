package PilhaVetores;

public class Pilha {
	String vetor[] = new String[5];
	int tamanho;

	public void enpilhar( String elemento) {

		this.vetor[this.tamanho] = elemento;

		this.tamanho++;

	}

	public String desenpilhar() {

		int ultimo = this.tamanho-1;

		String elementoRemovido = this.vetor[ultimo];

		this.remover(ultimo);//chamar o metodo remover e passa o parametro para remover sempre o ultimo elemento.


		return elementoRemovido;

	}

	public String top() {

		String topo = this.vetor[tamanho-1];


		return topo;
	}


	private void remover(int posicao) {
		//verifica se a posicao entra dentro da fronteira e retorna uma exception
		if (!(posicao >= 0 && posicao < vetor.length)) {
			throw new RuntimeException("Posicao invalida, favor informar uma posição entre "  + 0 +" e " + this.vetor.length);
		}

		// percorre os elementos e joga para a esquerda até o index removido.
		for (int i = posicao; i < tamanho-1 ; i++) {
			this.vetor[i] = this.vetor[i+1];
		}


		this.tamanho--;
	}

	public void isEmpty() {

		boolean filaVazia = this.tamanho == 0;
		System.err.println("Fila vazia: " + filaVazia);

	}

	public int size() {
		return this.tamanho;
	}


	public String[] getVetor() {
		return vetor;
	}

	public void setVetor(String[] vetor) {
		this.vetor = vetor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
