package AlguelCanoa.usecases.cliente;

import AlguelCanoa.repositories.CanoaRepository;
import AlguelCanoa.repositories.ClienteRepository;

public class CadastrarClienteUseCase {
    private final ClienteRepository clienteRepository;

    public CadastrarClienteUseCase(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }
    public void executar(String nome){
        clienteRepository.salvar(nome);
    }
}
