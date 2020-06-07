package Ejercicio_1;

public class Animal {
	String sNombre;
	int iPatas;
	
	public String getsNombre() {
		return sNombre;
	}



	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}



	public int getiPatas() {
		return iPatas;
	}



	public void setiPatas(int iPatas) {
		this.iPatas = iPatas;
	}

	public Animal() {
		
	}

	public Animal(String sNombre, int iPatas) {
		super();
		this.sNombre = sNombre;
		this.iPatas = iPatas;
	}
}
