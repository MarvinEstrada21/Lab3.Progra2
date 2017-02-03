package marvinestrada_lab3;

import java.util.ArrayList;

public class Empleados extends Personas{
    private String horas_trabajan;
    private Cliente cliente;

    public Empleados() {
        super();
    }

    public Empleados(String horas_trabajan, Cliente cliente, String nombre, long id, int edad, double altura, double peso) {
        super(nombre, id, edad, altura, peso);
        this.horas_trabajan = horas_trabajan;
        this.cliente = cliente;
    }

    public String getHoras_trabajan() {
        return horas_trabajan;
    }

    public void setHoras_trabajan(String horas_trabajan) {
        this.horas_trabajan = horas_trabajan;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Empleados{" + "horas_trabajan=" + horas_trabajan + ", cliente=" + cliente + '}';
    }
}