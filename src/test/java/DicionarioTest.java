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

        Assert.assertEquals("car", dicionario.traduzir("carro", Dicionario.TipoDicionario.INGLES));
        Assert.assertEquals("book", dicionario.traduzir("lIVRO", Dicionario.TipoDicionario.INGLES));

        Assert.assertEquals("papel", dicionario.traduzir("pApEr", Dicionario.TipoDicionario.PORTUGUES));
        Assert.assertEquals("tigre", dicionario.traduzir("TIGER", Dicionario.TipoDicionario.PORTUGUES));
    }

    @Test
    public void deveLancarExceptionQuandoUmaPalavraNaoForEncontrada() {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Carro", "Car", Dicionario.TipoDicionario.INGLES);
        dicionario.adicionarPalavra("Livro", "Book", Dicionario.TipoDicionario.INGLES);

        String traducao = dicionario.traduzir("Caneta", Dicionario.TipoDicionario.INGLES);

        Assert.assertEquals("erro",traducao);


    }

}
