package Biblioteca.Repositories;

import Biblioteca.models.Livro;

import java.util.HashMap;
import java.util.Map;

public class InMemoryLivroRepository implements LivroRepository{

    private final Map<String, Livro> db = new HashMap<>();


    @Override
    public Livro buscarPorTitulo(String titulo) {
        return db.get(titulo);
    }

    @Override
    public void salvar(Livro livro) {
        db.put(livro.getTitulo(), livro);
    }
}
