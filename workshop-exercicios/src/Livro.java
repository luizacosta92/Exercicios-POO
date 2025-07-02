public class Livro implements ItemBiblioteca {
    public  String titulo;
    public String autor;
    private int anoPublicacao;

    public Livro(){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

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

    public void exibirDetalhes(){
        System.out.printf(toString());
    }

    @Override
    public String toString(){
        return String.format("Título: %s. Autor: %s. Ano de publicação: %d", titulo, autor,anoPublicacao);

    }
}
