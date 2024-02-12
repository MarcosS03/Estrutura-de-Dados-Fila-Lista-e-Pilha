package PilhaEn;

public class No {
	private String elemento;
	private No proximo;




	public No(String elemento, No proximo) {
		super();
		this.elemento = elemento;
		this.proximo = proximo;

	}

	public No() {
		// TODO Auto-generated constructor stub
	}

	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
}
