package AlguelCanoa.infra;

import AlguelCanoa.entities.Canoa;
import AlguelCanoa.repositories.CanoaRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCanoa implements CanoaRepository {
    private final List<Canoa> canoas =  new ArrayList<>();

    @Override
    public void salvar(Canoa canoa) {
        canoas.add(canoa);
    }

    @Override
    public Canoa buscarPorNome(String nome) {
        return canoas.stream()
                .filter(c -> c.getNome().equals(nome))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Canoa Nao encontrada"));
    }

    @Override
    public List<Canoa> listarTodos() {
        return canoas;
    }
}
