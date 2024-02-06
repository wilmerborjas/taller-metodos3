package com.wbg.examen.app.facturacion;

public class Factura {

	public double obtenerFactura(double valorCocacola, double valorCerveza, double valorZumo) {
		double subtotal = valorCocacola + valorCerveza + valorZumo;
		System.out.println("cocacola = " + valorCocacola);
		System.out.println("cerveza = " + valorCerveza);
		System.out.println("Zumo = " + valorZumo);
		System.out.println("subtotal = " + subtotal);
		return subtotal;

	}

	public double cobrarFactura(double efectivo, double subtotal) {
		double cambio = efectivo - subtotal;
		System.out.println("Cambio = " + cambio);
		return cambio;

	}

}
