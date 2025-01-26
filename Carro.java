public class Carro {
  // atributos
  public String modelo;
  public int anio;

    //constructor
    public Carro(String mod, int an){
      modelo =mod;
      anio =an;
    }

    //metodos
    public void obtenerInformacion() {
      //el mas sirve para concatenar valores
      System.out.println("Este carro es " + modelo + " y es anio " + anio);
    }
    
  }

