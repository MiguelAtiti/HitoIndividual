package cuestion1;

public class Pokemon {

 private int n�Pokedex;
 private String nombre;
 private String tipo;
public int getN�Pokedex() {
	return n�Pokedex;
}
public void setN�Pokedex(int n�Pokedex) {
	this.n�Pokedex = n�Pokedex;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public Pokemon(int n�Pokedex, String nombre, String tipo) {
	super();
	this.n�Pokedex = n�Pokedex;
	this.nombre = nombre;
	this.tipo = tipo;
}
 

 public double da�o() {
	 
	double total= Math.random()*(2-5);
	 
	 
	 return total;
 }
 
 
 /*Aqui realizamos una sobrecarga en el metodo da�o para asi tener dos metodos "da�o" que hacen cosas distintas, en este caso el segundo metodo
 necesita un int "boost" para poder aumentar el total*/
 
 public double da�o(int boost) {
	 
	double total= Math.random()*(2-5)+boost ;
	 
	
	 
	 return total;
 }
 
 
 public void llamar() {
	 
	 System.out.println("APARECIO UN POKEMON");
	 
	 
 }
 
}
