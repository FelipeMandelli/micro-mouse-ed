package br.senac.micromouse.robo;

/**
 * Representa o robô que irá explorar o labirinto.
 */
public class Robo {
    private int x, y;

    /**
     * Inicializa o robô na posição inicial.
     * @param x posição x
     * @param y posição y
     */
    public Robo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Move o robô para uma nova posição.
     * @param dx deslocamento em x
     * @param dy deslocamento em y
     */
    public void mover(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Retorna a posição atual do robô.
     * @return array com [x, y]
     */
    public int[] getPosicao() {
        return new int[] { x, y };
    }
}
