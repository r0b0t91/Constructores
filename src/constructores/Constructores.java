package constructores;

public class Constructores {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        System.out.println("*-----------------------------*");
        Persona p2 = new Persona("Zutano");
        System.out.println("*-----------------------------*");
        Persona p3 = new Persona("Mengano", 30);
        System.out.println("*-----------------------------*");
        Persona p4 = new Persona("Perengano", 45, 20987321);
    }
    
}
