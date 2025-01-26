/**
 * Trabajador
 */
public class Trabajador {
  //ATRIBUTOS:caracteristicas DE UNA CLASE
  public int sueldo = 0;
  public String turno = "";
  public String nombre = "";
  // caracteristicas de un constructor
  // * es publico 
  // * se llama igual que la clase y lleva mayuscula 
  // *no regresa ningun valor
  public Trabajador(){
    
  }


  //STATIC: se utiliza uando los objetos de una clase reutilizan una propiedad
  public static String nombreEmpresa = "Televisa";

  //METODOS: acciones de una clase (lo que hace)

  public void trabajar(){
    System.out.println("Soy " + this.nombre + " y estoy trabajando en el turno " + this.turno +  "¡¡");

  }
  public void cobrarSueldo(){
    System.out.println("estoy cobbrando mi sueldo de $" + this.sueldo);

  }
  public void decirNombreEmpresa() {
    System.out.println("TRabajo en la empresa " + Trabajador.nombreEmpresa);
    
  }

}