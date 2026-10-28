package daber;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in); 
		User a=new User();
		String Nombre;
		String Apellido;
		String Cedula;
		String Servicio;
		System.out.println("Ingrese Nombre");
		Nombre=teclado.nextLine();
		System.out.println("Ingrese Apellido");
		Apellido=teclado.nextLine();
		System.out.println("Ingrese Cedula");
		Cedula=teclado.nextLine();
		a.ingresarDatosUser(Nombre,Apellido, Cedula);
		System.out.println("Ingrese Servicio");
		Servicio=teclado.nextLine();
		a.generarServicio(Servicio);
		a.imprimirInfo();
		System.out.println("Acerquese al cubiculo: "+a.asignarCubiculo(1));
		
		
	}
}
