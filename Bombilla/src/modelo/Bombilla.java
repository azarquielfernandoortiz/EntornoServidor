package modelo;

public class Bombilla {
 
	private int vatios;
	private String estado;

	public Bombilla(int vatios,String estado) {
		this.vatios=vatios;
		this.estado=estado;
		if(!(this.estado.equals("ENCENDIDO"))&&!(this.estado.equals("APAGADO")))
				this.estado="ENCENDIDO";
	
	}
	public int getVatios() {
		return vatios;
	}
	public void setVatios(int vatios) {
		this.vatios = vatios;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void pulsarInterruptor(){
		if (this.estado.equals("ENCENDIDO"))
			this.estado="APAGADO";
		else
			this.estado="ENCENDIDO";
	}
}
