package Ejercicio_1;

public class Gato extends Animal {
	String sRaza;
	
	public String getsRaza() {
		return sRaza;
	}


	public void setsRaza(String sRaza) {
		this.sRaza = sRaza;
	}


	public Gato() {
		// TODO Auto-generated constructor stub
	}


	public Gato(String sRaza) {
		super();
		this.sRaza = sRaza;
	}


	public Gato(String sNombre, int iPatas) {
		super(sNombre, iPatas);
		// TODO Auto-generated constructor stub
	}

}
