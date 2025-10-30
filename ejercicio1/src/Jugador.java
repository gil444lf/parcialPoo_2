public class Jugador extends Persona{
private int numFed;

public Jugador(String nombre, String nif, String fechaNac, int numFed){
    super(nombre,nif,fechaNac);
    this.numFed=numFed;
}

public int getNumFed(){
    return numFed;
}

public String toString(){
    return super.toString() + ", Numero Federacion " + numFed;
}
}
