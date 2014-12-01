package controlador;

import modelo.Bombilla;

public class Principal {

	public static void main(String[] args) {
		Bombilla bombilla1=new Bombilla(60,"APAGADO");
		System.out.println("El estado de la bombilla1 es: "+bombilla1.getEstado());
		bombilla1.pulsarInterruptor();
		System.out.println("El estado de la bombilla1 es: "+bombilla1.getEstado());

	}

}
