public class Cachorro extends Mamifero {
   @Override
    public void locomover(){
       System.out.println("Andando");
   }

   public void reagir(String frase){
       if(frase == "comida" || frase== "passeio"){
           System.out.println("Abanar e Latir");
       }else {
           System.out.println("Rosnar");
       }
   }

   public void reagir(int hora, int minuto){
       if(hora<12){
           System.out.println("Abanar");
       }else if (hora>=18){
           System.out.println("Ignorar");
       }
   }


}
