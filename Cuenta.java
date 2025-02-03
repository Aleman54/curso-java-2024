import java.util.Random;

public class Cuenta {
  private double saldo;
  private String nombre;
  private int numeroCuenta;
  
  static int cuentasCreadas = 0;

  public Cuenta(String nombrePersona, double saldo){
      nombre = nombrePersona;
      if (saldo< 2000 ){ 
        System.out.println("No alcanza saldo para abrir Cuenta");
      
     }else{
        this.saldo = saldo;
        Random r = new Random();
        //creando un numero aleatorio entre 0 y 100
        numeroCuenta = r.nextInt(100);
        System.out.println("Cuenta " + numeroCuenta + " creada");
        cuentasCreadas++;
      }
  }
  public  void imrpimirTitular(){
    System.out.println("El titular de la cuenta es " + this.nombre);
  }
  public void consultarSaldo(){
    System.out.println("El saldo de la cuenta es " + this.saldo);
  }
  public void abonarSaldo(double saldoADepositar){
    this.saldo = this.saldo + saldoADepositar;
  }
  
  public void retirarSaldo(double saldoADescontar) {
    if (saldoADescontar > saldo) {
      System.out.println("No tienes suficientes fondos para retirar");
      return;
    }
    if(saldoADescontar > 0){
      this.saldo = this.saldo - saldoADescontar;
    }else{
      System.out.println("Cantidad invalida para retirar");
    }
    return;
    
  }
}
