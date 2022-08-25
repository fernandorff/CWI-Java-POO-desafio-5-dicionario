import java.util.HashMap;

import java.util.Map;

public class Dicionario extends PalavraNaoEncontradaException {

    public enum TipoDicionario {
        INGLES,
        PORTUGUES
    }

    public Map<String, String> palavrasPortuguesParaIngles = new HashMap<>();

    public Map<String, String> palavrasInglesParaPortugues = new HashMap<>();

    public void adicionarPalavra(String palavra, String traducao, TipoDicionario dicionario) {

        palavra = palavra.toLowerCase();

        if (dicionario == TipoDicionario.INGLES) {
            palavrasPortuguesParaIngles.put(palavra, traducao);
        } else {
            palavrasInglesParaPortugues.put(palavra, traducao);
        }

    }

    public void checkError(String palavra, TipoDicionario dicionarioDeBusca) {

        if (dicionarioDeBusca == TipoDicionario.INGLES) {
            if (!palavrasPortuguesParaIngles.containsKey(palavra)) {

                throw new PalavraNaoEncontradaException();

            }
        }
        if (dicionarioDeBusca == TipoDicionario.PORTUGUES) {
            if (!palavrasInglesParaPortugues.containsKey(palavra)) {

                throw new PalavraNaoEncontradaException();

            }
        }
    }

    public String traduzir(String palavra, TipoDicionario dicionarioDeBusca) {

        palavra = palavra.toLowerCase();

        checkError(palavra, dicionarioDeBusca);

        if (dicionarioDeBusca == TipoDicionario.INGLES) {
            return palavrasPortuguesParaIngles.get(palavra);
        }

        return palavrasInglesParaPortugues.get(palavra);

    }

}
