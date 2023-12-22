package org.referencia.clases;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private String name;
    private String category;
    private double price;

    Producto(String name){

    }

    public String toLowerName(){
        return this.name.toLowerCase();
    }

    @Override
    public String toString() {
        return "Producto{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
