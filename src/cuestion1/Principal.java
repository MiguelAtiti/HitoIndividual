package cuestion1;

public class Principal {

	
	public static void main(String[] args) {
		

		Pokemon squirtle = new Pokemon(007,"Squirtle","agua");
		
		
		//Aqui podemos ver como podriamos acceder al metodo da�o o da�o(int boost)
		squirtle.da�o();
		squirtle.da�o(2);
		
		
		Digimon Agumon = new Digimon(700,"Agumon","fuego");
		
		squirtle.llamar();
		Agumon.llamar();
		
		
		
	}

}
