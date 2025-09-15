package Biblioteca.Tests;

import Biblioteca.Repositories.InMemoryLivroRepository;
import Biblioteca.Repositories.LivroRepository;
import Biblioteca.UseCases.EmprestarLivroUseCase;
import Biblioteca.models.Livro;

public class EmprestarLivroUseCaseTest {

//    @Test
    public static void deveEmprestarLivroComSucesso(){
        LivroRepository repo = new InMemoryLivroRepository();
        repo.salvar(new Livro("Clean Code", "Uncle Bob"));

        EmprestarLivroUseCase useCaeEmprestar =  new EmprestarLivroUseCase(repo);
        useCaeEmprestar.executar("Clean Code");

//        assertTrue(repo.buscarPorTitulo("Clean Code").isEmprestado);

    }
}
