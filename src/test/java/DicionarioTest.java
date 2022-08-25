import dicionario.Dicionario;
import erros.PalavraNaoEncontradaException;
import org.junit.Assert;
import org.junit.Test;

public class DicionarioTest {

    @Test
    public void deveTraduzirCarroELivroDoInglesParaPortuguesEDoPortuguesParaOIngles() {

        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Carro", "Car", Dicionario.TipoDicionario.INGLES);
        dicionario.adicionarPalavra("Livro", "Book", Dicionario.TipoDicionario.INGLES);
        dicionario.adicionarPalavra("Tiger", "Tigre", Dicionario.TipoDicionario.PORTUGUES);
        dicionario.adicionarPalavra("Paper", "Papel", Dicionario.TipoDicionario.PORTUGUES);

        Assert.assertEquals("Car", dicionario.traduzir("carro", Dicionario.TipoDicionario.INGLES));
        Assert.assertEquals("Book", dicionario.traduzir("lIVRO", Dicionario.TipoDicionario.INGLES));

        Assert.assertEquals("Papel", dicionario.traduzir("pApEr", Dicionario.TipoDicionario.PORTUGUES));
        Assert.assertEquals("Tigre", dicionario.traduzir("TIGER", Dicionario.TipoDicionario.PORTUGUES));
    }

    @Test(expected = PalavraNaoEncontradaException.class)
    public void deveLancarExceptionQuandoUmaPalavraNaoForEncontrada() {

        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Carro", "Car", Dicionario.TipoDicionario.INGLES);
        dicionario.adicionarPalavra("Livro", "Book", Dicionario.TipoDicionario.INGLES);

        dicionario.traduzir("aivro", Dicionario.TipoDicionario.INGLES);

    }

}













