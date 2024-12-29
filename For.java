import java.util.Scanner;

public class For {
  public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);
    int limite;
    System.out.println("Hasta que numero quieres que cuente ?");
    limite = entrada.nextInt();
    for(int i=0; i<=limite; ++i){
      
      System.out.println(i);
    }
    System.out.println("\nInverso");

    for(int i=limite; i>=1; i--){
      System.out.println(i);
    }
  }
}