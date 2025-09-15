package AlguelCanoa.repositories;

import AlguelCanoa.entities.Canoa;

import java.util.List;

public interface CanoaRepository {
    void salvar(Canoa canoa);
    Canoa buscarPorNome(String nome);
    List<Canoa> listarTodos();
}
