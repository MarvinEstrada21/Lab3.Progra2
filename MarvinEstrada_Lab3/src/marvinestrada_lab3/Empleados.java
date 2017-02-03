package marvinestrada_lab3;

import java.util.ArrayList;

public class Empleados extends Personas{
    private String horas_trabajan;
    private ArrayList<Cliente> lista_clientes = new ArrayList();

    public Empleados() {
        super();
    }

    public Empleados(String horas_trabajan, String nombre, long id, int edad, double altura, double peso) {
        super(nombre, id, edad, altura, peso);
        this.horas_trabajan = horas_trabajan;
    }

    public String getHoras_trabajan() {
        return horas_trabajan;
    }

    public void setHoras_trabajan(String horas_trabajan) {
        this.horas_trabajan = horas_trabajan;
    }

    public ArrayList<Cliente> getLista_clientes() {
        return lista_clientes;
    }

    public void setLista_clientes(ArrayList<Cliente> lista_clientes) {
        this.lista_clientes = lista_clientes;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleados{" + "horas_trabajan=" + horas_trabajan + ", lista_clientes=" + lista_clientes + '}';
    }
}