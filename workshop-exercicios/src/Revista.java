public class Revista extends Item{
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

    @Override
    public String getTipo() {
        return "Revista";
    }

}

