package marvinestrada_lab3;

import java.awt.Color;
import java.util.Date;

public class Tramontana extends Carro{
    private double peso_Tramontana;
    private int transmicion_Tramontana;
    private double velocidad_maxima_Tramontana;
    private double kilometros_galon_Tramontana;
    private double precio_venta_Tramontana;

    public Tramontana() {
        super();
    }

    public Tramontana(double peso_Tramontana, int transmicion_Tramontana, double velocidad_maxima_Tramontana, double kilometros_galon_Tramontana, double precio_venta_Tramontana, int numero_serie, Date fecha_ensamblado, Color color_pintura, String marca_llantas, String polarizado, double velocidad_maxima, double kilometros_galon, double precio_venta) {
        super(numero_serie, fecha_ensamblado, color_pintura, marca_llantas, polarizado, velocidad_maxima, kilometros_galon, precio_venta);
        this.peso_Tramontana = peso_Tramontana;
        this.transmicion_Tramontana = transmicion_Tramontana;
        this.velocidad_maxima_Tramontana = velocidad_maxima_Tramontana;
        this.kilometros_galon_Tramontana = kilometros_galon_Tramontana;
        this.precio_venta_Tramontana = precio_venta_Tramontana;
        setPeso_Tramontana(peso_Tramontana);
        setTransmicion_Tramontana(transmicion_Tramontana);
        setVelocidad_maxima_Tramontana(velocidad_maxima_Tramontana);
        setKilometros_galon_Tramontana(kilometros_galon_Tramontana);
        setPrecio_venta_Tramontana(precio_venta_Tramontana);
    }

    public double getPeso_Tramontana() {
        return peso_Tramontana;
    }

    public void setPeso_Tramontana(double peso_Tramontana) {
        if(this.peso_Tramontana >= 1276 && this.peso_Tramontana <= 1376){
            this.peso_Tramontana = peso_Tramontana;
        }
    }

    public int getTransmicion_Tramontana() {
        return transmicion_Tramontana;
    }

    public void setTransmicion_Tramontana(int transmicion_Tramontana) {
        if(this.transmicion_Tramontana >= 6 && this.transmicion_Tramontana <= 7){
            this.transmicion_Tramontana = transmicion_Tramontana;
        }
    }

    public double getVelocidad_maxima_Tramontana() {
        return velocidad_maxima_Tramontana;
    }

    public void setVelocidad_maxima_Tramontana(double velocidad_maxima_Tramontana) {
        if(this.velocidad_maxima_Tramontana >= 175 && this.velocidad_maxima_Tramontana <= 180){
            this.velocidad_maxima_Tramontana = velocidad_maxima_Tramontana;
        }
    }

    public double getKilometros_galon_Tramontana() {
        return kilometros_galon_Tramontana;
    }

    public void setKilometros_galon_Tramontana(double kilometros_galon_Tramontana) {
        if(this.kilometros_galon_Tramontana >= 50 && this.kilometros_galon_Tramontana <= 55){
            this.kilometros_galon_Tramontana = kilometros_galon_Tramontana;
        }
    }

    public double getPrecio_venta_Tramontana() {
        return precio_venta_Tramontana;
    }

    public void setPrecio_venta_Tramontana(double precio_venta_Tramontana) {
        if(this.precio_venta_Tramontana >= 800000 && this.precio_venta_Tramontana <= 1000000){
            this.precio_venta_Tramontana = precio_venta_Tramontana;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Tramontana{" + "peso_Tramontana=" + peso_Tramontana + ", transmicion_Tramontana=" + transmicion_Tramontana + ", velocidad_maxima_Tramontana=" + velocidad_maxima_Tramontana + ", kilometros_galon_Tramontana=" + kilometros_galon_Tramontana + ", precio_venta_Tramontana=" + precio_venta_Tramontana + '}';
    }
}