package br.senac.micromouse.mapeamento;

import java.util.HashMap;
import java.util.Map;

/**
 * Representa o mapa que o robô vai descobrindo.
 */
public class Mapeamento {
    private Map<String, Integer> mapaDescoberto = new HashMap<>();

    /**
     * Armazena uma descoberta feita pelo robô.
     * @param x posição x
     * @param y posição y
     * @param tipoCelula valor da célula
     */
    public void registrarDescoberta(int x, int y, int tipoCelula) {
        mapaDescoberto.put(x + "," + y, tipoCelula);
    }

    /**
     * Retorna o valor armazenado para uma célula, se houver.
     * @param x posição x
     * @param y posição y
     * @return valor da célula ou -1 se desconhecido
     */
    public int getCelula(int x, int y) {
        return mapaDescoberto.getOrDefault(x + "," + y, -1);
    }
}
