package Ejercicio_1;

public class Pato extends Animal {
	String sColorPlumas;
	
	
	public String getsColorPlumas() {
		return sColorPlumas;
	}


	public void setsColorPlumas(String sColorPlumas) {
		this.sColorPlumas = sColorPlumas;
	}


	public Pato() {
		// TODO Auto-generated constructor stub
	}


	public Pato(String sColorPlumas) {
		super();
		this.sColorPlumas = sColorPlumas;
	}


	public Pato(String sNombre, int iPatas) {
		super(sNombre, iPatas);
		// TODO Auto-generated constructor stub
	}

	
}
