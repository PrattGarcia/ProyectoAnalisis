package org.example;

class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int item) {
        valor = item;
        izquierdo = derecho = null;
    }
}

public class ArbolBinarioMultiplicacion {

    Nodo raiz;

    // Método para insertar un nuevo nodo en el árbol
    private Nodo insertar(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertar(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertar(nodo.derecho, valor);
        }

        return nodo;
    }

    // Método para imprimir el árbol en orden
    private void imprimirEnOrden(Nodo nodo) {
        if (nodo != null) {
            imprimirEnOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            imprimirEnOrden(nodo.derecho);
        }
    }

    // Método para realizar la multiplicación de la lista de números
    private int multiplicarLista(Nodo nodo) {
        if (nodo == null) {
            return 1;
        }

        return nodo.valor * multiplicarLista(nodo.izquierdo) * multiplicarLista(nodo.derecho);
    }

    // Método público para insertar un nuevo valor en el árbol
    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    // Método público para imprimir el árbol en orden
    public void imprimirEnOrden() {
        imprimirEnOrden(raiz);
    }

    // Método público para obtener el resultado final de la multiplicación
    public int obtenerResultadoMultiplicacion() {
        return multiplicarLista(raiz);
    }
}
