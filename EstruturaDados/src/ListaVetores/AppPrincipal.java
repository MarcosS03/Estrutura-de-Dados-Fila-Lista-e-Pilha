package ListaVetores;

public class AppPrincipal {
	public static void main(String[] args) {
		
		try {
			Listas lista = new Listas();
			lista.add(0, "teste");
			lista.add(1, "Marcos");
			lista.add(2, "algumacoisa");
			lista.add(1, "testeposicao");
			lista.set(1, "sara");
			lista.set(0, "Lucas");
			
	
			System.out.println(lista.get(1));
			System.out.println(lista.vetor.length);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}