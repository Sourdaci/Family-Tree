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
        father = null;
        mother = null;
        children = new ArrayList<Person>();
    }
    
    /**
     * Muestra el nombre y la edad de la persona
     */
    public void showData(){
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age + "\n");
    }
    
    /**
     * Indica a la persona cual es su Padre
     */
    public void setFather(Person father){
        this.father = father;
    }
    
    /**
     * Indica a la persona cual es su Madre
     */
    public void setMother(Person mother){
        this.mother = mother;
    }
    
    /**
     * Indica a la persona que tiene un nuevo descendiente
     */
    public void addChild(Person child){
        children.add(child);
    }
    
    /**
     * Muestra los datos del padre y la madre de la persona
     * Deben haberse indicado antes o se mostrara un error
     */
    public void showParentsData(){
        System.out.println("Datos de los padres de " + name);
        if(father == null){
            System.out.println("ERROR: No se ha indicado quien es el padre de la persona");
        }else{
            System.out.println("PADRE:");
            father.showData();
        }
        if(mother == null){
            System.out.println("ERROR: No se ha indicado quien es la madre de la persona");
        }else{
            System.out.println("MADRE:");
            mother.showData();
        }
    }
    
    /**
     * Muestra los datos de los hijos de la persona
     * Si no tiene hijos, se indicara
     */
    public void showChildrenData(){
        if(children.size() == 0){
            System.out.println(name + " no tiene descendencia\n");
        }else{
            System.out.println("Los descendientes de " + name + " son:");
            for(Person descendent : children){
                descendent.showData();
            }
        }
    }
    
    /**
     * Indica si la persona tiene descendencia
     */
    public boolean hasChildrens(){
        return !children.isEmpty();
    }
    
    /**
     * Indica el numero de descendientes de la persona
     */
    public int getNumberOfChildren(){
        return children.size();
    }
    
    /**
     * Indica si la persona tiene hermanos o hermanas
     * Solo si tiene, no el numero de ellos
     */
    public boolean hasBrothers(){
        // El metodo intenta ser simple:
        // Si mi padre o mi madre tienen mas de 1 descendiente...
        // Tengo hermanos. Salvo error de asignacion de datos...
        // si solo tienen 1 hijo, soy yo
        boolean brotherSister = false;
        if(father != null){
            if(father.getNumberOfChildren() > 1){
                brotherSister = true;
            }
        }else if(mother != null){
            if(mother.getNumberOfChildren() > 1){
                brotherSister = true;
            }
        }
        return brotherSister;
    }
}
