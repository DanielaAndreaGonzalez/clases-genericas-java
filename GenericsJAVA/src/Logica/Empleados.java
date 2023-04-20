/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Empleados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conjunto<String> dato = new Conjunto<String>();
		dato.setInicio("Daniela");
		System.out.println(dato.getInicio());
		Persona union = new Persona("Andrea");
		Conjunto<Persona> dato1 = new Conjunto<Persona>();
		dato1.setInicio(union);
		System.out.println(dato1.getInicio());
		Conjunto<Integer> dato2 = new Conjunto<Integer>();
		dato2.setInicio(6);
		System.out.println(dato2.getInicio());
		
		

	}

}
