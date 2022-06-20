package cuestion1;

public class Digimon extends Pokemon {

	public Digimon(int nºPokedex, String nombre, String tipo) {
		super(nºPokedex, nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	
	/*Aqui realizamos una sobreescritura para poder cambiar el metodo llamar de la clase pokemon*/
	
	public void llamar() {
		
		 System.out.println("APARECIO UN DIGIMON");
		
		
		
	}

}
