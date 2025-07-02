public class Livro extends Item {
    private int anoPublicacao;

    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        if (anoPublicacao >= 0){
            this.anoPublicacao = anoPublicacao;
        } else{
            throw new IllegalArgumentException("O ano não pode ser negativo");
        }
    }
    @Override
    public void exibirDetalhes(){
        System.out.printf("Título: %s. Autor: %s. Ano de publicação: %d", titulo, autor,anoPublicacao);
    }

    @Override
    public String getTipo() {
        return "Livro";
    }

    @Override
    public String toString() {
        return getTipo() + " - Titulo: " + titulo + ", Autor: " + autor + ". Ano de publicacão: " + anoPublicacao;
    }
}
