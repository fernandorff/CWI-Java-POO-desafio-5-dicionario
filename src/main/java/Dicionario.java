import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Dicionario {

    public enum TipoDicionario {
        INGLES,
        PORTUGUES
    }

String erro = "erro";

    public Map<String, String> palavraJuntoComSuaTraducao = new HashMap<>();
    public Map<TipoDicionario, Map> traducaoJuntoComTipoDeDicionario = new HashMap<>();

    public void adicionarPalavra(String palavra, String traducao, TipoDicionario dicionario) {
        palavra = palavra.toLowerCase();
        traducao = traducao.toLowerCase();
        palavraJuntoComSuaTraducao.put(palavra, traducao);
        traducaoJuntoComTipoDeDicionario.put(dicionario, palavraJuntoComSuaTraducao);


    }

    public String traduzir(String palavra, TipoDicionario dicionarioDeBusca) {
        palavra = palavra.toLowerCase();
        if (traducaoJuntoComTipoDeDicionario.containsKey(dicionarioDeBusca) && palavraJuntoComSuaTraducao.containsKey(palavra)) {
            return (String) (traducaoJuntoComTipoDeDicionario.get(dicionarioDeBusca)).get(palavra);
            //return traducaoJuntoComTipoDeDicionario.get(dicionarioDeBusca);
        }
        // throw new RuntimeException();
        return erro;

    }


}
