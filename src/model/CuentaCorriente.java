package model;

import excepcion.ProductoException;

public class CuentaCorriente extends ProductoBancario {

  public CuentaCorriente(int banco, int sucursal) throws ProductoException {
    super(banco, sucursal);

    if (banco <= 0 || sucursal <= 0) {
      throw new ProductoException("Banco y sucursal deben ser mayores que 0.");
    }
  }
}
