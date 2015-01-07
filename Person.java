import java.util.ArrayList;
/**
 * Persona sobre la que trabajar
 */
public class Person
{
    // Nombre de la persona
    private String name;
    // Edad de la persona
    private int age;
    // Padre y Madre de esta persona
    private Person father, mother;
    // Hijos e Hijas de esta persona (si tiene)
    private ArrayList<Person> children;

    /**
     * Nueva persona para el programa
     * El nombre es una cadena de texto
     * La edad es un numero entero
     */
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
