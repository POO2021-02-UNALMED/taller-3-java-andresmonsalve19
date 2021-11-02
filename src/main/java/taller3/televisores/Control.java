package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOn() {
		tv.estado = true;
	}
	
	public void turnOff() {
		tv.estado = false;
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		if (tv.estado == true) {
			if (canal >= 1 && canal <= 120) {
				tv.setCanal(canal);
			}
		}	
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	public void setTV(TV tv) {
		this.tv = tv;
	}
	
	public TV getTV() {
		return tv;
	}
}
