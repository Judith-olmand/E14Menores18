import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E14Menores18 {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juanito", 18));
        //USO DE GEMINI
        //crea 10, 5 mayores de 18 y 5 menores de 18, salteados
        //personas.add(new Persona("Juanito", 18));
        personas.add(new Persona("Marcos", 25));
        personas.add(new Persona("Lucas", 12));
        personas.add(new Persona("Valentina", 30));
        personas.add(new Persona("Hugo", 15));
        personas.add(new Persona("Beatriz", 42));
        personas.add(new Persona("Sofía", 8));
        personas.add(new Persona("Roberto", 19));
        personas.add(new Persona("Daniela", 17));
        personas.add(new Persona("Mateo", 5));
        personas.add(new Persona("Clara", 21));

        System.out.println("LISTA COMPLETA");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getEdad());
        }

        EliminarMenores18(personas);

        System.out.println();
        System.out.println("LISTA SIN MENORES DE 18");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getEdad());
        }
    }
    public static void EliminarMenores18(List<Persona> personas) {
        Iterator<Persona> iterator = personas.iterator();
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            if (persona.getEdad() < 18) {
                iterator.remove();
            }
        }
    }
}