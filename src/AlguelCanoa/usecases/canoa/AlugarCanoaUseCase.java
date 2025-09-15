package AlguelCanoa.usecases.canoa;

import AlguelCanoa.entities.Canoa;
import AlguelCanoa.repositories.CanoaRepository;

public class AlugarCanoaUseCase {
    private final CanoaRepository canoaRepository;

    public AlugarCanoaUseCase(CanoaRepository canoaRepository){
        this.canoaRepository = canoaRepository;
    }

    public void executar(String nome) throws IllegalAccessException {
        Canoa canoa =  canoaRepository.buscarPorNome(nome);
        canoa.alugar();
    }
}
