

public class Persona {
    public String nombre;
    public String nif;
    public String fechaNac;

    public Persona(String nombre, String nif, String fechaNac) {
        this.nombre=nombre;
        this.nif=nif;
        this.fechaNac=fechaNac;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNif(){
        return nif;
    }
    public String getFechaNac() {
        return fechaNac;
    }

    public String toString(){
        return "Nombre" + nombre + "Nif" + nif + "FechaNac" + fechaNac;
    }
}
