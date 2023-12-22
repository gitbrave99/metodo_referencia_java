package org.referencia.metodos;

import java.util.Arrays;
import java.util.List;

public class Instancia {
    private List<Integer> numberList= Arrays.asList(1,2,3,4,5,6);

    //Método a pasar como referencia
    public  int toSquare(int n) {
        return (int) Math.pow(n,2);
    }

    public void getInstancia(){
        //Imprimir el cuadrado de cada número
        System.out.println("Referencia a métodos de instancia");
        this.numberList.stream().map(this::toSquare).forEach(System.out::println);
    }

}
