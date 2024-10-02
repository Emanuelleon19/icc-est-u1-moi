import java.util.Arrays;
public class Insercion {
    public int[] sortbyInsercion(int[] arreglo){
        int tam = arreglo.length;
        for (int i = 1; i < tam; i++ ){
            System.out.println("Pasada numero" + i);
            int aux = arreglo[i];
            int j = i - 1;
            System.out.println("\ti=" + i + " j=" + j + " [i]=" + arreglo[i] + " [j]=" + arreglo[j]);
            while (j >= 0  && arreglo[j] > aux) {
                System.out.println("\t\tCompramos " + aux + " con " + arreglo[j]);
                arreglo[j + 1] = arreglo[j];
                j = j - 1; 
                arreglo[j + 1] = aux;
                System.out.println("\t\t--------" + Arrays.toString(arreglo));
            } 
            System.out.println("\t--------" + Arrays.toString(arreglo));      
        }
        return arreglo;
    }
    public void printArreglo(int[]arreglo){
        for (int elemento : arreglo){ //for each el arreglo va instanciando cada elemento del arreglo se va almacenando
            System.out.print(elemento + ",");
        }
    }
}