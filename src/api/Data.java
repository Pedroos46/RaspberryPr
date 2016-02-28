package api;

/**
 * Classe per emmagatzemar dades.
 * Objectes d'aquesta classe s'envien a través de la xarxa
 * @author sergi grau
 * @version 1.0 26.04.2013
 */
import java.io.*;

public class Data implements Serializable {
    private static final long serialVersionUID = 1L;
    private int valor;

    public Data(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}