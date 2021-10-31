package taller3_github;

public class Control {
	private TV tv;
	
	void turnOn() {
		tv.estado = true;
	}
	
	void turnOff() {
		tv.estado = false;
	}
	
	void canalUp() {
		tv.canalUp();
	}
	
	void canalDown() {
		tv.canalDown();
	}
	
	void volumenUp() {
		tv.volumenUp();
	}
	
	void volumenDown() {
		tv.volumenDown();
	}
	
	void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	void setTV(TV tv) {
		this.tv = tv;
	}
	
	TV getTV() {
		return tv;
	}
}
