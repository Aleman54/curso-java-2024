import java.util.Scanner;
public class NumeroParImpar {
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int numeroRepeticiones;
    
    System.out.println("hasta que numero contare : ");
    numeroRepeticiones = teclado.nextInt();

    for(int i=1; i<=numeroRepeticiones; i++){
      if (i % 2 == 0) {
        System.out.println(i + " es par");        
      }else{
        System.out.printf("%d es impar \n", i);
      }

      if (i == numeroRepeticiones) {
        System.out.print("es el ultimo numero");
      }
      if( i % 10 == 0 &&  i != numeroRepeticiones){
        System.out.println();
      }
      
    }
    teclado.close();
  }
}
