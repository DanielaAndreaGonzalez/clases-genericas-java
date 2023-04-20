/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
//Clase de tipo generica
//En genericos no se maneja con tipos de datos
public class Conjunto <T>{

	//Atributo de tipo generico
	private T inicio;
	
	public Conjunto()
	{
		inicio=null;
	}
	//Recibe mismo tipo de dato de la clase, es decir generico
	public void setInicio(T numero)
	{
		inicio = numero;
	}
	public T getInicio()
	{
		return inicio;
	}
	
}
