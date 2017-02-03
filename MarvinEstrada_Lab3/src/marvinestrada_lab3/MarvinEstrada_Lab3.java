package marvinestrada_lab3;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
public class MarvinEstrada_Lab3 {
    private static int numero_serie;
    private static String fecha_ensamblado;
    private static Color color_pintura;
    private static String marca_llantas;
    private static String polarizado;
    private static double velocidad_maxima;
    private static double kilometros_galon;
    private static double precio_venta;
    private static int llantas_repuesto;
    private static String convertible;
    private static String cabina;
    private static String tipo_carro;
    private static String convertible_Fisker;
    private static double peso_Tramontana;
    private static int transmicion_Tramontana;
    private static DateFormat df = new SimpleDateFormat("yyyy,MM,dd");
    private static ArrayList lista = new ArrayList();
    public static void main(String[] args) throws ParseException {
        String opcion = "";
        while (!opcion.equals("6")){
            opcion = JOptionPane.showInputDialog("MENU\n"
                    + "1. Agregar\n"
                    + "2. Modificar\n"
                    + "3. Eliminar\n"
                    + "4. Ventas\n"
                    + "5. Reporte\n"
                    + "6. Salir\n");
            if (opcion.equals("1")){
                String subopcion = "";
                subopcion = JOptionPane.showInputDialog("ELIGA LA MARCA DE CARRO"
                        + "1. Maybach\n"
                        + "2. Morgan Aero 8\n"
                        + "3. Fisker Automotive\n"
                        + "4. Tramonta\n");
                if(subopcion.equals("1")){
                    numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de serie"));
                    fecha_ensamblado = JOptionPane.showInputDialog("Ingrese la fecha de ensamblado en forma: yyyy,MM,dd");
                    color_pintura = Color.BLACK;
                    marca_llantas = JOptionPane.showInputDialog("Ingrese la marca de las llantas");
                    polarizado = JOptionPane.showInputDialog("¿Está polarizado?");
                    velocidad_maxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad maxima del carro"));
                    kilometros_galon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kilometros por galon del carro"));
                    precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de venta del carro"));
                    llantas_repuesto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de llantas de repuesto"));
                    lista.add(new Maybach(llantas_repuesto, numero_serie, df.parse(fecha_ensamblado), color_pintura, marca_llantas, polarizado, velocidad_maxima, kilometros_galon, precio_venta));
                }
                if(subopcion.equals("2")){
                    numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de serie"));
                    fecha_ensamblado = JOptionPane.showInputDialog("Ingrese la fecha de ensamblado en forma: yyyy,MM,dd");
                    color_pintura = Color.BLACK;
                    marca_llantas = JOptionPane.showInputDialog("Ingrese la marca de las llantas");
                    polarizado = JOptionPane.showInputDialog("¿Está polarizado?");
                    velocidad_maxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad maxima del carro"));
                    kilometros_galon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kilometros por galon del carro"));
                    precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de venta del carro"));
                    convertible = JOptionPane.showInputDialog("¿Es convertible?");
                    cabina = JOptionPane.showInputDialog("¿Es de cabina única o doble?");
                    lista.add(new Morgan_Aero_8(convertible, cabina, numero_serie, df.parse(fecha_ensamblado), color_pintura, marca_llantas, polarizado, velocidad_maxima, kilometros_galon, precio_venta));
                    
                }
                if(subopcion.equals("3")){
                    numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de serie"));
                    fecha_ensamblado = JOptionPane.showInputDialog("Ingrese la fecha de ensamblado en forma: yyyy,MM,dd");
                    color_pintura = Color.BLACK;
                    marca_llantas = JOptionPane.showInputDialog("Ingrese la marca de las llantas");
                    polarizado = JOptionPane.showInputDialog("¿Está polarizado?");
                    velocidad_maxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad maxima del carro"));
                    kilometros_galon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kilometros por galon del carro"));
                    precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de venta del carro"));
                    convertible = JOptionPane.showInputDialog("¿Es convertible?");
                    tipo_carro = JOptionPane.showInputDialog("¿Es turismo o camioneta?");
                    lista.add(new Fisker_Automotive(tipo_carro, convertible_Fisker, numero_serie, df.parse(fecha_ensamblado), color_pintura, marca_llantas, polarizado, velocidad_maxima, kilometros_galon, precio_venta));
                }
                if(subopcion.equals("4")){
                    numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de serie"));
                    fecha_ensamblado = JOptionPane.showInputDialog("Ingrese la fecha de ensamblado en forma: yyyy,MM,dd");
                    color_pintura = Color.BLACK;
                    marca_llantas = JOptionPane.showInputDialog("Ingrese la marca de las llantas");
                    polarizado = JOptionPane.showInputDialog("¿Está polarizado?");
                    velocidad_maxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad maxima del carro"));
                    kilometros_galon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kilometros por galon del carro"));
                    precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de venta del carro"));
                    peso_Tramontana = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del carro"));
                    transmicion_Tramontana = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de transmiciones que tiene el carro"));
                }
            }
            if (opcion.equals("2")){
                
            }
            if (opcion.equals("3")){
                
            }
            if (opcion.equals("4")){
                
            }
            if (opcion.equals("5")){
                
            }
        }
    }
}