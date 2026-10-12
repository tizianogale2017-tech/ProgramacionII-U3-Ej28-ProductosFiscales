package Ejercicio28_productosFiscales;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = {
            new ProductoAlimenticio("A-100", "Aceite de oliva 1 L", 8000.0, 10.5),
            new Electrodomestico("E-200", "Licuadora 600 W", 45000.0, 12)
        };

        System.out.println("=== Reporte de precios ===");
        for (Producto p : productos) {
            System.out.printf("%s - %s: costo base %.2f -> precio final %.2f%n",
                    p.getCodigo(), p.getDescripcion(), p.getCostoBase(), p.calcularPrecioFinal());
        }
    }
}
