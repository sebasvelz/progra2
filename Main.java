package Servicio;

public class Main {

	public static void main(String[] args) {
		ServiciosCliente a=new ServiciosCliente();
		a.ingresarDatosU("Sebastian", "Velez ", "1751694934");
		a.generarServicio("Compra-Equipo");
		a.imprimirInformacion();
		System.out.println("Acerquese al cubiculo: "+a.asignarCubiculo(1));
		
		ServiciosCliente b=new ServiciosCliente();
		b.ingresarDatosU("Mayuri", "Velez ", "1751101591");
		b.generarServicio("Atencion al Cliente");
		b.imprimirInformacion();
		System.out.println("Acerquese al cubiculo: "+a.asignarCubiculo(5));
	}

}
