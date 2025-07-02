import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Item> itens = new ArrayList<>();
    //a Classe é singular
    //itens é o nome do atributo

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void listarItens() {
        itens.forEach(item -> System.out.println(item));
    }

    public String buscarItemPorTitulo(String titulo) {
        for (Item item : itens) {
            if (titulo.equalsIgnoreCase(titulo)) {
                return titulo;
            }
        }
        return null;
    }
}
