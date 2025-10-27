package model;

import excepcion.ProductoException;

public class CajaAhorro extends ProductoBancario{

  public CajaAhorro(int banco, int sucursal) throws ProductoException {
    super(banco, sucursal);
  }
}
