import java.util.Scanner;

public class NombreRepetido {
  /**
   * @param args
   */
  public static void main(String[] args){
    
    Scanner teclado = new Scanner(System.in);
    String nombre;
    int numeroRepeticiones;
    
    System.out.println("Cual es tu nombre ?");
    nombre = teclado.nextLine();
    
    System.out.println("Cuantas veces repito tu nombre :");
    numeroRepeticiones = teclado.nextInt();

    if(numeroRepeticiones <=10){ 
      for(int i=0; i < numeroRepeticiones; i++){
      
        System.out.println(nombre);
      }
    }else{
      System.out.println("Error, el maximo numero es 10");
    }
    teclado.close();
  }
}