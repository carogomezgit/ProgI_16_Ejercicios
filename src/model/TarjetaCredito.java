package model;

public class TarjetaCredito extends ProductoBancario {
  private int claveSeguridad;

  public TarjetaCredito(int banco, int sucursal, int claveSeguridad) {
    super(banco, sucursal);
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
        + "\n Clave de Seguridad: " + claveSeguridad;
  }
}
