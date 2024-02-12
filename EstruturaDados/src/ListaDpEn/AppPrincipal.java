package ListaDpEn;

public class AppPrincipal {
	public static void main(String[] args) {
		
		try {
			ListasEncadeada lista = new ListasEncadeada();
			lista.add(0,"sara");
			lista.add(1,"marcos");
			lista.add(2,"Teste");
			lista.add(3,"roberto");
			lista.add(0, "teste0");
			lista.set(1, "teste1");
			lista.remove(0);

			
			
		
			System.out.println(lista.gettamanho());
		
			
			System.out.println(lista.get(0));
			System.out.println(lista.get(1));
			System.out.println(lista.get(2));
			System.out.println(lista.get(3));
			System.out.println(lista.get(4));
			
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
