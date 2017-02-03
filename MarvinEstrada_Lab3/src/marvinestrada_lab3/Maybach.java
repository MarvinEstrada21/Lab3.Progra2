package marvinestrada_lab3;

import java.awt.Color;
import java.util.Date;

public class Maybach extends Carro{
    private int llantas_repuesto;
    private double velocidad_maxima_Maybach;
    private double kilometros_galon_Maybach;
    private double precio_venta_Maybach;

    public Maybach() {
        super();
    }

    public Maybach(int llantas_repuesto, int numero_serie, Date fecha_ensamblado, Color color_pintura, String marca_llantas, String polarizado, double velocidad_maxima, double kilometros_galon, double precio_venta) {
        super(numero_serie, fecha_ensamblado, color_pintura, marca_llantas, polarizado, velocidad_maxima, kilometros_galon, precio_venta);
        this.llantas_repuesto = llantas_repuesto;
        setLlantas_repuesto(llantas_repuesto);
        setVelocidad_maxima(velocidad_maxima_Maybach);
        setKilometros_galon(kilometros_galon_Maybach);
        setPrecio_venta(precio_venta_Maybach);
    }

    public int getLlantas_repuesto() {
        return llantas_repuesto;
    }

    public void setLlantas_repuesto(int llantas_repuesto) {
        if (this.llantas_repuesto >= 1 && this.llantas_repuesto <= 2){
            this.llantas_repuesto = llantas_repuesto;
        }
    }

    public double getVelocidad_maxima_Maybach() {
        return velocidad_maxima_Maybach;
    }

    public void setVelocidad_maxima_Maybach(double velocidad_maxima_Maybach) {
        if (this.velocidad_maxima_Maybach >= 155 && this.velocidad_maxima_Maybach <= 160){
            this.velocidad_maxima_Maybach = velocidad_maxima_Maybach;
        }
    }

    public double getKilometros_galon_Maybach() {
        return kilometros_galon_Maybach;
    }

    public void setKilometros_galon_Maybach(double kilometros_galon_Maybach) {
        if (this.kilometros_galon_Maybach >= 50 && this.kilometros_galon_Maybach <= 55){
            this.kilometros_galon_Maybach = kilometros_galon_Maybach;
        }
    }

    public double getPrecio_venta_Maybach() {
        return precio_venta_Maybach;
    }

    public void setPrecio_venta_Maybach(double precio_venta_Maybach) {
        if (this.precio_venta_Maybach >= 400000 && this.precio_venta_Maybach <= 600000){
            this.precio_venta_Maybach = precio_venta_Maybach;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Maybach{" + "llantas_repuesto=" + llantas_repuesto + ", velocidad_maxima_Maybach=" + velocidad_maxima_Maybach + ", kilometros_galon_Maybach=" + kilometros_galon_Maybach + ", precio_venta_Maybach=" + precio_venta_Maybach + '}';
    }
}