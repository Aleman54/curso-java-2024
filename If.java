public class If{
  public static void main(String[] args) {
    String color1 = "verde";
    String color2 = "amarillo";
    String color3 = new String("rojo");

    String semaforo = "rojo";
    if(semaforo == color1){
        System.out.println("Automovil avanzando");
    }else if (semaforo == color2) {
        System.out.println("Automovil frenando");
    }else{
      System.out.println("Automovil detenido");
    }



  }


}