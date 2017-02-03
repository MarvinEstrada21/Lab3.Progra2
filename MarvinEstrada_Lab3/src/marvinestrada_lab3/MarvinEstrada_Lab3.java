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
    private static int pos;
    private static String nombre;
    private static long id;
    private static int edad;
    private static double altura;
    private static double peso;
    private static String horas_trabajan;
    private static double dinero;
    private static Cliente cliente;
    private static DateFormat df = new SimpleDateFormat("yyyy,MM,dd");
    private static ArrayList lista = new ArrayList();

    public static void main(String[] args) throws ParseException {
        Cliente cl = new Cliente();
        String opcion = "";
        while (!opcion.equals("6")) {
            opcion = JOptionPane.showInputDialog("MENU\n"
                    + "1. Agregar\n"
                    + "2. Modificar\n"
                    + "3. Eliminar\n"
                    + "4. Ventas\n"
                    + "5. Reporte\n"
                    + "6. Salir\n");
            if (opcion.equals("1")) {
                String subopcion = "";
                subopcion = JOptionPane.showInputDialog("ELIGA LA MARCA DE CARRO"
                        + "1. Maybach\n"
                        + "2. Morgan Aero 8\n"
                        + "3. Fisker Automotive\n"
                        + "4. Tramonta\n"
                        + "5. Empleados\n"
                        + "6. Clientes\n");
                if (subopcion.equals("1")) {
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
                if (subopcion.equals("2")) {
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
                if (subopcion.equals("3")) {
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
                if (subopcion.equals("4")) {
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
                    lista.add(new Tramontana(peso_Tramontana, transmicion_Tramontana, numero_serie, df.parse(fecha_ensamblado), color_pintura, marca_llantas, polarizado, velocidad_maxima, kilometros_galon, precio_venta));
                }
                if (subopcion.equals("5")) {
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    id = Long.parseLong(JOptionPane.showInputDialog("Ingrese la identidad"));
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"));
                    peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso"));
                    horas_trabajan = JOptionPane.showInputDialog("Ingrese las horas que trbaabajan por dia");
                    lista.add(new Empleados(horas_trabajan, new Cliente(), nombre, id, edad, altura, peso));
                }
                if (subopcion.equals("6")) {
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    id = Long.parseLong(JOptionPane.showInputDialog("Ingrese la identidad"));
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"));
                    peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso"));
                    cl.setLista_carro(new Carro());
                    dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dinero disponible"));
                    lista.add(new Cliente(dinero, nombre, id, edad, altura, peso));
                }

            }
            if (opcion.equals("2")) {
                String subopcion = "";
                subopcion = JOptionPane.showInputDialog("INGRESE QUE DESEA MODIFICAR\n"
                        + "1. Maybach\n"
                        + "2. Morgan Aero 8\n"
                        + "3. Fisker Automotive\n"
                        + "4. Tramonta\n"
                        + "5. Empleados\n"
                        + "6. Clientes\n");
                if (subopcion.equals("1")) {
                    String salida = "";
                    for (Object temp : lista) {
                        if (temp instanceof Maybach) {
                            salida += lista.indexOf(temp) + " " + ((Maybach) temp) + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
                    numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de serie"));
                    fecha_ensamblado = JOptionPane.showInputDialog("Ingrese la fecha de ensamblado en forma: yyyy,MM,dd");
                    color_pintura = Color.BLACK;
                    marca_llantas = JOptionPane.showInputDialog("Ingrese la marca de las llantas");
                    polarizado = JOptionPane.showInputDialog("¿Está polarizado?");
                    velocidad_maxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad maxima del carro"));
                    kilometros_galon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kilometros por galon del carro"));
                    precio_venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de venta del carro"));
                    llantas_repuesto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de llantas de repuesto"));
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion que desea modificar"));
                    if (lista.get(pos) instanceof Maybach) {
                        ((Maybach) lista.get(pos)).setNumero_serie(numero_serie);
                        ((Maybach) lista.get(pos)).setFecha_ensamblado(df.parse(fecha_ensamblado));
                        ((Maybach) lista.get(pos)).setMarca_llantas(marca_llantas);
                        ((Maybach) lista.get(pos)).setPolarizado(polarizado);
                        ((Maybach) lista.get(pos)).setVelocidad_maxima(velocidad_maxima);
                        ((Maybach) lista.get(pos)).setKilometros_galon(kilometros_galon);
                        ((Maybach) lista.get(pos)).setPrecio_venta(precio_venta);
                        ((Maybach) lista.get(pos)).setLlantas_repuesto(llantas_repuesto);
                    }
                }
                if (subopcion.equals("2")) {
                    String salida = "";
                    for (Object temp : lista) {
                        if (temp instanceof Morgan_Aero_8) {
                            salida += lista.indexOf(temp) + " " + ((Morgan_Aero_8) temp) + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
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
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion que desea modificar"));
                    if (lista.get(pos) instanceof Morgan_Aero_8) {
                        ((Morgan_Aero_8) lista.get(pos)).setNumero_serie(numero_serie);
                        ((Morgan_Aero_8) lista.get(pos)).setFecha_ensamblado(df.parse(fecha_ensamblado));
                        ((Morgan_Aero_8) lista.get(pos)).setMarca_llantas(marca_llantas);
                        ((Morgan_Aero_8) lista.get(pos)).setPolarizado(polarizado);
                        ((Morgan_Aero_8) lista.get(pos)).setVelocidad_maxima(velocidad_maxima);
                        ((Morgan_Aero_8) lista.get(pos)).setKilometros_galon(kilometros_galon);
                        ((Morgan_Aero_8) lista.get(pos)).setPrecio_venta(precio_venta);
                        ((Morgan_Aero_8) lista.get(pos)).setConvertible(convertible);
                        ((Morgan_Aero_8) lista.get(pos)).setCabina(cabina);
                    }
                }
                if (subopcion.equals("3")) {
                    String salida = "";
                    for (Object temp : lista) {
                        if (temp instanceof Fisker_Automotive) {
                            salida += lista.indexOf(temp) + " " + ((Fisker_Automotive) temp) + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
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
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion que desea modificar"));
                    if (lista.get(pos) instanceof Fisker_Automotive) {
                        ((Fisker_Automotive) lista.get(pos)).setNumero_serie(numero_serie);
                        ((Fisker_Automotive) lista.get(pos)).setFecha_ensamblado(df.parse(fecha_ensamblado));
                        ((Fisker_Automotive) lista.get(pos)).setMarca_llantas(marca_llantas);
                        ((Fisker_Automotive) lista.get(pos)).setPolarizado(polarizado);
                        ((Fisker_Automotive) lista.get(pos)).setVelocidad_maxima(velocidad_maxima);
                        ((Fisker_Automotive) lista.get(pos)).setKilometros_galon(kilometros_galon);
                        ((Fisker_Automotive) lista.get(pos)).setPrecio_venta(precio_venta);
                        ((Fisker_Automotive) lista.get(pos)).setConvertible_Fisker(convertible_Fisker);
                        ((Fisker_Automotive) lista.get(pos)).setTipo_carro(tipo_carro);
                    }
                }
                if (subopcion.equals("4")) {
                    String salida = "";
                    for (Object temp : lista) {
                        if (temp instanceof Tramontana) {
                            salida += lista.indexOf(temp) + " " + ((Tramontana) temp) + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
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
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion que desea modificar"));
                    if (lista.get(pos) instanceof Tramontana) {
                        ((Tramontana) lista.get(pos)).setNumero_serie(numero_serie);
                        ((Tramontana) lista.get(pos)).setFecha_ensamblado(df.parse(fecha_ensamblado));
                        ((Tramontana) lista.get(pos)).setMarca_llantas(marca_llantas);
                        ((Tramontana) lista.get(pos)).setPolarizado(polarizado);
                        ((Tramontana) lista.get(pos)).setVelocidad_maxima(velocidad_maxima);
                        ((Tramontana) lista.get(pos)).setKilometros_galon(kilometros_galon);
                        ((Tramontana) lista.get(pos)).setPrecio_venta(precio_venta);
                        ((Tramontana) lista.get(pos)).setPeso_Tramontana(peso_Tramontana);
                        ((Tramontana) lista.get(pos)).setTransmicion_Tramontana(transmicion_Tramontana);
                    }
                }
                if (subopcion.equals("5")) {
                    String salida = "";
                    for (Object temp : lista) {
                        if (temp instanceof Empleados) {
                            salida += lista.indexOf(temp) + " " + ((Empleados) temp) + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    id = Long.parseLong(JOptionPane.showInputDialog("Ingrese la identidad"));
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"));
                    peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso"));
                    horas_trabajan = JOptionPane.showInputDialog("Ingrese las horas que trbaabajan por dia");
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion que desea modificar"));
                    if (lista.get(pos) instanceof Empleados) {
                        ((Empleados) lista.get(pos)).setNombre(nombre);
                        ((Empleados) lista.get(pos)).setId(id);
                        ((Empleados) lista.get(pos)).setEdad(edad);
                        ((Empleados) lista.get(pos)).setAltura(altura);
                        ((Empleados) lista.get(pos)).setPeso(peso);
                        ((Empleados) lista.get(pos)).setHoras_trabajan(horas_trabajan);
                    }
                }
                if (subopcion.equals("6")) {
                    String salida = "";
                    for (Object temp : lista) {
                        if (temp instanceof Cliente) {
                            salida += lista.indexOf(temp) + " " + ((Cliente) temp) + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    id = Long.parseLong(JOptionPane.showInputDialog("Ingrese la identidad"));
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"));
                    peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso"));
                    cl.setLista_carro(new Carro());
                    dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dinero disponible"));
                    if (lista.get(pos) instanceof Cliente){
                        ((Cliente)lista.get(pos)).setNombre(nombre);
                        ((Cliente)lista.get(pos)).setId(id);
                        ((Cliente)lista.get(pos)).setEdad(edad);
                        ((Cliente)lista.get(pos)).setAltura(altura);
                        ((Cliente)lista.get(pos)).setPeso(peso);
                        ((Cliente)lista.get(pos)).setDinero(dinero);
                    }
                }
            }
        }
        if (opcion.equals("3")) {
            String subopcion = "";
            JOptionPane.showInputDialog("INGRESE LO QUE DESEA ELIMINAR\n"
                    + "1. Maybach\n"
                    + "2. Morgan Aero 8\n"
                    + "3. Fisker Automotive\n"
                    + "4. Tramonta\n"
                    + "5. Empleados\n"
                    + "6. Clientes\n");
            if (subopcion.equals("1")){
                
            }
            if (subopcion.equals("2")){
                
            }
            if (subopcion.equals("3")){
                
            }
            if (subopcion.equals("4")){
                
            }
            if (subopcion.equals("5")){
                
            }
            if (subopcion.equals("6")){
                
            }
        }
        if (opcion.equals("4")) {

        }
        if (opcion.equals("5")) {

        }
    }
}

