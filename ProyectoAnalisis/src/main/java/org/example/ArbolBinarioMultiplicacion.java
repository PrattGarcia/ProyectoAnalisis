package org.example;

class Nodo {
    double valor;
    Nodo izquierdo, derecho;

    public Nodo(double item) {
        valor = item;
        izquierdo = derecho = null;
    }
}

public class ArbolBinarioMultiplicacion {

    Nodo raiz;

    // Método para insertar un nuevo nodo en el árbol
    private Nodo insertar(Nodo nodo, double valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertar(nodo.izquierdo, valor);
        } else {
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
    private double multiplicarLista(Nodo nodo) {
        if (nodo == null) {
            return 1;
        }

        return nodo.valor * multiplicarLista(nodo.izquierdo) * multiplicarLista(nodo.derecho);
    }

    // Método público para insertar un nuevo valor en el árbol
    public void insertar(double valor) {
        raiz = insertar(raiz, valor);
    }

    // Método público para imprimir el árbol en orden
    public void imprimirEnOrden() {
        imprimirEnOrden(raiz);
    }

    // Método público para obtener el resultado final de la multiplicación
    public double obtenerResultadoMultiplicacion() {
        return multiplicarLista(raiz);
    }
}
