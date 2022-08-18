package Logic;

/**
*
* @author marce
*/
public class Persona {
   private float peso;
   private float estatura;

   public Persona(float peso, float estatura) {
       this.peso = peso;
       this.estatura = estatura;
   }

   public float getPeso() {
       return peso;
   }

   public void setPeso(float peso) {
       this.peso = peso;
   }

   public float getEstatura() {
       return estatura;
   }

   public void setEstatura(float estatura) {
       this.estatura = estatura;
   }
   
}
