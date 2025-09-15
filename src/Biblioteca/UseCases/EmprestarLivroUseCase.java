package Biblioteca.UseCases;

import Biblioteca.Repositories.LivroRepository;
import Biblioteca.models.Livro;

public class EmprestarLivroUseCase {
    private final LivroRepository repository;

    public EmprestarLivroUseCase(LivroRepository repository) {
        this.repository = repository;
    }

    public void executar(String tituloLivro){
        Livro livro = repository.buscarPorTitulo(tituloLivro);
        livro.emprestar();
        repository.salvar(livro);
    }
}
