public class PruebaPersona {
  public static void main(String[] args ) {
    Persona persona1 = new Persona("michael", 22);
    Persona persona2 = new Persona("Jorge");
    Persona persona3 = new Persona("carlos", 29);
    
    //Asignacion en solo metodos public
    persona1.edad = 25;
    persona1.nombre = "MIchael 2.0";


    persona1.saludar();
    persona1.despedir();
    persona1.decirNombre();
    
    persona1.decirEdad();
    
    persona2.despedir();
    persona3.decirEdad();
    
  }
}
