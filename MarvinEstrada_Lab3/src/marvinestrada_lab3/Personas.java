package marvinestrada_lab3;
public class Personas {
    private String nombre;
    private long id;
    private int edad;
    private double altura;
    private double peso;

    public Personas() {
    }

    public Personas(String nombre, long id, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(this.edad >= 18){
            this.edad = edad;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(this.altura >= 1.55){
            this.altura = altura;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(this.peso >= 120){
            this.peso = peso;
        }
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }
}