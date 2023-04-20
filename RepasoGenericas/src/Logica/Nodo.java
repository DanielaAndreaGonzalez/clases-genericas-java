/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Nodo<E> {

	private E  valor;
	Nodo<E> siguiente;
	
	public Nodo()
	{
		
		this.siguiente = null;
		
	}
	
	
	
	
	
	public E getValor() {
		return valor;
	}
	public void setValor(E valor) {
		this.valor = valor;
	}
	public Nodo<E> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo<E> siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
	



}





