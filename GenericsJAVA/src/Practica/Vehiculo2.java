/**
 * 
 */
package Practica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Vehiculo2 {
	
	private String modelo;
	private String color;
	private String marca;
	private String precio;
	

	public Vehiculo2(String modelo, String color, String marca, String precio) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.marca = marca;
		this.precio = precio;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	public String toString()
	{
		return modelo;
	}
	
	public String toString2()
	{
		return precio;
	}

}
