public class Persona {
  //atributos
  public String nombre;
  public int edad;
  public String direccion;
  public String curp;

  
  //seccion de metodos
  //El constructor se manda a llamar
  public void decirEdad(){
    
    System.out.println("Me llamo :" + nombre + "y mi edad es " + edad );
  }
  //constructor
  public Persona (String nom){
    nombre =nom;
  }
  public Persona (String nom, int ed){
    nombre =nom;
    edad = ed;
  }
  public Persona (int ed){
    edad =ed;
  }

  
  public void decirNombre(){
    System.out.println("Mi nombre es " + nombre);
  }

  public void saludar(){
    System.out.println("Hola");
  }
  public void despedir(){
    System.out.println("adios");
  }
}
