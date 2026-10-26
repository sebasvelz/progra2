package Servicio;

public class ServiciosCliente {
	String nombre="";
	String apellido="";
	String cedula="";
	String servicio="";
	int turnoAsignado;
	static int nTurno=0;
	public String ingresarDatosU(String nombre1, String apellido1, String cedula1){
		nombre=nombre1;
		apellido=apellido1;
		cedula=cedula1;
		return (nombre+ apellido+ cedula);
	}
	public String generarServicio( String servicio1) {
		servicio=servicio1;
		nTurno=nTurno+1; 
		turnoAsignado=nTurno;
		return servicio + turnoAsignado;
	}
	public void imprimirInformacion() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+ apellido);
		System.out.println("Cedula: "+cedula); 
		System.out.println("Servicio deseado: "+servicio); 
		System.out.println("Su turno asignado es: "+turnoAsignado);
	}
	public int asignarCubiculo(int cubiculoDesocupado) {
		return cubiculoDesocupado;
	}
}
