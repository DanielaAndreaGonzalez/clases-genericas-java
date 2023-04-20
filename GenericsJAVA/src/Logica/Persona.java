/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Persona {
	String nombre;
	public Persona(String nombre)
	{
		this.nombre = nombre;
	}
	
	//Es necesario el método toString para el cargue del nombre y no la direccion de memoria donde
	//Se encuentra este objeto 
	public String toString()
	{
		return nombre;
	}

}
