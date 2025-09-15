package AlguelCanoa.facades;

import AlguelCanoa.repositories.ClienteRepository;
import AlguelCanoa.usecases.cliente.CadastrarClienteUseCase;

public class ClientesFacade {
    public final CadastrarClienteUseCase cadastrarClienteUseCase;

    public ClientesFacade(ClienteRepository repo) {
        this.cadastrarClienteUseCase = new CadastrarClienteUseCase(repo);
    }
}
