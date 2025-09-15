package Biblioteca.controller;

import Biblioteca.UseCases.EmprestarLivroUseCase;
import Biblioteca.models.Livro;

public class LivroController {
    private final EmprestarLivroUseCase emprestarUseCase;

    public LivroController(EmprestarLivroUseCase emprestarUseCase){
        this.emprestarUseCase = emprestarUseCase;
    }

    public void emprestar(String titulo){
        emprestarUseCase.executar(titulo);
        System.out.println("Livro emprestado com sucesso");
    }
}
