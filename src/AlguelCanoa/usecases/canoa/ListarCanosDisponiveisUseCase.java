package AlguelCanoa.usecases.canoa;

import AlguelCanoa.entities.Canoa;
import AlguelCanoa.repositories.CanoaRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ListarCanosDisponiveisUseCase {
    private final CanoaRepository canoaRepository;

    public ListarCanosDisponiveisUseCase(CanoaRepository canoaRepository){
        this.canoaRepository = canoaRepository;
    }
    public List<Canoa> executar()  {
        return canoaRepository.listarTodos().stream()
                .filter(c-> !c.isAlugado())
                .collect(Collectors.toList());
    }
}
