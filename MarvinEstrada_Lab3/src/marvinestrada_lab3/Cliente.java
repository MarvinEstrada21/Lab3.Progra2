package marvinestrada_lab3;

import java.util.ArrayList;

public class Cliente extends Personas{
    private double dinero;
    private ArrayList<Carro> lista_carros = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(double dinero, String nombre, long id, int edad, double altura, double peso) {
        super(nombre, id, edad, altura, peso);
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Carro> getLista_carros() {
        return lista_carros;
    }

    public void setLista_carros(ArrayList<Carro> lista_carros) {
        this.lista_carros = lista_carros;
    }
    
    public void setLista_carro(Carro carro){
        lista_carros.add(carro);
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "dinero=" + dinero + ", lista_carros=" + lista_carros + '}';
    }
}