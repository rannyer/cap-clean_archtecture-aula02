package AlguelCanoa;

import AlguelCanoa.facades.CanoasFacade;
import AlguelCanoa.facades.ClientesFacade;
import AlguelCanoa.infra.InMemoryCanoa;
import AlguelCanoa.infra.InMemoryCliente;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IllegalAccessException {
        CanoasFacade canoas = new CanoasFacade(new InMemoryCanoa());
        ClientesFacade clientes =  new ClientesFacade(new InMemoryCliente());

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("\n====SISTEAM DE ALUGUEL DE CAIAQUES====\n");
            System.out.println("(1) - Cadastrar Canoa");
            System.out.println("(2) - Cadastrar Cliente");
            System.out.println("(3) - Alugar Canoa");
            System.out.println("(4) - Listar Canoas Disponiveis");
            System.out.println("(0) - Sair");
            System.out.print("Opção: ");

            int op = scan.nextInt();
            switch (op){
                case 1 -> {
                    System.out.println("Nome da canoa: ");
                    canoas.cadastrar.executar(scan.next());
                    System.out.println("Canoa Cadastrada");
                }
                case 2->{
                    System.out.println("Nome do cliente: ");
                    clientes.cadastrarClienteUseCase.executar(scan.next());
                    System.out.println("Cliente cadastrado!");
                }
                case 3 ->{
                    System.out.println("Nome da canoa para alugar: ");
                    try{
                        canoas.alugar.executar(scan.next());
                        System.out.println("Canoa alugada!");
                    }catch (Exception e){
                        System.out.println("erro: "+e.getMessage());
                    }
                }
                case 4 ->{
                    System.out.println("Canoas disponiveis: ");
                    canoas
                            .listarCanosDisponiveis
                            .executar()
                            .forEach(c -> System.out.println("- "+c.getNome()));
                }
                case 0->{
                    System.out.println("SAINDO ...");
                    scan.close();
                    return;
                }
                default -> System.out.println("Entrada inválida");
            }
        }
    }
}
