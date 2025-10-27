package model;

import excepcion.ProductoException;

public class TarjetaCredito extends ProductoBancario {
  private int claveSeguridad;

  public TarjetaCredito(int banco, int sucursal, int claveSeguridad) throws ProductoException {
    super(banco, sucursal);
    if (claveSeguridad < 1000 || claveSeguridad > 9999) {
      throw new ProductoException("La clave de seguridad debe ser un número 4 cifras");
    }
    this.claveSeguridad = claveSeguridad;
  }

  // setter y getter
  public int getClaveSeguridad() {
    return claveSeguridad;
  }

  public void setClaveSeguridad() {
    this.claveSeguridad = claveSeguridad;
  }

  @Override
  public String toString() {
    return super.toString()
        + "\nClave de Seguridad: " + claveSeguridad;
  }
}
