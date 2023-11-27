package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArbolBinarioMultiplicacion arbol = new ArbolBinarioMultiplicacion();

        // Lista de números
        int[] numeros = {2, 3, 4, 5, 1, 10, 13, 16};

        // Insertar números en el árbol
        for (int num : numeros) {
            arbol.insertar(num);
        }

        // Imprimir el árbol en orden
        System.out.println("Árbol en orden:");
        arbol.imprimirEnOrden();

        // Obtener el resultado final de la multiplicación
        int resultado = arbol.obtenerResultadoMultiplicacion();
        System.out.println("\nResultado de la multiplicación: " + resultado);
    }
}
