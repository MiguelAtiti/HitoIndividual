package cuestion1;

public class Principal {

	
	public static void main(String[] args) {
		

		Pokemon squirtle = new Pokemon(007,"Squirtle","agua");
		
		
		//Aqui podemos ver como podriamos acceder al metodo daño o daño(int boost)
		squirtle.daño();
		squirtle.daño(2);
		
		
		Digimon Agumon = new Digimon(700,"Agumon","fuego");
		
		squirtle.llamar();
		Agumon.llamar();
		
		
		
	}

}
