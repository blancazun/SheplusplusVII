package Fundamentos;

public class Tiposdedatos {

    //Variable de instancia 
    private int instanciaVariable;

    // Variable estática (o de clase) 
    public static String claseVariable = "Me gusta el mango";

    //Constructor 
    public Tiposdedatos(int instanciaVariable) {
        this.instanciaVariable = instanciaVariable;
    }

    //Método para mostrar el valor de la variable de instancia 
    public void mostrarInstanciaVariable() {
        System.out.println("Variable de instancia: " + instanciaVariable);
    }

    // Método estático para mostrar el valor de la variable estática 
    public static void mostrarClaseVariable() {
        System.out.println("Variable estatica: " + claseVariable);
    }

    //Método para demostrar tipo de datos primitivos y objetos 
    public void demostrarTiposDatos() {
        //Tipos de datos primitivos 
        int entero = 10;
        double doble = 3.14;
        char caracter = 'A';
        boolean booleano = true;

        System.out.println("Tipo de dato entero: " + entero);
        System.out.println("Tipo de dato doble: " + doble);
        System.out.println("Tipo de dato caracter: " + caracter);
        System.out.println("Tipo de dato booleano: " + booleano);

        //Objetos  (tipos de dato mas complejos) 
        String cadena = "Me llamo Lupita";

        System.out.println("Tipo de dato string: " + cadena);
        
    }

    public static void main(String[] args){
        //Instanciar objeto 
        Tiposdedatos example = new Tiposdedatos(50);

        //Llamar metodos para mostrar variables y tipos de datos 
        example.mostrarInstanciaVariable();
        Tiposdedatos.mostrarClaseVariable();
        example.demostrarTiposDatos();
    }
}


