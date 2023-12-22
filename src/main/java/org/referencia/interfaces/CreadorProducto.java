package org.referencia.interfaces;
import org.referencia.clases.Producto;

public interface CreadorProducto {
    Producto crear( String name,String category,double price);
}
