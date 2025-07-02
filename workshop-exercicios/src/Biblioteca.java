import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Revista> revistas = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        livros.add(livro);
        }
    public void listarLivros(){
        livros.forEach(livro -> System.out.println(livro));
    }

    public void adicionarRevista(Revista revista){
        revistas.add(revista);
    }
    public void listarRevistas(){
        revistas.forEach(revista -> System.out.println(revista));
    }

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

        Revista revista1 = new Revista();
        revista1.titulo = "Capricho";
        revista1.autor = "Abril";
        revista1.setEdicao(230);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.listarLivros();

        biblioteca.adicionarRevista(revista1);
        biblioteca.listarRevistas();

    }

}
