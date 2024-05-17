public class ListaEncadeada<T>{

    private Node<T> inicio;
    private Node<T> ultimo;
    private Node<T> valorInicial;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public Node<T> getUltimo() {
        return ultimo;
    }

    public void adiciona(T elemento){
        Node<T> celula = new Node<T>(elemento); // a principio, celula é = 0, mas com o comando ADD na main, eu adiciono o valor elemento
        // que é copiado para a celula

        if(tamanho == 0){ // se o tamanho de nós for 0, ou seja, vazio, o inicio se torna o valor da celula
            this.inicio = celula; // --> main adiciona.l(X);
        } else {
            this.ultimo.setProximo(celula); //o ultimo se torna o valor do PROX
        }
        this.ultimo = celula; //o ultimo valor se torna a ultima celula inserida --> main adiciona.l(Y);
        this.tamanho++;

        // caso fossem: add X e add Y
        // inicio seria X, proximo nulo, Fim X --> inicio seria X, proximo Y, fim Y
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio = " + inicio +
                '}';
    }
}
