package FilaVetores;


public class AppFila {
public static void main(String[] args) {
		
		try {
			Fila fila = new Fila();
			fila.enfileirar("teste1");
			fila.enfileirar("marcos");
			
			fila.enfileirar("sara");
			
			fila.desenfileirar();
			fila.isEmpty();
			
			
			
			
	
			System.out.println(fila.front());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
