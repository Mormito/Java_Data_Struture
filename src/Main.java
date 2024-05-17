//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> l = new ListaEncadeada<>();
        l.adiciona(1);
        System.out.println(l);
        l.adiciona(2);
        System.out.println(l);
        l.adiciona(3);

        System.out.println(l);
        System.out.println("\n Tamanho da Lista: " + l.getTamanho());

        System.out.println("\n Ultimo nó: " + l.getUltimo());

        }
    }
