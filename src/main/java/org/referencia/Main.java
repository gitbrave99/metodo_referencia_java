package org.referencia;

import org.referencia.metodos.Constructor;
import org.referencia.metodos.Estatico;
import org.referencia.metodos.InstObjArbitrario;
import org.referencia.metodos.Instancia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estatico metEstatico = new Estatico();
        Instancia metInstancia= new Instancia();
        InstObjArbitrario objArbitrario = new InstObjArbitrario();
        Constructor metConstructor= new Constructor();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la opcion:\n 1-Método Estático \n 2-Método Constructor" +
                "\n 3-Método de un objeto arbitrario \n 4-Método Constructor \nR/");
        int opcion= scanner.nextInt();
        switch (opcion){
            case 1:
            metEstatico.metEstatico();
            break;
            case 2:
                metInstancia.getInstancia();
                break;
            case 3:
                objArbitrario.metOjbArbitrario();
                break;
            case 4:
                metConstructor.metConstructor();
                break;
            default:
                System.out.println("Opción no establecida");
           break;
        }
    }
}