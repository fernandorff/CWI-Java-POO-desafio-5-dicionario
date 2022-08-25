public class PalavraNaoEncontradaException extends RuntimeException {
    public PalavraNaoEncontradaException(){
        super("A palavra nao foi encontrada");
    }
}
