package org.donana;

/**
 * @author Isaura Galafate
 */
public class Cuenta {
  // Propiedades de la Clase Cuenta
  private String nombre;
  private String cuenta;
  private double saldo;

  /* Constructor sin argumentos */
  public Cuenta ()
  {
  }

  // Constructor con parámetro para iniciar todas las propiedades de la clase
  public Cuenta (String nom, String cue, double sal, double tipo)
  {
      nombre = nom;
      cuenta = cue;
      saldo = sal;
  }

  // Método para asignar el nombre del titular de la cuenta
  public void asignarNombre(String nom)
  {
      nombre = nom;
  }
  
  // Método que me devuelve el nombre del titular
  public String obtenerNombre()
  {
      return nombre;
  }

  // Método que me devuelve el saldo disponible en cada momento
  public double estado ()
  {
      return saldo;
  }

  /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
   * Este método va a ser probado con Junit
   */
  public void ingresar(double cantidad) throws Exception
  {
      if (cantidad < 0)
          throw new Exception("No se puede ingresar una cantidad negativa");
      saldo = saldo + cantidad;
  }

  /* Método para retirar cantidades en la cuenta. Modifica el saldo.
   * Este método va a ser probado con Junit
   */
  public void retirar (double cantidad) throws Exception
  {
      if (cantidad <= 0)
          throw new Exception ("No se puede retirar una cantidad negativa");
      if (estado() < cantidad)
          throw new Exception ("No se hay suficiente saldo");
      saldo = saldo - cantidad;
  }

  // Método que me devuelve el número de cuenta
  public String obtenerCuenta ()
  {
      return cuenta;
  }
}
