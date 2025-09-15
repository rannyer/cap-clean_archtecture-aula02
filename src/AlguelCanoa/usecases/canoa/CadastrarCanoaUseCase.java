package AlguelCanoa.usecases.canoa;

import AlguelCanoa.entities.Canoa;
import AlguelCanoa.repositories.CanoaRepository;

public class CadastrarCanoaUseCase {
    private final CanoaRepository canoaRepository;

    public CadastrarCanoaUseCase(CanoaRepository canoaRepository){
        this.canoaRepository = canoaRepository;
    }
    public void executar(String nome) throws IllegalAccessException {
        canoaRepository.salvar(new Canoa(nome));
    }
}
