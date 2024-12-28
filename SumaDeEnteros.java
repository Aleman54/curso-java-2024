import java.util.Scanner;

public class SumaDeEnteros{
  public static void main(String[]args){
    //
    //Atributos
    int a;
    int b;
    int resultado;
    String nombreDelUsuario;
    
    Scanner entrada = new Scanner(System.in);
    
    //captura desde el teclado
    System.out.println("ingresa tu nombre");
    nombreDelUsuario = entrada.nextLine();
    System.out.println("ingrese el primer numero");
    a = entrada.nextInt();

    System.out.println("ingrese el segundo numero");
    b = entrada.nextInt();
    resultado = a + b;
    System.out.printf("Hola, tu nombre es : %s La suma de los numeros enteros es :%d", nombreDelUsuario, resultado);
  
  }

}