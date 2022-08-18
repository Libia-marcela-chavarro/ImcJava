package Logic;

import java.util.Scanner;

/**
*
* @author marce
*/
public class Principal {

   public static float calcularIMC(Persona persona) {
       float imc = (persona.getPeso() / (persona.getEstatura() * persona.getEstatura()));
       return imc;
   }

   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Ingrese su peso: ");
       float peso = entrada.nextFloat();
       System.out.println("Ingrese su estatura: ");
       float estatura = entrada.nextFloat();

       Persona persona1 = new Persona(peso, estatura);
       float imc = calcularIMC(persona1);
       System.out.println("El imc de la persona es igual a: " + imc);

       if (imc <= 18.9) {
           System.out.println("peso estable");
       } else if (imc > 18.9 && imc <= 24.9) {
           System.out.println("Peso normal");
       } else if (imc > 24.9 && imc <= 29.9) {
           System.out.println("Peso elevado");
       } else if (imc > 30.0) {
           System.out.println("obesidad");
       }

   }
}
