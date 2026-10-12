package Ejercicio28_productosFiscales;

public class Producto {
    private String codigo;
    private String descripcion;
    protected double costoBase;

    public Producto(String codigo, String descripcion, double costoBase) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costoBase = costoBase;
    }

    public double calcularPrecioFinal() {
        return costoBase;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }
}
