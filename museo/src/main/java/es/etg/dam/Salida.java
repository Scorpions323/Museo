package es.etg.dam;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Salida implements Runnable {

    private final Sala sala;

    @Override
    public void run() {
        sala.decrementar();
    }
}
