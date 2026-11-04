package progra2;

public class Principal {

	public static void main(String[] args) {
		CuentaBancaria Persona_1 = new CuentaBancaria(1854785454,"Fernando Velez",1000);
		CuentaBancaria Persona_2 = new CuentaBancaria(1245875214,"Mayuri Velez",500);
		
		
		System.out.println("");
		Persona_1.depositar(-100);
		Persona_2.depositar(500);
		
		
		System.out.println("");
		Persona_1.retirar(950);
		Persona_2.retirar(1100);
		
		
		System.out.println("");
		System.out.println(Persona_1.getNumeroCuenta());
		System.out.println(Persona_1.getTitular());
		System.out.println(Persona_1.getSaldo());
		System.out.println("");
		
		
		System.out.println(Persona_2.getNumeroCuenta());
		System.out.println(Persona_2.getTitular());
		System.out.println(Persona_2.getSaldo());
		System.out.println("");
		
		
		System.out.println(CuentaBancaria.getTotalCuentas());
	}

}
