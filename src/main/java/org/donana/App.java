package org.donana;

/**
 * @author Isaura Galafate
 */
public class App {
    
    public static void main(String[] args) {
        Cuenta mi_cuenta;
        double saldo_actual;
        
        mi_cuenta = new Cuenta("Isaura Galafate", "1000-2365-85-123456789", 2500, 0);
        try 
        {
            mi_cuenta.retirar(2300);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
        
        try
        {
            System.out.println("Ingreso en cuenta");
            mi_cuenta.ingresar(1000);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        saldo_actual = mi_cuenta.estado();
        System.out.println("El saldo actual es: " + saldo_actual );
    }
}
