package marvinestrada_lab3;

import java.awt.Color;
import java.util.Date;

public class Fisker_Automotive extends Carro{
    private String tipo_carro;
    private String convertible_Fisker;
    private double velocidad_maxima_Fisker;
    private double kilometros_galon_Fisker;
    private double precio_venta_Fisker;

    public Fisker_Automotive() {
        super();
    }

    public Fisker_Automotive(String tipo_carro, String convertible_Fisker, double velocidad_maxima_Fisker, double kilometros_galon_Fisker, double precio_venta_Fisker, int numero_serie, Date fecha_ensamblado, Color color_pintura, String marca_llantas, String polarizado, double velocidad_maxima, double kilometros_galon, double precio_venta) {
        super(numero_serie, fecha_ensamblado, color_pintura, marca_llantas, polarizado, velocidad_maxima, kilometros_galon, precio_venta);
        this.tipo_carro = tipo_carro;
        this.convertible_Fisker = convertible_Fisker;
        this.velocidad_maxima_Fisker = velocidad_maxima_Fisker;
        this.kilometros_galon_Fisker = kilometros_galon_Fisker;
        this.precio_venta_Fisker = precio_venta_Fisker;
        setVelocidad_maxima_Fisker(velocidad_maxima_Fisker);
        setKilometros_galon_Fisker(kilometros_galon_Fisker);
        setPrecio_venta_Fisker(precio_venta_Fisker);
    }

    public String getTipo_carro() {
        return tipo_carro;
    }

    public void setTipo_carro(String tipo_carro) {
        this.tipo_carro = tipo_carro;
    }

    public String getConvertible_Fisker() {
        return convertible_Fisker;
    }

    public void setConvertible_Fisker(String convertible_Fisker) {
        this.convertible_Fisker = convertible_Fisker;
    }

    public double getVelocidad_maxima_Fisker() {
        return velocidad_maxima_Fisker;
    }

    public void setVelocidad_maxima_Fisker(double velocidad_maxima_Fisker) {
        if(this.velocidad_maxima_Fisker >= 160 && this.velocidad_maxima_Fisker <= 165){
            this.velocidad_maxima_Fisker = velocidad_maxima_Fisker;
        }
    }

    public double getKilometros_galon_Fisker() {
        return kilometros_galon_Fisker;
    }

    public void setKilometros_galon_Fisker(double kilometros_galon_Fisker) {
        if (this.kilometros_galon_Fisker >= 55 && this.kilometros_galon_Fisker <= 60){
            this.kilometros_galon_Fisker = kilometros_galon_Fisker;
        }
    }

    public double getPrecio_venta_Fisker() {
        return precio_venta_Fisker;
    }

    public void setPrecio_venta_Fisker(double precio_venta_Fisker) {
        if (this.precio_venta_Fisker >= 450000 && this.precio_venta_Fisker <= 650000){
            this.precio_venta_Fisker = precio_venta_Fisker;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Fisker_Automotive{" + "tipo_carro=" + tipo_carro + ", convertible_Fisker=" + convertible_Fisker + ", velocidad_maxima_Fisker=" + velocidad_maxima_Fisker + ", kilometros_galon_Fisker=" + kilometros_galon_Fisker + ", precio_venta_Fisker=" + precio_venta_Fisker + '}';
    }
}