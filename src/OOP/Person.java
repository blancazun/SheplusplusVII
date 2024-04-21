
package OOP;

public class Person {
    //Atributos
    private String nombre;
    private int edad;
    private String nacionalidad;
    
    //Constructor vacío
    public Person(){   
    }
    
    //Constructor con parámetros
    public Person(String nombre2, int edad2, String nacionalidad2){
        this.nombre = nombre2;
        this.edad = edad2;
        this.nacionalidad = nacionalidad2;
    }
    
    //Métodos
    void Presentarse(){
        System.out.println("Hola yo soy " + nombre);
    }
    
    void Saludar(){
        System.out.println("Hola");
    }
    
    //Métodos de acceso
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
    public static void main(String[] args) {
        //Instanciar objeto persona
        Person p1 = new Person();
        
        //Asignar valores a sus atributos
        p1.setNombre("María");
        p1.setEdad(38);
        p1.setNacionalidad("Mexicana");
        
        Person p2 = new Person();
        p2.setNombre("Blanca");
        p2.setEdad(30);
        p2.setNacionalidad("Coreaana");
        
        System.out.println(p1.getNombre());
        System.out.println(p2.getNombre());
        
        Person p3 = new Person("Grecia", 25, "Japonesa");
        System.out.println(p3.getNombre());
        p3.setNombre("Gresia");
        System.out.println(p3.getNombre());
    }
}
