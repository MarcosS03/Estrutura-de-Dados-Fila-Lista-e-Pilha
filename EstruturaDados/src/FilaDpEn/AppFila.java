package FilaDpEn;

public class AppFila {
	public static void main(String[] args) {
		try {
			Fila fila = new Fila();
			fila.enfileirar ("Sara");
			fila.enfileirar("Marcos");
			fila.enfileirar("paulo");
			fila.desenfileirar();
			
			
			
			
			System.out.println(fila.front());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
