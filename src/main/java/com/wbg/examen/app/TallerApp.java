package com.wbg.examen.app;

import com.wbg.examen.app.facturacion.Factura;

public class TallerApp {
	public static void main(String[] args) {

		Factura factura = new Factura();
		double subtotal = factura.obtenerFactura(2.90, 3.90, 2.80);
		double cambio = factura.cobrarFactura(10.60, subtotal);

	}

}
