package AlguelCanoa.entities;

public class Canoa {
    private String nome;
    private boolean alugado;

    public Canoa(String nome) {
        this.nome = nome;
        this.alugado = false;
    }
    public void alugar() throws IllegalAccessException {
        if(alugado) throw new IllegalAccessException("Canoa ja está alugada");
        alugado = true;
    }
    public void devolver() throws IllegalAccessException {
        if(!alugado) throw new IllegalAccessException("Canoa não está alugada");
        alugado = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAlugado() {
        return alugado;
    }
}
