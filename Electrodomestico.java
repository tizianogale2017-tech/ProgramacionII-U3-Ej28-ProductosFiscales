package Ejercicio28_productosFiscales;

public class Electrodomestico extends Producto {
    private int garantiaMeses;

    public Electrodomestico(String codigo, String descripcion, double costoBase, int garantiaMeses) {
        super(codigo, descripcion, costoBase);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularPrecioFinal() {
        double conIva = costoBase * 1.21;
        double recargoGarantia = garantiaMeses * 500;
        return conIva + recargoGarantia;
    }
}
