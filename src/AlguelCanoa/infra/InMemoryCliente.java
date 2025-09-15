package AlguelCanoa.infra;

import AlguelCanoa.entities.Cliente;
import AlguelCanoa.repositories.ClienteRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCliente implements ClienteRepository {
    private final List<Cliente> clientes =  new ArrayList<>();


    @Override
    public void salvar(String cliente) {
        clientes.add(new Cliente(cliente));
    }

    @Override
    public Cliente buscarPorNome(String nome) {
        return clientes.stream()
                .filter(c -> c.getNome().equals(nome))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Cliente Nao encontrado"));

    }

    @Override
    public List<Cliente> listarTodos() {
        return clientes;
    }
}
