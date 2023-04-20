/**
 * 
 */
package Logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Tienda <T,U,V>{

	
	//los 2 primeros atributos van a ser de tipo string
	
	private T codigo;
	private T nombre;
	private U precio;
	private V Pventa;
	static ArrayList<Tienda> productos=new ArrayList<Tienda>();
	
	public Tienda(T codigo, T nombre, U precio, V pventa) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		Pventa = pventa;
	}
	public Tienda()
	{
		
	}

	public T getCodigo() {
		return codigo;
	}

	public void setCodigo(T codigo) {
		this.codigo = codigo;
	}

	public T getNombre() {
		return nombre;
	}

	public void setNombre(T nombre) {
		this.nombre = nombre;
	}

	public U getPrecio() {
		return precio;
	}

	public void setPrecio(U precio) {
		this.precio = precio;
	}

	public V getPventa() {
		return Pventa;
	}

	public void setPventa(V pventa) {
		Pventa = pventa;
	}
	
	
	
	//Construir clase main que utilice generics por medio de un arrayList, manejando un menú 
	//que cargue 5 objetos 
	//Menú
	//1. Cargar ( se carga del arrayList)
	//2. Consultar de manera general 
	//3. Consultar solo los nombres
	//4.Consultar nombre,precio
	//5. Consultar codigo y preciodeVenta
	//6.salir
	@Override
	public String toString() {
		String mensaje="";
		for(Tienda t:productos) {
			mensaje+= "Tienda Ara [codigo=" + t.codigo + ", nombre=" + t.nombre + ", precio=" + t.precio + ", Pventa=" + t.Pventa + "]\n";
		}
		return mensaje;
	}

	public void ejecutar() {
		int opcion = 0;
		boolean bandera = true;
		while (bandera) {
			
			
			opcion= leerEntero("Ingrese la opcion");
			switch (opcion) {
			case 1:
				cargarDatos();
				JOptionPane.showMessageDialog(null, "Éxito!!");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, toString());
				break;
			case 3:
				consultarNombre();
				break;
			case 4:
				consultarNombreYprecio();
				break;
			case 5:
				consultarCodigoyPventa();
				break;
			case 6:
				bandera= false;
			default:
				JOptionPane.showMessageDialog(null, "Opción incorrecta");
			}

		}
		
	}
	
	public static void imprimirMenu()
	{
		System.out.println("######################");
		System.out.println("Bienvenidos a Tienda Ara");
		System.out.println("Presione 1. para Cargar los datos");
		System.out.println("Presione 2. para consulta General");
		System.out.println("Presione 3. para consultar nombre");
		System.out.println("Presione 4. para consultar nombres y precios");
		System.out.println("Presione 5. para consultar código y precio de venta");
		System.out.println("Presione 6 para salir");
		System.out.println("########################");	
	}
	
	public int leerEntero(String mensaje)
	{
		//System.out.println(mensaje);
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenidos a Tienda Ara\n"
																+ "Presione 1. para Cargar los datos\n"
																+"Presione 2. para consulta General\n"
																+"Presione 3. para consultar nombre\n"
																+"Presione 4. para consultar nombres y precios\n"
																+"Presione 5. para consultar código y precio de venta\n"
																+"Presione 6 para salir"));
		return opcion;
	}
	
	
	public static ArrayList<Tienda> cargarDatos()
	{
		//ArrayList<Tienda> productos=new ArrayList<Tienda>();
		Tienda producto1 = new Tienda("COD001", "Arroz", 2000 ,2600);
		Tienda producto2 = new Tienda("COD002", "Lentejas", 2500 ,3200);
		Tienda producto3 = new Tienda("COD003", "Leche", 1500 ,2600);
		Tienda producto4 = new Tienda("COD004", "Frijol", 3000,3700);
		Tienda producto5 = new Tienda("COD005", "Huevos", 10000 ,17000);
		productos.add(producto1);
		productos.add(producto2);
		productos.add(producto3);
		productos.add(producto4);
		productos.add(producto5);
		return productos;
	}
	
	public void consultarNombre()
	{
		String mensaje="";
		for(Tienda t:productos) {
			mensaje+= "Tienda Ara [ nombre=" + t.nombre +"]\n";
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void consultarNombreYprecio()
	{
		String mensaje="";
		for(Tienda t:productos) {
			mensaje+= "Tienda Ara [ nombre=" + t.nombre + ", precio=" + t.precio+ "]\n";
		}	
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void consultarCodigoyPventa()
	{
		String mensaje="";
		for(Tienda t:productos) {
			mensaje+= "Tienda Ara [codigo=" + t.codigo  + ", Pventa=" + t.Pventa + "]\n";
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	
}
