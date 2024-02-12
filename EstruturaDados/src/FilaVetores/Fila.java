package FilaVetores;


public class Fila {
	String vetor[] = new String[10];
	int tamanho;

	public void enfileirar( String elemento) {

		
			this.vetor[this.tamanho] = elemento;
		

		this.tamanho++;

	}

	public String desenfileirar() {

		int primeiroFila = 0;


		String elementoRemovido = this.vetor[primeiroFila];

		this.remover(primeiroFila);//chamar o metodo remover e passa o parametro para remover sempre o primeiro elemento.

		return elementoRemovido;


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
		System.out.println("Fila vazia: " + filaVazia);

	}

	public String front() {


		return this.vetor[0];


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
