package Ejercicio28_productosFiscales;

public class ProductoAlimenticio extends Producto {
    private double porcentajeImpuestoInterno;

    public ProductoAlimenticio(String codigo, String descripcion, double costoBase, double porcentajeImpuestoInterno) {
        super(codigo, descripcion, costoBase);
        this.porcentajeImpuestoInterno = porcentajeImpuestoInterno;
    }

    @Override
    public double calcularPrecioFinal() {
        return costoBase * (1 + porcentajeImpuestoInterno / 100);
    }
}
