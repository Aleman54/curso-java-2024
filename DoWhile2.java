import java.util.Scanner;
public class DoWhile2 {
  public static void main(String[] args) {
    // Si el usuario ingresa un numero entre 1 y 10 no se salga
    int numeroIngresado;
    Scanner teclado = new Scanner(System.in);
    do {
      System.out.println("Para continuar ingresa un numero entre el 1 y 10 \n");
      numeroIngresado = teclado.nextInt();
    } while (numeroIngresado <= 10 && numeroIngresado >= 1);
  }

}