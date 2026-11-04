package progra2;

public class CuentaBancaria {
	
	static String nombreBanco="Pichincha";
	static int totalCuentasCreadas=0;
	
	int numeroCuenta;
	String titular;
	double saldo=0;
	
	public CuentaBancaria(int numeroCuenta, String titular, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		totalCuentasCreadas=totalCuentasCreadas+1;
		if (saldo>=0) {
			this.saldo = saldo;
		}else {
			System.out.println("Saldo Invalido");
		}
		System.out.println("Cuenta creada con exito  Saldo = " + this.saldo);
	}

	
	public static String getNombreBanco() {
		return nombreBanco;
	}
	
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	
	public String getTitular() {
		return titular;
	}

	
	public void setTitular(String titular) {
		
		if (titular == null || titular=="") {
			System.out.println("Esta vacio el titular");
		}else {
			this.titular = titular;
		}
	}

	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		
		if(saldo>=0) {
			this.saldo = saldo;
		}else {
			System.out.println("saldo Invalido");
		}
	}

	
	public void depositar(double monto) {
		double bonificacion=0;
		
		if(monto>=500) {
			bonificacion=monto*0.15;
			System.out.println("Exito en depositar");
		}
		
		if(monto>0) {
			saldo=saldo+monto+bonificacion;
		}else {System.out.println("El monto es invalido");}
	}
	
	
	public boolean retirar(double monto) {
		double comision=1.36;
		
		if (saldo>=monto+comision) {
			saldo=saldo-(monto+comision);
			System.out.println("Exito en retiro");
			return true;
		}else {
			System.out.println("Fondos insuficientes");
			return false;
		}
	}
	
	
	public static int getTotalCuentas() {
		return totalCuentasCreadas;
	}
}
