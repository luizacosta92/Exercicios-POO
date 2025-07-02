public class Revista extends Livro implements ItemBiblioteca{
    private int edicao;

    public Revista(){
        this.edicao = edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void exibirDetalhes(){
        System.out.printf(toString());
    }
    @Override
    public String toString(){
        return String.format("Revista: %s, editora %s, edição %d", titulo, autor, edicao);
    }
}
