import java.util.Scanner;
/**
 * TestPersonajes Aqui, creo un scanner para que el usuario ingrese los datos del personaje dependiendo de los atributos
 * que se le piden, se crea un personaje con los datos ingresados y se imprime la descripcion del personaje
 */

public class TestPersonajes {
    public static void main(String[] args) {
        PersonajesMethod personajesMethod = new PersonajesFactory();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la vida del personaje");
        int vida = sc.nextInt();
        System.out.print("Ingrese el ataque del personaje");
        int ataque = sc.nextInt();
        System.out.print("Ingrese la defensa del personaje");
        int defensa = sc.nextInt();
        System.out.print("Ingrese la inteligencia del personaje");
        int inteligencia = sc.nextInt();
        Personajes personaje = personajesMethod.createPersonajes(vida, ataque, defensa, inteligencia);
        System.out.println(personaje.getDescripcion());
        PersonajesPrototype personajesPrototype = new PersonajesPrototype();

    }
}
