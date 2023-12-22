package org.referencia.metodos;

import org.referencia.clases.Producto;

import java.util.ArrayList;
import java.util.List;

public class InstObjArbitrario {
    List<Producto> productoList = new ArrayList<>();

    public  InstObjArbitrario(){
        productoList.add(new Producto("CAMISETA", "Ropa", 19.99));
        productoList.add(new Producto("ZAPATOS", "Calzado", 49.99));
        productoList.add(new Producto("RELOJ", "Accesorio", 99.99));
    }

    public void metOjbArbitrario(){
        System.out.println("Referencia a métodos de instancia de forma arbitraria");
        this.productoList.stream().map(Producto::toLowerName).forEach(System.out::println);
    }
}
