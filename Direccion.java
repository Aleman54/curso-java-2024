import java.util.Scanner;
public class Direccion{
  public static void main(String[] args){
    int opc;
    Scanner teclado = new Scanner(System.in);
    System.out.printf("%c A d%cnde quiere ir: ? \n (1)Arriba \n(2) izquierda \n(3) derecha\n (4) abajo\n", 191, 243);
    opc = teclado.nextInt();
    switch (opc) {
      case 1:
        System.out.println("Se mueve hacia arriba");
        break;
      case 2:
        System.out.println(" se mueve hacia la izquierda");
        break;
      case 3:
      System.out.println("se mueve hacia abajo");
      case 4:
      System.out.println("se mueve hacia abajo");
      break;
      default:
        System.out.println("No se mueve");
        break;
    }
  }
}