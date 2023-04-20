/**
 * 
 */
package Practica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Corredor {

	
	public static void main(String args[])
	{
		
		Vehiculo<String> vehiculo = new Vehiculo<String>();
		
		vehiculo.setModelo("2026");
		vehiculo.setColor("Rojo");
		vehiculo.setMarca("Chevrolet");
		
		System.out.println(vehiculo.getModelo());
		System.out.println(vehiculo.getColor());
		System.out.println(vehiculo.getMarca());	
	}
	
	
}
