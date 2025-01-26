public class PruebaTrabajador {
  public static void main(String[] args) {
    Trabajador trabajador1 = new Trabajador();
    Trabajador trabajador2 = new Trabajador();

    trabajador1.nombre = "Jorge";
    trabajador1.turno = "matutino";
    trabajador1.sueldo = 7000;
    trabajador1.trabajar();
    trabajador1.cobrarSueldo();
    Trabajador.nombreEmpresa = "TV azteca";
    trabajador1.decirNombreEmpresa();
    
    System.out.println();

    trabajador2.nombre = "michael";
    trabajador2.turno = "vespertino";
    trabajador2.sueldo = 5000;
    trabajador2.trabajar();
    trabajador2.cobrarSueldo();
    trabajador2.decirNombreEmpresa();

    
  }
}
