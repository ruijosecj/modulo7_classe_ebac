package moduloClasseEbac;

public class Programa {
	public static void main(String[] args) {
		Carro gol = new Carro("Volkswagen Gol", "Prata", "NUS4669");
		gol.ligar();
		gol.acelerar(50);
		
		System.out.println(gol.toString());
		
	}

}
