package model;

public class ProductoBancario {
  // atributos
  private int banco;
  private int sucursal;
  private int num = 0;
  private int numProducto; // no se pide por constructor

  public ProductoBancario(int banco, int sucursal) {
    this.banco = banco;
    this.sucursal = sucursal;
    this.numProducto = num++;
  }

  // getters y setters
  public int getBanco() {
    return banco;
  }

  public void setBanco(int banco) {
    this.banco = banco;
  }

  public int getSucursal() {
    return banco;
  }

  public void setSucursal(int sucursal) {
    this.sucursal = sucursal;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public int getNumProducto() {
    return numProducto;
  }

  public void setNumProducto(int numProducto) {
    this.numProducto = numProducto;
  }

  public String toString() {
    return "Banco: " + banco
        + "\n Sucursal: " + sucursal
        + "\n Número de producto: " + numProducto;
  }

  public void mostrarInfo() {
    System.out.println(toString());
  }
}
