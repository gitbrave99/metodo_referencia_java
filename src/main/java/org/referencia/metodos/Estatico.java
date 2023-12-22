package org.referencia.metodos;

import java.util.Arrays;
import java.util.List;

public class Estatico {
    private List<Integer> numberList = Arrays.asList(1,2,3,4,5,6);

    //Método a pasar como referencia
    public static int toCube(int n){
        return (int) Math.pow(n,3);
    }

    public void metEstatico(){
        //Imprimir el cubo de cada número de la lista
        System.out.println("Referencia a métodos estáticos");
        this.numberList.stream().map(Estatico::toCube).forEach(System.out::println);
    }
}
