
package Arrays;


public class Arrays {
    
    void Suma(int a, int b){
        System.out.println("Hola");
    }
    
    public static void main(String[] args) {
        //Arreglos unidimensionales
        //Declaración y creación.
        int[] miArray = new int[3];
        miArray[0] = 10;
        miArray[1] = 20;
        miArray[2] = 30;
        
        //Algunos métodos útiles
        //System.out.println(miArray.length);
        //Recorrer arreglos
        for(int i=0; i<=miArray.length-1; i+=2){
            System.out.println(miArray[i]);
        }
        //foreach
        for(int x:miArray){
            System.out.println(x);
        }
        
        
    }
}
