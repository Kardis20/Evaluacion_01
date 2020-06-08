package Ejercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Animal animal = new Animal();
		
		Gato gato2 = new Gato();
		Gato gato = new Gato("Figaro");
		Perro perro = new Perro();
		
		perro.setsNombre("Tomas");
		perro.setiPatas(4);
		
		System.out.println("Nombre del Perro: "+ perro.getsNombre());
		System.out.println("Raza del Perro: " + perro.getsRaza());
		System.out.println("Patas del Perro: " + perro.getiPatas());
		
		Animal animal2 = new Gato();
		System.out.println("Ingrese el nombre del gato: ");
		String sRaza = scan.next();
	}

}
