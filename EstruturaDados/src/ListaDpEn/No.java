package ListaDpEn;

public class No {
	private String elemento;
	private No proximo;
	private No anterior;
	
	
	
	
	public No(String elemento, No proximo, No anterior) {
		super();
		this.elemento = elemento;
		this.proximo = proximo;
		this.anterior = anterior;
	}

	public No(String elemento) {
		super();
		this.elemento = elemento;
		this.proximo = null;
		this.anterior = null;
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
	public No getAnterior() {
		return anterior;
	}
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	@Override
	public String toString() {
		return "No [elemento=" + elemento + ", proximo=" + proximo + ", anterior=" + anterior + "]";
	}
	
	


}
