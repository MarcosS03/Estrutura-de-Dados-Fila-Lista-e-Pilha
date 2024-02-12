package PilhaEn;

public class AppPilha {
	public static void main(String[] args) {
		try {
			Pilha pilha =  new Pilha();
			pilha.push("marcos");
			pilha.push("sara");
			pilha.pop();
			
			
			
			
			
			System.out.println(pilha.top());
			System.out.println(pilha.size());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
