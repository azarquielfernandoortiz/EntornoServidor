package controlador;

import modelo.Saluda;
import modelo.TablaMultiplicar;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Saluda saludo=new Saluda();
		saludo.diHola("Fernando");
		saludo.diAdios();
		saludo.diHastaLuego();
		saludo.diHastaSiempre();
		TablaMultiplicar tabla=new TablaMultiplicar();
		tabla.tablaDel(5);
		saludo.diComoVaTuSalud();

	}

}
