package AlguelCanoa.repositories;

import AlguelCanoa.entities.Canoa;
import AlguelCanoa.entities.Cliente;

import java.util.List;

public interface ClienteRepository {
    void salvar(String cliente);
    Cliente buscarPorNome(String nome);
    List<Cliente> listarTodos();
}
