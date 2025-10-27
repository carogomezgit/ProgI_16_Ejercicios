import excepcion.ProductoException;
import model.CajaAhorro;
import model.CuentaCorriente;
import model.TarjetaCredito;

public class Main {

  /** Ejercicio: Productos bancarios
   * Crear un programa que pueda almacenar los productos de una entidad bancaria (CA, CC y TC), con las siguientes condiciones:
   * 1. Las CA y CC poseen Banco, Sucursal, Número  de Producto.
   * 2. Las Tarjetas de Crédito poseen Banco,  Sucursal, Número de Producto y Clave de Seguridad.
   * 3. El número de producto se genera  automáticamente e incrementa de uno en uno por producto.
   * 4. El número de producto no se puede pedir por el constructor.
   * 5. Para este desafío, el Banco y la Sucursal son números enteros.
   */

  public static void main(String[] args) {
    CajaAhorro cajaAhorro1 = new CajaAhorro(1, 100);
    CuentaCorriente cuentaCorriente1 = new CuentaCorriente(-1, 101);
    TarjetaCredito tarjetaCredito1 = new TarjetaCredito(2, 102, 999);
  }
}