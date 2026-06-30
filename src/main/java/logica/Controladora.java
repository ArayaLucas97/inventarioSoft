package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearProducto(Producto prod) {
        controlPersis.crearProducto(prod);
    }
}
