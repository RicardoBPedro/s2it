public class BinaryTree {

    Nodo raiz;

    int somaNodosSubsequentes = 0;

    public void adicionarNo(int valor) {
        Nodo nodo = new Nodo(valor);

        if (raiz == null) {
            raiz = nodo;
        } else {
            Nodo nodoAux = raiz;
            Nodo pai;

            while (true) {
                pai = nodoAux;

                if (valor < nodoAux.valor) {
                    nodoAux = nodoAux.filhoEsquerda;

                    if (nodoAux == null) {
                        pai.filhoEsquerda = nodo;
                        return;
                    }
                } else {
                    nodoAux = nodoAux.filhoDireita;

                    if (nodoAux == null) {
                        pai.filhoDireita = nodo;
                        return;
                    }
                }
            }
        }
    }

    public int somaNodosSubsequentes(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }

        if (nodo == raiz) {
            somaNodosSubsequentes = somaNodosSubsequentes(nodo.filhoEsquerda)
                    + somaNodosSubsequentes(nodo.filhoDireita);
        } else {
            somaNodosSubsequentes = somaNodosSubsequentes(nodo.filhoEsquerda)
                    + somaNodosSubsequentes(nodo.filhoDireita)
                    + nodo.valor;
        }

        return somaNodosSubsequentes;

    }
}

class Nodo {
    int valor;
    Nodo filhoEsquerda;
    Nodo filhoDireita;

    Nodo(int valor) {
        this.valor = valor;
    }
}