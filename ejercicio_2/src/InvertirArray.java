import java.util.Scanner;
import java.util.Arrays;

public class InvertirArray {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos del arreglo : ");
        int n = leer.nextInt();
        leer.nextLine();

    String[] array = new String [n];
    for (int i =0; i<n;i++){
        System.out.println("Ingrese el elemento "+ (i+1)+ ":");
        array[i]=leer.nextLine();
    }

    String[] invertido = invertirArray(array);

        System.out.println("\nArray original: "+ Arrays.toString(array));
        System.out.println("Array invertido: "+ Arrays.toString(invertido));
}

//funcion que recibe un array y retorna otro invertido
public static String[] invertirArray(String[] array){
        String[] nuevo = new String[array.length];
        for (int i = 0; i < array.length; i++){
            nuevo[i] = array[array.length - 1 - i];
        }
        return nuevo;
    }
}
