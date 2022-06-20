package cuestion2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) throws FileNotFoundException {
		 File examen = new File("src/examen.txt");
		 File respuestas = new File("src/respuestas.txt");
		 Scanner lectorEX = new Scanner(examen);
		 Scanner lectorRES = new Scanner(respuestas);
		 Scanner lector = new Scanner(System.in);

		 System.out.println("Escribe las respuestas en minuscula");
			 double nota = 0;
			 String linea = lectorEX.nextLine();
			 System.out.println(linea);
			 String r1=lector.nextLine();
			 String lineares = lectorRES.nextLine();
			
			 if(r1.equals(lineares)) {
				 
				 nota++;
				 
			 }
			 else {
				 
				 nota = nota-0.5;
			 }
			 
			 
			 String linea2 = lectorEX.nextLine();
			 System.out.println(linea2);
			 String r2=lector.nextLine();
			 String lineares2= lectorRES.nextLine();
			
			 
	         if(r2.equals(lineares2)) {
				 
				 nota++;
				 
			 }
			 else {
				 
				 nota = nota-0.5;
			 }
			 
			 
	         String linea3 = lectorEX.nextLine();
			 System.out.println(linea3);
			 String r3=lector.nextLine();
			 String lineares3= lectorRES.nextLine();
			 
			  if(r3.equals(lineares3)) {
					 
					 nota++;
					 
				 }
				 else {
					 
					 nota = nota-0.5;
				 }
			  
			  
			  System.out.println("la nota final es"+ nota);

	}

}
