/**
 * 
 */
package Logica;

import java.util.ArrayList;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Ejemplo1Generics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList lista = new ArrayList();
		lista.add("Hol mundo");
		lista.add("Daniela");
		
		String cadena = (String) lista.get(0);
		System.out.println(cadena);
		
		
		

	}

}
