package br.senac.micromouse.labirinto;

/**
 * Representa o labirinto que será explorado pelo robô.
 */
public class Labirinto {
    private int[][] matriz;

    /**
     * Construtor do labirinto.
     * @param matriz matriz representando o labirinto (0 = livre, 1 = parede, 2 = início, 3 = fim)
     */
    public Labirinto(int[][] matriz) {
        this.matriz = matriz;
    }

    /**
     * Retorna a célula na posição especificada.
     * @param x coordenada x
     * @param y coordenada y
     * @return valor da célula
     */
    public int getCelula(int x, int y) {
        return matriz[x][y];
    }

    /**
     * Retorna as células vizinhas ao redor de uma posição.
     * @param x coordenada x
     * @param y coordenada y
     * @return array com os valores das células vizinhas
     */
    public int[] getVizinhanca(int x, int y) {
        return new int[] {
            matriz[x-1][y], matriz[x+1][y], matriz[x][y-1], matriz[x][y+1]
        };
    }
}
