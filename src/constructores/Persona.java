package constructores;

public class Persona {
    String nombre;
    int edad;
    int dni;
    
    public Persona () {
        this.nombre = "Fulano";
        this.edad = 18;
        this.dni = 12345678;
        
        mostrarDatos();
    }
    
    public Persona (String nuevoNombre) {
        this.nombre = nuevoNombre;
        this.edad = 18;
        this.dni = 12345678;
        
        mostrarDatos();
    }
    
    public Persona (String nuevoNombre, int nuevaEdad) {
        this.nombre = nuevoNombre;
        this.edad = nuevaEdad;
        this.dni = 12345678;
        
        mostrarDatos();
    }
    
    public Persona (String nuevoNombre, int nuevaEdad, int nuevoDni) {
        this.nombre = nuevoNombre;
        this.edad = nuevaEdad;
        this.dni = nuevoDni;
        
        mostrarDatos();
    }
    
    private void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nDNI: " + this.dni);
    }
}
