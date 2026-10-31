public class Criatura {
    private String nombre;
    private int vida;
    private int fuerza;
   public Criatura (String nombre, int vida,int fuerza){
       this.nombre = nombre;
       this.vida = vida;
       this.fuerza = fuerza;
   }
   public int atacar(){
       return fuerza;
   }
   public void recibirdanio(int danio){
       this.vida-=danio;
   }
   public boolean estavivo(){
       if(vida<=0){
           return false;
       }
       return true;
   }
}
