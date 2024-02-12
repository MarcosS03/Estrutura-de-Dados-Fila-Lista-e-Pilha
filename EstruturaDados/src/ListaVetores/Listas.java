package ListaVetores;



public class Listas {
	String vetor[] = new String[5];
	int tamanho;

	public void add(int posicao, String elemento) {
		//verifica se a posicao entra dentro da fronteira e retorna uma exception
		if (!(posicao >= 0 && posicao < vetor.length)) {
			throw new RuntimeException("Posicao invalida, favor informar uma posição entre "  + 0 +" e " + this.vetor.length);
		}


		// percorrer os elementos e joga para a direita até a posição informada.
		for (int i = this.tamanho-1; i >=posicao ; i--) {
			this.vetor[i+1] = this.vetor[i];
		}

		this.vetor[posicao] = elemento;
		this.tamanho++;

	}

	public String get(int posicao) {
		if (!(posicao >= 0 && posicao < vetor.length)) {
			throw new RuntimeException("Posicao invalida, favor informar uma posição entre "  + 0 +" e " + this.vetor.length);
		}
		
		//verifica se a posição é vazia e retorna uma exception
		if(this.vetor[posicao] == null) {
			throw new RuntimeException(" Posicao: "+ posicao + " vazia!!");
		}else if (posicao >= 0 && posicao < vetor.length) {//verifica se a posição é valida e retorna o elemento
			return this.vetor[posicao];
		}else {
			throw new RuntimeException("Posicao nao exite");// não retirei esse codigo porque o metudo fica pedindo que retorne uma string.
		}

	}

	public void remove(int posicao) {
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

	public void set(int posicao, String elemento) {
	
		//verifica se a posicao esta dentro da fronteira e retorna uma exception
		if (!(posicao >= 0 && posicao < vetor.length)) {
			throw new RuntimeException("Posicao invalida, favor informar uma posição entre "  + 0 +" e " + this.vetor.length);
		}

		// Veriicar se a posicção ja possui algum elemento e o substitui
		for (int i = posicao; i < this.tamanho; i++) {
			this.vetor[posicao] = this.vetor[i];
			}
			

		this.vetor[posicao] = elemento;
		this.tamanho++;
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










