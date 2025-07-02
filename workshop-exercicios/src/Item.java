public abstract class Item implements ItemBiblioteca{
    protected String titulo;
    protected String autor;
    //a classe pai vai implementar o metodo

    public abstract String getTipo();

    @Override
    public void exibirDetalhes() {
        System.out.printf("Publicação: %s, autor %s", titulo, autor);
    }

    @Override
    public String toString() {
        return getTipo() + " - Titulo: " + titulo + ", autor:" + autor;
    }
}
