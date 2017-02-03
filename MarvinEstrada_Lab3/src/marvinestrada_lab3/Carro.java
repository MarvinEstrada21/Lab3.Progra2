package marvinestrada_lab3;

import java.awt.Color;
import java.util.Date;

public class Carro {
    private int numero_serie;
    private Date fecha_ensamblado;
    private Color color_pintura;
    private String marca_llantas;
    private String polarizado;
    private double velocidad_maxima;
    private double kilometros_galon;
    private double precio_venta;

    public Carro() {
    }

    public Carro(int numero_serie, Date fecha_ensamblado, Color color_pintura, String marca_llantas, String polarizado, double velocidad_maxima, double kilometros_galon, double precio_venta) {
        this.numero_serie = numero_serie;
        this.fecha_ensamblado = fecha_ensamblado;
        this.color_pintura = color_pintura;
        this.marca_llantas = marca_llantas;
        this.polarizado = polarizado;
        this.velocidad_maxima = velocidad_maxima;
        this.kilometros_galon = kilometros_galon;
        this.precio_venta = precio_venta;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public Date getFecha_ensamblado() {
        return fecha_ensamblado;
    }

    public void setFecha_ensamblado(Date fecha_ensamblado) {
        this.fecha_ensamblado = fecha_ensamblado;
    }

    public Color getColor_pintura() {
        return color_pintura;
    }

    public void setColor_pintura(Color color_pintura) {
        this.color_pintura = color_pintura;
    }

    public String getMarca_llantas() {
        return marca_llantas;
    }

    public void setMarca_llantas(String marca_llantas) {
        this.marca_llantas = marca_llantas;
    }

    public String getPolarizado() {
        return polarizado;
    }

    public void setPolarizado(String polarizado) {
        this.polarizado = polarizado;
    }

    public double getVelocidad_maxima() {
        return velocidad_maxima;
    }

    public void setVelocidad_maxima(double velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    public double getKilometros_galon() {
        return kilometros_galon;
    }

    public void setKilometros_galon(double kilometros_galon) {
        this.kilometros_galon = kilometros_galon;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    @Override
    public String toString() {
        return "Carro{" + "numero_serie=" + numero_serie + ", fecha_ensamblado=" + fecha_ensamblado + ", color_pintura=" + color_pintura + ", marca_llantas=" + marca_llantas + ", polarizado=" + polarizado + ", velocidad_maxima=" + velocidad_maxima + ", kilometros_galon=" + kilometros_galon + ", precio_venta=" + precio_venta + '}';
    }
}