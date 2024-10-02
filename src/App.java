public class App {
    public static void main(String[] args) throws Exception {
        Insercion ordenar = new Insercion();
        int[] arreglo = {-3,5,7,2,90,6};
        int [] arregloordenado = ordenar.sortbyInsercion(arreglo);
        ordenar.printArreglo(arregloordenado);
    } 
}
