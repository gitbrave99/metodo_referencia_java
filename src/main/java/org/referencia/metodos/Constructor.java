package org.referencia.metodos;
import org.referencia.clases.Producto;
import org.referencia.interfaces.CreadorProducto;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Constructor {

    List<Producto> productoList = new ArrayList<>();

    public void metConstructor(){
        CreadorProducto proc= Producto::new;
        Producto p1=proc.crear("CAMISETA", "Ropa",      19.99);
        Producto p2=proc.crear("ZAPATOS",  "Calzado",   49.99);
        Producto p3=proc.crear("RELOJ",    "Accesorio", 99.99);
        this.productoList.add(p1);
        this.productoList.add(p2);
        this.productoList.add(p3);
        System.out.println("Referencia a un constructor");
        this.productoList.forEach(System.out::println);
    }
}