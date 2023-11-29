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
        double[] numeros = {2,2};

        // Insertar números en el árbol
        for (double num : numeros) {
            arbol.insertar(num);
        }   

        // Imprimir el árbol en orden
        System.out.println("Árbol en orden:");
        arbol.imprimirEnOrden();

        // Obtener el resultado final de la multiplicación
        double resultado = arbol.obtenerResultadoMultiplicacion();
        System.out.println("\nResultado de la multiplicación: " + resultado);
    }
}
