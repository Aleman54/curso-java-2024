public class PruebaCrta {
  public static void main(String[] args) {
    Carta miPrimeraCarta = new Carta("banamex", "Jorge Luis", "Le ofrecemos una tarjeta");
    Carta otraCarta = new Carta("Jorge", "michael", "Haz tu tarea");
    System.out.println("El contenido de la carta es: \n" + miPrimeraCarta.getContenido());
    System.out.println("El contenido de la carta es: \n" + otraCarta.getContenido());
  }

}
