package AlguelCanoa.facades;

import AlguelCanoa.repositories.CanoaRepository;
import AlguelCanoa.usecases.canoa.AlugarCanoaUseCase;
import AlguelCanoa.usecases.canoa.CadastrarCanoaUseCase;
import AlguelCanoa.usecases.canoa.ListarCanosDisponiveisUseCase;

public class CanoasFacade {
    public final CadastrarCanoaUseCase cadastrar;
    public final AlugarCanoaUseCase alugar;
    public final ListarCanosDisponiveisUseCase listarCanosDisponiveis;

    public CanoasFacade(CanoaRepository repo){
        this.cadastrar =  new CadastrarCanoaUseCase(repo);
        this.alugar =  new AlugarCanoaUseCase(repo);
        this.listarCanosDisponiveis =  new ListarCanosDisponiveisUseCase(repo);
    }
}
