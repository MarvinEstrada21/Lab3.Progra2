package marvinestrada_lab3;

import java.awt.Color;
import java.util.Date;

public class Morgan_Aero_8 extends Carro{
    private String convertible;
    private String cabina;
    private double velocidad_maxima_Morgan;
    private double kilometros_galon_Morgan;
    private double precio_venta_Morgan;

    public Morgan_Aero_8() {
        super();
    }

    public Morgan_Aero_8(String convertible, String cabina, double velocidad_maxima_Morgan, double kilometros_galon_Morgan, double precio_venta_Morgan, int numero_serie, Date fecha_ensamblado, Color color_pintura, String marca_llantas, String polarizado, double velocidad_maxima, double kilometros_galon, double precio_venta) {
        super(numero_serie, fecha_ensamblado, color_pintura, marca_llantas, polarizado, velocidad_maxima, kilometros_galon, precio_venta);
        this.convertible = convertible;
        this.cabina = cabina;
        this.velocidad_maxima_Morgan = velocidad_maxima_Morgan;
        this.kilometros_galon_Morgan = kilometros_galon_Morgan;
        this.precio_venta_Morgan = precio_venta_Morgan;
        setVelocidad_maxima_Morgan(velocidad_maxima_Morgan);
        setKilometros_galon_Morgan(kilometros_galon_Morgan);
        setPrecio_venta_Morgan(precio_venta_Morgan);
    }

    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }

    public double getVelocidad_maxima_Morgan() {
        return velocidad_maxima_Morgan;
    }

    public void setVelocidad_maxima_Morgan(double velocidad_maxima_Morgan) {
        if (this.velocidad_maxima_Morgan >= 140 && this.velocidad_maxima_Morgan <= 145){
            this.velocidad_maxima_Morgan = velocidad_maxima_Morgan;
        }
    }

    public double getKilometros_galon_Morgan() {
        return kilometros_galon_Morgan;
    }

    public void setKilometros_galon_Morgan(double kilometros_galon_Morgan) {
        if (this.kilometros_galon_Morgan >= 35 && this.kilometros_galon_Morgan <= 40){
            this.kilometros_galon_Morgan = kilometros_galon_Morgan;
        }
    }

    public double getPrecio_venta_Morgan() {
        return precio_venta_Morgan;
    }

    public void setPrecio_venta_Morgan(double precio_venta_Morgan) {
        if (this.precio_venta_Morgan >= 500000 && this.precio_venta_Morgan <= 700000){
            this.precio_venta_Morgan = precio_venta_Morgan;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Morgan_Aero_8{" + "convertible=" + convertible + ", cabina=" + cabina + ", velocidad_maxima_Morgan=" + velocidad_maxima_Morgan + ", kilometros_galon_Morgan=" + kilometros_galon_Morgan + ", precio_venta_Morgan=" + precio_venta_Morgan + '}';
    }
}