public class PruebaCuenta {
  public static void main(String[] args) {
    Cuenta c1 = new Cuenta("Jorge", 1500);
    System.out.println("Cuentas creadas: " + Cuenta.cuentasCreadas);
   
    Cuenta c2 = new Cuenta("Michael", 3000);
    System.out.println("Cuentas creadas: " + Cuenta.cuentasCreadas);

    Cuenta c3 = new Cuenta("manuel", 2100);
    System.out.println("Cuentas creadas: " + Cuenta.cuentasCreadas);

    Cuenta c4 = new Cuenta("alejandro", 210);
    System.out.println("Cuentas creadas: " + Cuenta.cuentasCreadas);

    c2.imrpimirTitular();
    c2.consultarSaldo();
    c2.abonarSaldo(1000);
    c2.consultarSaldo();

    c2.retirarSaldo(500);
    c2.consultarSaldo();
    c2.retirarSaldo(-100);
    c2.consultarSaldo();
    c2.retirarSaldo(5000);

    c2.consultarSaldo();
 
  }
}
  

