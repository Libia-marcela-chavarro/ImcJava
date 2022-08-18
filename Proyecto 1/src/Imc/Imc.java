package Imc;

import java.util.Scanner;

public class Imc {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  getEstatura();
		  getPeso();
	}
	 public static float getEstatura() {
		 float estatura;
		 Scanner Estatura = new Scanner(System.in);
	     System.out.println("Calcule su IMC");
	     System.out.println("Ingrese la estatura en CM");
	     return estatura = Estatura.nextFloat();
	     
	 }
	 public static float getPeso() {
		 float peso;   
	     Scanner Peso = new Scanner(System.in);
	     System.out.println("Ingrese la peso en CM");
	     return peso = Peso.nextFloat();
	 }

}
