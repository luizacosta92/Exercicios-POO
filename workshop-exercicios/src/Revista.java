public class Revista extends Livro implements ItemBiblioteca{
    private int edicao;

    public Revista(){
        this.edicao = edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes(){
        System.out.printf("Revista: %s, editora %s, edição %d", titulo, autor, edicao);
    }

}

