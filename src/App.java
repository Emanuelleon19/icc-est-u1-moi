public class App {
    public static void main(String[] args) throws Exception {
        Insercion ordenar = new Insercion();
        boolean logs;
        int[] arreglo = {-3,5,7,2,90,6};
        //int [] arregloordenado = ordenar.sortbyInsercion(arreglo,true);
        //ordenar.printArreglo(arregloordenado);
        //ordenar.sortbyInsercion(arreglo,true);
        ordenar.printArreglo(arreglo);
        System.out.println();
        ordenar.sortbyInsercion(arreglo,false);
        ordenar.printArreglo(arreglo);
    } 
}
