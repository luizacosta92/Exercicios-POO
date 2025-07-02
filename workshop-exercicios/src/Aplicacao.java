public class Aplicacao {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro();
        livro1.titulo = "Cem anos de solidao";
        livro1.autor = "Gabo";
        livro1.setAnoPublicacao(1967);

        Livro livro2 = new Livro();
        livro2.titulo = "Salvar o Fogo";
        livro2.autor = "Itamar Vieira Junior";
        livro2.setAnoPublicacao(2023);

        Revista revista1 = new Revista(); //tipo revista é um tipo livro, entao ela herda e é um livro
        revista1.titulo = "Capricho";
        revista1.autor = "Abril";
        revista1.setEdicao(230);

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(revista1);
        biblioteca.listarItens();



    }
}
