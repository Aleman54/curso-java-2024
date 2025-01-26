public class PruebaCarro {
  public static void main(String[] args) {
    // el coma , sirve para pasar parametros
    Carro carro1 = new Carro("corvette" , 1984);
    Carro carro2 = new Carro("jetta" , 2002);
    
    carro2.obtenerInformacion();
    carro1.obtenerInformacion();
    carro2.modelo = "passat";
    carro2.obtenerInformacion();
  }
}
