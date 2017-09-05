/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Punto Digital
 */
public class PedidosPizzas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizzas p1 =  new Pizzas (Tipo.MARGARITA, Tamaño.MEDIANA);
        Pizzas p2 = new Pizzas (Tipo.FUNGHI, Tamaño.FAMILIAR);
        p2.sirve();
        Pizzas p3 = new Pizzas (Tipo.CUATRO_QUESOS, Tamaño.MEDIANA);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("servidas :" + Pizzas.getTotalServidas());
        System.out.println("pedidas  :" + Pizzas.getTotalPedidas ());
        p1.sirve();
        p3.sirve();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("servidas :" + Pizzas.getTotalServidas());
        System.out.println("pedidas  :" + Pizzas.getTotalPedidas ());
    }
}
