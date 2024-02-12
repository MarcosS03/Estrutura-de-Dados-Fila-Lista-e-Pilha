package PilhaVetores;



public class AppPilha {
	public static void main(String[] args) {

		try {
			Pilha pilha = new Pilha();
			pilha.enpilhar("sara");
			pilha.enpilhar("marcos");
			pilha.enpilhar("roberto");
			pilha.desenpilhar();
			
			
			System.out.println(pilha.top());
			
			System.out.println(pilha.tamanho);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
