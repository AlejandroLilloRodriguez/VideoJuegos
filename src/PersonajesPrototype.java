
import java.util.HashMap;
/**
    * PersonajesPrototype Aqui, creo un HashMap para almacenar los personajes que se crean, y un metodo para obtener
 * los personajes que se crean, usando el patron de diseño Prototype, para poder clonar los personajes y no tener que crearlos de nuevo.
 */
public class PersonajesPrototype {
    HashMap<String, Personajes> personajesMap= new HashMap<String, Personajes>();
    public PersonajesPrototype(){
        personajesMap.put("Bot", new Bot(100, 10, 10, 0));

    }
    public Personajes getPersonaje(String tipo)throws CloneNotSupportedException{
        return (Personajes) personajesMap.get(tipo).clone();
    }


}
