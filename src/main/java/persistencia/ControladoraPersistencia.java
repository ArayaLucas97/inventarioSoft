package persistencia;

import logica.Producto;

public class ControladoraPersistencia {
    ProductoJpaController productoJpa = new ProductoJpaController();

    public void crearProducto(Producto prod) {
        productoJpa.create(prod);
    }
}
