package Imc;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      Imc estatura = new Imc();
      Imc peso = new Imc();
     
      float estaturaPersona= estatura.getEstatura();
      float PesoPersona= peso.getPeso();
      float imc= ( PesoPersona/(estaturaPersona*estaturaPersona));
      System.out.println(imc);
      if(imc<=18.5) {
    	  System.out.println("Peso inferior al normal");
      }
      if(imc >18.5 && imc <=24.9) {
    	  System.out.println("Peso Normal"); 
      }
      if(imc >=25.0 && imc <=29.9) {
    	  System.out.println("Peso superior al normal"); 
      }
      if(imc >=30.0){
    	  System.out.println("Obesidad"); 
      }
      else {
    	  System.out.println("");
      }
	}
	
	
	

}