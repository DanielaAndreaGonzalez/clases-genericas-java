/**
 * 
 */
package Practica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Vehiculo <T>{
	
	private T modelo;
	private T color;
	private T marca;
	private T precio;
	
	public Vehiculo()
	{
		this.modelo=null;
		this.color=null;
		this.marca=null;
		this.precio = null;
	}
	
	public void setModelo(T modelo)
	{
		this.modelo = modelo;
	}
	public void setColor(T color)
	{
		this.color = color;
	}
	public void setMarca(T marca)
	{
		this.marca = marca;
	}
	public T getModelo()
	{
		return this.modelo;
	}
	public T getColor()
	{
		return this.color;
	}
	public T getMarca()
	{
		return this.marca;
	}
	
	public T getPrecio()
	{
		return this.precio;
	}
	
	public void setPrecio(T precio) {
		this.precio = precio;
	}
	
	
	

}
