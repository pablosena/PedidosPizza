
package clases;

/**
 *
 * @author Pablo Sena
 * @version 1.0
 */
//ATRIBUTOS
public class Pizzas {
    private  Tamaño tamaño;
    private  Tipo tipo;
    private boolean estado;
    private static int servidas;
    private static int pedidas;
    private static final int SERVIDAS_DEF   =   0;
    private static final int PEDIDAS_DEF   =   0;
    
    public Pizzas (){
        this.tamaño =   Tamaño.MEDIANA;
        this.tipo   =   Tipo.MARGARITA;
        this.servidas = SERVIDAS_DEF;
        this.pedidas    =   PEDIDAS_DEF;
         contarPedidas ();
    }
    public Pizzas (Tipo tipo, Tamaño tamaño){
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = false;
        contarPedidas ();
    }
    
    public void setEstado (){
        this.estado = true;
    }
      
    public void contarPedidas () {
        pedidas += 1;
    }
    
    
    public void sirve(){
        if (this.estado == true){
            System.out.println("esa pizza ya se ha servido");
        }else {
            this.setEstado();
            servidas +=1;
            pedidas -=1;
        }
        
   
    }
     public static int getTotalPedidas() {
         return pedidas;  
     }
     public static int getTotalServidas () {
         return servidas;
     } 

    @Override
    public String toString() {
        String sirve;
        if (this.estado == true){
            sirve = "SERVIDA";
        }else {
            sirve = "AUN NO SERVIDA";
        }
        return "Pizzas {" + "tama\u00f1o = " + tamaño + ", tipo = " + tipo + ", estado = " + sirve + '}';
    }
    
    
}
