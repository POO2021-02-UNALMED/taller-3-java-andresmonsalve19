package taller3.televisores;

public class TV {
	private Marca marca;
	private Control control;
	private int canal = 1;
	private int precio = 500;
	private int volumen = 1;
	boolean estado;
	static int numTV;
	
	TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	Marca getMarca() {
		return marca;
	}
	
	void setControl(Control control) {
		this.control = control;
	}
	
	Control getControl() {
		return control;
	}
	
	void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	int getVolumen() {
		return volumen;
	}
	
	void setPrecio(int precio) {
		this.precio = precio;
	}
	
	int getPrecio() {
		return precio;
	}
	
	void setCanal(int canal) {
		this.canal = canal;
	}
	
	int getCanal() {
		return canal;
	}
	
	static int getNumTV() {
		return numTV;
	}
	
	void turnOn() {
		estado = true;
	}
	
	void turnOff() {
		estado = false;
	}
	
	boolean getEstado() {
		return estado;
	}
	
	void canalUp() {
		if (estado == true) {
			if (canal >= 1 && canal <= 120) {
				canal++;
			} 
		}
	}
	
	void canalDown() {
		if (estado == true) {
			if (canal >= 1 && canal <= 120) {
				canal--;
			} 
		}
	}
	
	void volumenUp() {
		if (estado == true) {
			if (volumen >= 0 && volumen <= 7) {
				volumen++;
			} 
		}
	}
	
	void volumenDown() {
		if (estado == true) {
			if (volumen >= 0 && volumen <= 7) {
				volumen--;
			} 
		}
	}
}
