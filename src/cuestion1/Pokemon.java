package cuestion1;

public class Pokemon {

 private int nºPokedex;
 private String nombre;
 private String tipo;
public int getNºPokedex() {
	return nºPokedex;
}
public void setNºPokedex(int nºPokedex) {
	this.nºPokedex = nºPokedex;
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
public Pokemon(int nºPokedex, String nombre, String tipo) {
	super();
	this.nºPokedex = nºPokedex;
	this.nombre = nombre;
	this.tipo = tipo;
}
 

 public double daño() {
	 
	double total= Math.random()*(2-5);
	 
	 
	 return total;
 }
 
 
 /*Aqui realizamos una sobrecarga en el metodo daño para asi tener dos metodos "daño" que hacen cosas distintas, en este caso el segundo metodo
 necesita un int "boost" para poder aumentar el total*/
 
 public double daño(int boost) {
	 
	double total= Math.random()*(2-5)+boost ;
	 
	
	 
	 return total;
 }
 
 
 public void llamar() {
	 
	 System.out.println("APARECIO UN POKEMON");
	 
	 
 }
 
}
