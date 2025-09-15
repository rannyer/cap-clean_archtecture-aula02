package Biblioteca.Repositories;

import Biblioteca.models.Livro;

public interface LivroRepository {
    Livro buscarPorTitulo(String titulo);
    void salvar(Livro livro);
}
