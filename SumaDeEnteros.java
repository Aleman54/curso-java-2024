import java.util.Scanner;

public class SumaDeEnteros{
  public static void main(String[]args){
    //Atributos
    int a;
    int b;
    int resultado;
    
    
    Scanner entrada = new Scanner(System.in);
    //captura desde el teclado
    System.out.println("ingrese el primer numero");
    a = entrada.nextInt();

    System.out.println("ingrese el segundo numero");
    b = entrada.nextInt();
    resultado = a + b;
    System.out.printf("La suma de los numeros enteros es :%d", resultado);
  }

}